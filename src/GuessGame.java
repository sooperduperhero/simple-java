import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessGame
{

	public static void main(final String[] args)
	{
		int max = 10;
		if (args.length > 0)
		{
			try
			{
				max = Integer.parseInt(args[0]);
			} catch (final NumberFormatException ne)
			{
				throw new RuntimeException("wrong cmd line param");
			}

		}
		// This will generate a random number that we call it a magicNumber.
		final Random rnd = new Random(System.currentTimeMillis());
		final int magicNumber = rnd.nextInt(max);

		System.out.println("I have a secret number, can you guess it !!!");

		boolean gameFinished = false;
		int typedNumber;

		// Loop until gameFinished
		while (!gameFinished)
		{
			System.out.print("Guess my number ? ");
			typedNumber = readNumber();

			// Compare magicNumber with typedNumber. The big diamond in flow
			// diagram drawn.
			if (magicNumber == typedNumber)
			{
				System.out.println("U won.. U guessed it !");
				gameFinished = true;
			}

			if (magicNumber < typedNumber)
			{
				System.out.println("Sorry ! It is LESS, try again");
			}

			if (magicNumber > typedNumber)
			{
				System.out.println("Sorry ! It is GREATER, try again");
			}
		}
	}

	// This will read the player typed number
	private static int readNumber()
	{
		try
		{
			final BufferedReader console = new BufferedReader(
					new InputStreamReader(System.in));
			final String val = console.readLine();
			return Integer.parseInt(val);
		} catch (final IOException e)
		{
			e.printStackTrace();
			return -1;
		}
	}
}
