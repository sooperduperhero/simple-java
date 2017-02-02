package com.simple.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SuperFoo
{
	public static void main(final String args[])
	{
		// final NavigableMap<Integer, String> map = new TreeMap<Integer,
		// String>();
		final NavigableSet<Integer> set = new TreeSet<Integer>();
		for (int i = 1; i < 10; i++)
		{
			set.add(i);
		}

		System.out.println(set.headSet(3));
		System.out.println(set.headSet(3, true));

		final Set<Integer> hs = set.tailSet(3);
		System.out.println(hs);
		System.out.println(set.tailSet(3, false));

		System.out.println(set.lower(3));
		System.out.println(set.higher(3));

		System.out.println(set.ceiling(-3));
		System.out.println(set.floor(30));

		final List<String> list = new ArrayList<String>()
		{
			{
				add("hello");
				add("hai");
				add("there");
			}
		};

		System.out.println(list);
	}
}
