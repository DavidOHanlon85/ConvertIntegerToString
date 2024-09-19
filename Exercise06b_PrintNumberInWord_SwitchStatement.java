/**
 * 
 */
package labExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise06b_PrintNumberInWord_SwitchStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput = userInput();
		printNumberAsWord(userInput);

	}
	
	/**
	 * This method collects user integer input
	 * 
	 * @return - Return user integer input
	 */
	public static int userInput() {
		// Instantiate Scanner
		
		Scanner myScan = new Scanner(System.in);
		
		// Declare Variables
		
		int userInput = 0;
		
		// Prompt User
		try {
		System.out.println("What number would you like to convert to a word?");
		userInput = myScan.nextInt();
		myScan.nextLine();
		myScan.close();
		} catch (Exception ex) {
			System.out.println("Rerun and input integer please");
		}
		return userInput;
		
	}
	
	/**
	 * This method prints out an integer input to it's string form
	 * 
	 * @param numberInput - Number inputed by user
	 */

	public static void printNumberAsWord(int userInput) {
		
		switch (userInput) {
		case 1: 
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
		
	}

}
