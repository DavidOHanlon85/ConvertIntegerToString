/**
 * 
 */
package labExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise06a_PrintNumberInWord_IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userInput = numberToBePrinted();
		printNumberInWord(userInput);

	}

	/**
	 * This method collects user integer input
	 * 
	 * @return - Return user integer input
	 */
	public static int numberToBePrinted() {

		int userInput = 0;

		try {
			// Instantiate Scanner

			Scanner myScan = new Scanner(System.in);

			// Prompt User

			System.out.println("What number would you like to convert to a word?");

			// User Input

			userInput = myScan.nextInt(); // collect user int
			myScan.nextLine(); // clear scanner
			myScan.close();

		} catch (Exception ex) {
			System.out.println("Invalid input");
		}
		return userInput;
	}

	/**
	 * This method prints out an integer input to it's string form
	 * 
	 * @param numberInput - Number inputed by user
	 */

	public static void printNumberInWord(int numberInput) {
		if (numberInput == 1) {
			System.out.println("ONE");
		} else if (numberInput == 2) {
			System.out.println("TWO");
		} else if (numberInput == 3) {
			System.out.println("THREE");
		} else if (numberInput == 4) {
			System.out.println("FOUR");
		} else if (numberInput == 5) {
			System.out.println("FIVE");
		} else if (numberInput == 6) {
			System.out.println("SIX");
		} else if (numberInput == 7) {
			System.out.println("SEVEN");
		} else if (numberInput == 8) {
			System.out.println("EIGHT");
		} else if (numberInput == 9) {
			System.out.println("NINE");
		} else if (numberInput < 1 || numberInput > 9) {
			System.out.println("OTHER");
		} else {
			System.out.println("Please run the program again!");
		}
	}
}
