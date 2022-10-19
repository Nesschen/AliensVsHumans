package com.aliensvshumans.impl;

/**
 * @Author Vanessa Haas (GitHub: Nesschen)
 * @Date 19.10.22 22:28
 */
public class Alien extends Species {
	private String superpower;

	public Alien(String name, int height, String superpower) {
		super(name, height);
		this.superpower = superpower;
	}

	public void useSuperpower() {
		System.out.println(this.getName() + " uses its superpower " + this.getSuperpower());
	}

	public String getSuperpower() {
		return superpower;
	}

	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
}
