package com.shell.console.basicFunctions;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @Class Display
 * stores the display methods used in the program
 */
public class Display {
	private static Scanner displayStringScanner = new Scanner(System.in); //String
	private static Scanner displayIntegerScanner = new Scanner(System.in); //Integer
	private static int displayBatchCount = 0;
	
	/*
	 * @Function getNextBatchCount
	 * Gets the next batch count
	 * Initially starts at 0
	 * Increments each time its called
	 */
	private static int getNextBatchCount(){
		return displayBatchCount++;
	}
	
	/*
	 * @Function messageDisplay
	 * Allows user to input anything onto the shell and it will be displayed
	 * as a specialized message
	 */
	public static void messageDisplay() {
		System.out.print("ENTER ANYTHING TO DISPLAY ONTO SHELL:");
		String displayedValue = displayStringScanner.nextLine();
		System.out.println("YOU HAVE DISPLAYED MESSAGE! ~ "+displayedValue);
	}
	
	/*
	 * @Function batchDisplay
	 * Allows user to enter any amount of varying inputs and displays it as a batch
	 * The batch count gets increased each time the user calls this function 
	 */
	public static void batchDisplay() {
		System.out.print("enter the amount of inputs to take: ");
		int displayCount = displayIntegerScanner.nextInt();
		ArrayList<String> displayStack = new ArrayList<>();
		for(int r=0;r<displayCount;r++) {
			System.out.print("ENTER CONTENT TO DISPLAY: ");
			String displayedInput = displayStringScanner.nextLine();
			displayStack.add(displayedInput);
		}
		System.out.println("YOU HAVE DISPLAYED BATCH "+getNextBatchCount()+"!");
		displayStack.forEach((n)-> System.out.println(n));
	}
}

