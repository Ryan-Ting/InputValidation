
import java.util.Scanner;		// Imports a scanner to read the user's input

/**
 * AP CmpSci 2019-2020
 * Input
 * Universal input validation used for most cases where it is needed.
 * 
 * @author Ryan Ting
 * @version September 11, 2019
 * @see InputTest
 */

public class Input {

	/** The scanner that reads input from the user. */
	private static Scanner keyboard = new Scanner(System.in);

	/**
	 * The readInt method sees if the value in the scanner is an integer.
	 * @param prompt The prompt for the user.
	 * @return The value if it was an integer.
	 */
	public static int readInt(String prompt)
	{
		boolean valid = false;
		int input = 0;		// Declare variables

		do 
		{
			System.out.print(prompt);		// Custom prompt

			if (keyboard.hasNextInt())		// Checks if the input was an int, and stops the while loop with a boolean variable if it was
			{
				input = keyboard.nextInt();
				valid = true;
			}
			else
			{
				System.out.println("Error: Input not an integer");		// Error message	
			}
			keyboard.nextLine();
		}
		while (!valid);

		return input;		//  Returns an int for later use
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * The readDouble method sees if the value in the scanner is an double.
	 * @param prompt The prompt for the user.
	 * @return The value if it was an double.
	 */
	public static double readDouble(String prompt)
	{
		boolean valid = false;		// Declare variables
		double input = 0;

		do 
		{
			System.out.print(prompt);		// Custom prompt

			if (keyboard.hasNextDouble())		// Checks if the input was a double, and stops the while loop with a boolean variable if it was
			{
				input = keyboard.nextDouble();
				valid = true;
			}
			else
			{
				System.out.println("Error: Input not an double type");		// Error message
			}
			keyboard.nextLine();
		}
		while (!valid);

		return input;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * The readNum method sees if the value in the scanner is below a maximum value.
	 * @param prompt The prompt for the user.
	 * @param max The maximum value.
	 * @return The value if it met the criteria.
	 */
	public static int readNum (String prompt, int max)
	{
		int input = max + 1;		// Declare variables

		do
		{
			System.out.print(prompt);		// Custom prompt																																																																																				potato

			if (keyboard.hasNextInt())		// Input validation
			{
				input = keyboard.nextInt();

				if (input > max)
				{
					System.out.println("Error: input not below the max (" + max + ")");
				}
			}
			else
			{
				System.out.println("Error: Input not an integer");		// Error message		
			}
			keyboard.nextLine();
		}
		while (input > max);		// Stops the loop if the value inputted was less than or equal to the preset max

		return input;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * The readNum method sees if the value in the scanner is below a maximum value.
	 * @param prompt The prompt for the user.
	 * @param max The maximum value.
	 * @return The value if it met the criteria.
	 */
	public static double readNum (String prompt, double max)
	{
		double input = max + 1.0;		// Declare variables

		do
		{
			System.out.print(prompt);		// Custom prompt

			if (keyboard.hasNextDouble())		// Input validation
			{
				input = keyboard.nextDouble();

				if (input > max)
				{
					System.out.println("Error: input not below the max (" + max + ")");
				}
			}
			else
			{
				System.out.println("Error: Input not an double");		// Error message
			}
			keyboard.nextLine();
		}
		while (input > max);		// Stops the loop if the value inputted was less than or equal to the preset max

		return input;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * The readNum method sees if the value in the scanner is above a minimum value.
	 * @param min The minimum value.
	 * @param prompt The prompt for the user.
	 * @return The value if it met the criteria.
	 */
	public static int readNum (int min, String prompt)
	{
		int input = min - 1;		// Declare variables

		do
		{
			System.out.print(prompt);		// Custom prompt

			if (keyboard.hasNextInt())		// Input validation
			{
				input = keyboard.nextInt();

				if (input < min)
				{
					System.out.println("Error: input not above the minimum (" + min + ")");
				}
			}
			else
			{
				System.out.println("Error: Input not an integer");		// Error message
			}
			keyboard.nextLine();
		}
		while (input < min);		// Stops the loop if the value inputted was greater than or equal to the preset min

		return input;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * The readNum method sees if the value in the scanner is above a minimum value.
	 * @param min The minimum value.
	 * @param prompt The prompt for the user.
	 * @return The value if it met the criteria.
	 */
	public static double readNum (double min, String prompt)
	{
		double input = min - 1.0;		// Declare variables

		do
		{
			System.out.print(prompt);		// Custom prompt

			if (keyboard.hasNextDouble())		// Input validation
			{
				input = keyboard.nextDouble();

				if (input < min)
				{
					System.out.println("Error: input not above the minimum (" + min + ")");
				}
			}
			else
			{
				System.out.println("Error: Input not an double");		// Error message
			}
			keyboard.nextLine();
		}
		while (input < min);		// Stop the loop if the value inputted was greater than or equal to the preset min

		return input;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
 * The readNum method sees if the value in the scanner is in between two values.
 * @param prompt The prompt for the user.
 * @param min The minimum value.
 * @param max The maximum value.
 * @return The value if it met the criteria.
 */
	public static int readNum (String prompt, int min, int max)
	{
		int input = max + 1;		// Declare variables
		
		if (max >= min)
		{
			do
			{
				System.out.print(prompt);		// Custom prompt

				if (keyboard.hasNextInt())		// Input validation
				{
					input = keyboard.nextInt();

					if (input < min || input > max)
					{
						System.out.println("Error: input not in between the specified values (" + min + " and " + max + ")");
					}

				}
				else
				{
					System.out.println("Error: Input not an integer");		// Error message

				}
				keyboard.nextLine();
			}
			while (input < min || input > max);		// Stop the loop if the value inputted was in between the two preset values
		}
		else
		{
			System.out.println("Error: Min was greater than Max");
		}
		return input;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * The readNum method sees if the value in the scanner is in between two values.
	 * @param prompt The prompt for the user.
	 * @param max The maximum value.
	 * @param min The minimum value.
	 * @return The value if it met the criteria.
	 */
	public static double readNum (String prompt, double min, double max)
	{
		double input = max + 1.0;		// Declare variables

		if (max >= min)
		{
			do
			{
				System.out.print(prompt);		// Custom prompt

				if (keyboard.hasNextDouble())		// Input validation
				{
					input = keyboard.nextDouble();

					if (input < min || input > max)
					{
						System.out.println("Error: input not in between the specified values  (" + min + " and " + max + ")");
					}
				}
				else
				{
					System.out.println("Error: Input not a double");		// Error message

				}
				keyboard.nextLine();
			}
			while (input < min || input > max);
		}
		else
		{
			System.out.println("Error: Min was greater than Max");
		}
		return input;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * The readNum method sees if the value in the scanner is above a minimum or below a maximum.
	 * @param prompt The prompt for the user.
	 * @param limit The minimum value.
	 * @param minMax The maximum value.
	 * @return The value if it met the criteria.
	 */
	public static int readNum(String prompt, int limit, boolean minMax)
	{
		boolean valid = false;		// Declare variables
		int input = 0;

		do
		{
			System.out.print(prompt);		// Custom prompt

			if (keyboard.hasNextInt())		// Input validation
			{
				input = keyboard.nextInt();

				if (minMax)		// First checks if the code needs to test if the input was above a min or below a max,
				{

					if (input >= limit)
					{
						valid = true;		//  Then tests it and stops the loop if it is valid
					}
					else
					{
						System.out.println("Error: Input not above the minimum (" + limit + ")");		// Error messages
					}
				}
				else
				{

					if (input <= limit)
					{
						valid = true;
					}
					else
					{
						System.out.println("Error: Input not below the maximum (" + limit + ")");
					}
				}
			}
			else
			{
				System.out.println("Error: Input not an int");
			}
			keyboard.nextLine();
		}
		while (!valid);

		return input;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * The readNum method sees if the value in the scanner is above a minimum or below a maximum.
	 * @param prompt The prompt for the user.
	 * @param limit The minimum value.
	 * @param minMax The maximum value.
	 * @return The value if it met the criteria.
	 */
	public static double readNum(String prompt, double limit, boolean minMax)
	{
		boolean valid = false;		// Declare variables
		double input = 0;

		do
		{
			System.out.print(prompt);		// Custom prompt

			if (keyboard.hasNextDouble())		// Input validation
			{
				input = keyboard.nextDouble();

				if (minMax)		// First checks if the code needs to test if the input was above a min or below a max,
				{
					if (input >= limit)
					{
						valid = true;		//  Then tests it and stops the loop if it is valid
					}
					else
					{
						System.out.println("Error: Input not above the minimum (" + limit + ")");		// Error messages
					}
				}
				else
				{
					if (input <= limit)
					{
						valid = true;
					}
					else
					{
						System.out.println("Error: Input not below the maximum (" + limit + ")");
					}
				}
			}
			else
			{
				System.out.println("Error: Input not a double");
			}
			keyboard.nextLine();
		}
		while (!valid);

		return input;
	}
}
