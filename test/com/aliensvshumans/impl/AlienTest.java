package com.aliensvshumans.impl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Vanessa Haas (GitHub: Nesschen)
 * @Date 19.10.22 23:15
 */
class AlienTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	Alien alien;

	@BeforeEach
	void setUp() {
		alien = new Alien("Paul", 135, "Telekinesis");

		// next line is used to be able to test the methods which write to the command line
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	void useSuperpower() {
		alien.useSuperpower();

		assertEquals("Paul uses its superpower Telekinesis", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	void getSuperpower() {
		assertEquals("Telekinesis", alien.getSuperpower());
	}

	@Test
	void setSuperpower() {
		alien.setSuperpower("Invisibility");

		assertEquals("Invisibility", alien.getSuperpower());
	}

	@AfterEach
	void tearDown() {
		System.setOut(standardOut);
	}
}