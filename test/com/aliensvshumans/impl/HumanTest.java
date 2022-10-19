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
class HumanTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	Human human;

	@BeforeEach
	void setUp() {
		human = new Human("Alfred", 175, "male");

		// next line is used to be able to test the methods which write to the command line
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	void speak() {
		human.speak("Hello Universe!");

		assertEquals("Alfred says: Hello Universe!", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	void getSex() {
		assertEquals("male", human.getSex());
	}

	@Test
	void setSex() {
		human.setSex("female");

		assertEquals("female", human.getSex());
	}

	@AfterEach
	void tearDown() {
		System.setOut(standardOut);
	}
}