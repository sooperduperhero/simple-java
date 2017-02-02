package com.simple.service;

import java.util.ArrayList;
import java.util.List;

import com.simple.model.Employee;
import com.simple.model.math.Int;
import com.simple.model.math.Num;
import com.simple.model.math.Vector;

public class BusineessLogic
{
	public void applyIncreaments(final List<? extends Employee> employees)
	{
		for (final Employee emp : employees)
		{
			emp.setSalary(emp.getSalary() + 1000);
		}
	}

	public List<? super Int> getA()
	{
		final List<Int> ints = new ArrayList<Int>();
		return ints;
	}

	public List<? super Int> doA()
	{
		final List<Num> nums = new ArrayList<Num>();
		final List<? extends Int> ints = new ArrayList<Vector>();

		final List<? super Vector> a2 = getA();

		final List<?> nums2 = doB(ints);
		// nums.
		return nums;

	}

	public List<? extends Num> doB(final List<? extends Int> in)
	{
		final ArrayList<? extends Int> a1 = new ArrayList<Vector>();

		final List<Vector> ints = null;
		return ints;
	}
}
