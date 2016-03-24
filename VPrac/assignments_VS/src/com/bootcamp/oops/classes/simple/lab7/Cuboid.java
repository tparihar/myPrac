package com.bootcamp.oops.classes.simple.lab7;

/**
 * 
 * @author Boot Camp User 011
 *
 */
public class Cuboid {

	private int length;
	private int width;
	private int height;

	public Cuboid(int length, int width, int height) {

		setLength(length);
		setWidth(width);
		setHeight(height);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
