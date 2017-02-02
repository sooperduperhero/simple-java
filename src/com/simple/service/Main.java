package com.simple.service;

public class Main
{

	public static void main(final String[] args)
	{
		final int a = 10;
		final Integer i = 12;
		System.out.printf("%d%n", a);
		System.out.printf("%06d%n", a);
		System.out.printf("%x%n", a);
		System.out.printf("%2.2f%n", 12.3);

		System.out.printf("Cost of %d apples, each priced £%- ,20.5f.%n", 5,
				12523433.623);

		System.out.println("hashCode : " + i.hashCode());
		System.out.printf("%h%n", i);

		System.out.printf("%b%n", true);
		System.out.printf("%b%n", false);
		System.out.printf("%b%n", null);

		System.out.printf("%c", 124);

		for (int j = 1; j <= 30; j++)
		{
			if (j % 15 == 0)
			{
				System.out.printf("FizzBuzz%n");
			} else if (j % 3 == 0)
			{
				System.out.printf("Fizz%n");

			} else if (j % 5 == 0)
			{
				System.out.printf("Buzz%n");
			} else
			{
				System.out.printf("%d%n", j);
			}
		}
	}
}
