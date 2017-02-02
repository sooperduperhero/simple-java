package com.simple.model.math;

public class Int extends Num
{
	private final int val;

	public Int(final int val)
	{
		this.val = val;
	}

	@Override
	public int intValue()
	{
		return val;
	}
}
