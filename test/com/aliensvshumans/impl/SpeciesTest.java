package com.aliensvshumans.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Vanessa Haas (GitHub: Nesschen)
 * @Date 19.10.22 23:16
 */
class SpeciesTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	Species species;

	@BeforeEach
	void setUp() {
		species = new Species("Species", 165);

		// next line is used to be able to test the methods which write to the command line
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	void sleep() {
		species.sleep(8);

		assertEquals("Species is sleeping 8 hours ... ZZZzzz ...", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	void eat() {
		species.eat("banana");

		assertEquals("Species is eating banana", outputStreamCaptor.toString().trim());
	}

	@Test
	void dies() {
		species.dies();

		assertEquals(false, species.isAlive());
		assertEquals("Species has died. RIP!", outputStreamCaptor.toString().trim());
	}

	@Test
	void getName() {
		assertEquals("Species", species.getName());
	}

	@Test
	void setName() {
		species.setName("Test");

		assertEquals("Test", species.getName());
	}

	@Test
	void getHeight() {
		assertEquals(165, species.getHeight());
	}

	@Test
	void setHeight() {
		species.setHeight(175);

		assertEquals(175, species.getHeight());
	}

	@AfterEach
	void tearDown() {
		System.setOut(standardOut);
	}
}