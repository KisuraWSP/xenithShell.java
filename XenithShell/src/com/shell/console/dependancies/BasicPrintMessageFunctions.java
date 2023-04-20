package com.shell.console.dependancies;

import java.util.Scanner;

/*
 * @Class BasicPrintMessageFunctions
 * Stores the methods that are used for output onto the console
 */

public class BasicPrintMessageFunctions {
	Scanner batchScanner = new Scanner(System.in);
	
	public void WelcomeMessageFunction() {
		//displayed at the beginning of shell execution
		System.out.println("===============================================================");
		System.out.println("=    \\\\   //  ______                                          =");
		System.out.println("=     \\\\ //  |        |\\    |  =======  =======  |      |     =");
		System.out.println("=      \\//   |______  | \\   |     |        |     |      |     =");
		System.out.println("=      /\\\\   |        |  \\  |     |        |     |======|     =");
		System.out.println("=     // \\\\  |        |   \\ |     |        |     |      |     =");
		System.out.println("=    //   \\\\ |______  |    \\|  =======     |     |      |     =");
		System.out.println("===============================================================");
		System.out.println("!!WELCOME TO XENITH SHELL!!");
	}
	public void ExitMessageFunction() {
		//displayed at the end of shell execution
		System.out.println("!!XENITH SHELL HAS STOPPED!!");
		System.out.println("===============================================================");
		System.out.println("=                                                             =");
		System.out.println("=      _________  _________    _________     ______           =");
		System.out.println("=     |               |       |         |   |      |          =");
		System.out.println("=     |_________      |       |         |   |______|          =");
		System.out.println("=               |     |       |         |   |                 =");
		System.out.println("=     __________|     |       |_________|   |                 =");
		System.out.println("===============================================================");		
	}
	public void EmptySpaceFunction() {
		//created after each line for shell reading convenience
		System.out.println("~EMPTY SPACE~");
	}
	public void BatchEmptySpaceFunction() {
		//allows user to create any number of empty lines
		System.out.print("enter number of empty lines to print: ");
		int lineNo = batchScanner.nextInt();
		for(int e=0;e<lineNo;e++) {
			EmptySpaceFunction();
		}
	}
	
	//Displays the help message onto the console
	public static void help() {
		System.out.println("Display Message :- \'display-message!\'");
		System.out.println("Display Message as batch :- \'display-batch!\'");
		System.out.println("Basic Calculator :- \'simpcalc!\'");
		System.out.println("Batch Calculator :- \'multcalc!\'");
		System.out.println("Stop the shell :- \'stop!\'");
		System.out.println("To print a empty space :- \'EMPTY\'");
		System.out.println("To print \'n\' Number of lines of empty spaces :- \'BATCH-EMPTY\'");
		System.out.println("Data types");
		System.out.println("\'int':Integer");
		System.out.println("\'dub':Double");
		System.out.println("\'lng':Long");
		System.out.println("\'flt':Float");
		new BasicPrintMessageFunctions().EmptySpaceFunction();
	}
	
	//personalized message
	public static void creatorMessage() {
		System.out.println("Hi, i am Kisura WSP");
		System.out.println("I am the creator of the Xenith Shell Program");
		System.out.println("This program was inspired by a Youtube video based on a custom BASIC shell");
		System.out.println("What the program does is you enter some pre-defined keywords and it will do");
		System.out.println("a specific action");
		System.out.println("All i want to say is");
		System.out.println("Thank you for using my program");
		System.out.println("and feel free to modify it and give your thoughts on it");
	}
}
