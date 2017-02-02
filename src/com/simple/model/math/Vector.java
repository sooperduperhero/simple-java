package com.simple.model.math;

public class Vector extends Int
{
	private final int dir;

	public Vector(final int val, final int dir)
	{
		super(val);
		this.dir = dir;
	}

	public int getDir()
	{
		return dir;
	}

}
