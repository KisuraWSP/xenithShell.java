package com.xenith.library;

/**
 * @author Kisura W.S.P
 */

/*
 * @Import Statements
 */

import java.util.Scanner;

/*
 * @Class BasicPrintFunctions
 */
public class BasicPrintFunctions {
	/*
	 * @Variables
	 */
	private static Scanner batchScanner = new Scanner(System.in);
	
	/**
	 * @Function welcomeMessageFunction
	 * @Description
	 * - displays welcome message
	 */
	public static void welcomeMessageFunction() {
		System.out.println("===============================================================");
		System.out.println("=    \\\\   //  ______                                          =");
		System.out.println("=     \\\\ //  |        |\\    |  =======  =======  |      |     =");
		System.out.println("=      \\//   |______  | \\   |     |        |     |      |     =");
		System.out.println("=      /\\\\   |        |  \\  |     |        |     |======|     =");
		System.out.println("=     // \\\\  |        |   \\ |     |        |     |      |     =");
		System.out.println("=    //   \\\\ |______  |    \\|  =======     |     |      |     =");
		System.out.println("===============================================================");
		System.out.println("!!WELCOME TO XENITH SHELL!!");
		System.out.println("Version 1.1");
	}
	
	/**
	 * @Function emptySpaceFunction
	 * @Description
	 * - prints the word "~EMPTY SPACE~" into the program
	 */
	public static void emptySpaceFunction() {
		System.out.println("~EMPTY SPACE~");
	}
	
	/**
	 * @Function batchEmptySpaceFunction
	 * @Description
	 * - asks user to enter number of "~EMPTY SPACE~" they want to see
	 */
	public static void batchEmptySpaceFunction() {
		System.out.print("enter number of empty lines to print: ");
		int lineNo = batchScanner.nextInt();
		for(int e=0;e<lineNo;e++) {
			emptySpaceFunction();
		}
	}
	
	/**
	 * @Function exitMessageFunction
	 * @Description
	 * - displays at the end of the program execution
	 */
	public static void exitMessageFunction() {
		System.out.println("!!XENITH SHELL HAS STOPPED!!");
		System.out.println("===============================================================");
		System.out.println("=      _________  _________    _________     ______           =");
		System.out.println("=     |               |       |         |   |      |          =");
		System.out.println("=     |_________      |       |         |   |______|          =");
		System.out.println("=               |     |       |         |   |                 =");
		System.out.println("=     __________|     |       |_________|   |                 =");
		System.out.println("===============================================================");
	}
	
	/**
	 * @Function help
	 * @Description
	 * - displays the list of commands they can enter in the program
	 */
	public static void help() {
		System.out.println("Display Message :- \'display-message!\'");
		System.out.println("Display Message as batch :- \'display-batch!\'");
		System.out.println("Basic Calculator :- \'simpcalc!\'");
		System.out.println("Batch Calculator :- \'multcalc!\'");
		System.out.println("Namespace Setter :- \'setNamespace!\'");
		System.out.println("Display Possible Errors :- \'whatThrows!\'");
		System.out.println("Stop the shell :- \'stop!\'");
		System.out.println("To print a empty space :- \'EMPTY\'");
		System.out.println("To print \'n\' Number of lines of empty spaces :- \'BATCH-EMPTY\'\n");
		System.out.println("Data types that can be used in the Calculator interface");
		System.out.println("\'int':Integer");
		System.out.println("\'dub':Double");
		System.out.println("\'lng':Long");
		System.out.println("\'flt':Float");
		BasicPrintFunctions.emptySpaceFunction();
	}
	
	/**
	 * @Function possibleErrorList
	 * @Description
	 * - displays all possible errors that the application can throw
	 */
	public static void possibleErrorList() {
		System.out.println("\"ModePromptFailure EXCEPTION!!\\nInvalid Value for mode prompt has been entered\"\n"
				+ "	 * \"CharacterPrompt EXCEPTION!!\\nCannot enter more than 25 characters\"\n"
				+ "	 * \"KeywordDoesntExistPrompt EXCEPTION!!\\\\nKeyword ~(Syntax) entered doesn't exist in the shell\"");
	}
}
