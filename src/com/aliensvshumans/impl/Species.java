package com.aliensvshumans.impl;

/**
 * @Author Vanessa Haas (GitHub: Nesschen)
 * @Date 19.10.22 22:28
 */
public class Species {
	private String name;
	private int height;
	private boolean isAlive;

	public Species(String name, int height) {
		this.name = name;
		this.height = height;
		this.isAlive = true;
	}

	public void sleep(int hours) {
		System.out.println(this.getName() + " is sleeping " + hours + " hours ... ZZZzzz ...");
	}

	public void eat(String food) {
		System.out.println(this.getName() + " is eating " + food);
	}

	public void dies() {
		this.isAlive = false;

		System.out.println(this.getName() + " has died. RIP!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean alive) {
		isAlive = alive;
	}
}
