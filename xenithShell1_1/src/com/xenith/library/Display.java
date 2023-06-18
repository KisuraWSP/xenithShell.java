package com.xenith.library;

/**
 * @author Kisura W.S.P
 */


/*
 * @Import Statements
 */
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @Class Display
 */
public class Display {
	/**
	 * @Variable Declarations
	 * @Access-Modifier {private}
	 */
	private String userMessage;
	private static int batchCount = 0;
	private Scanner display_stringScanner = new Scanner(System.in);
	private Scanner display_integerScanner = new Scanner(System.in);
	private ArrayList<String> batchStack = new ArrayList<>();
		
	/**
	 * @Access-Modifier {private}
	 * @Function-Type {Setter}
	 * @Function-Name setUserMessage
	 * @Param message
	 * 
	 * @Description
	 * - Set the value of message into the userMessage parameter defined by the class
	 */
	private void setUserMessage(String message) {
		this.userMessage = message;
	}	

	/**
	 * @Access-Modifier {private}
	 * @Function-Type {getter}
	 * @Function-Name getUserMessage
	 * @Return-Type {string}
	 * 
	 * @Description
	 * -Gets the value of the userMessage
	 */
	private String getUserMessage() {
		return userMessage;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function-Type {static}
	 * @Function-Name getCurrentBatchCount
	 * @Return-Type {integer}
	 * 
	 * @Description
	 * - Gets the current value of the batchCount
	 */
	private static int getCurrentBatchCount() {
		return batchCount;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function-Type {static}
	 * @Function-Name updateBatchCount
	 * @Return-Type {integer}
	 * 
	 * @Description
	 * - Increments the batchCount for the next batch
	 */
	private static int updateBatchCount() {
		return batchCount++;
	}	
	
	/**
	 * @Access-Modifier {public}
	 * @Function-Type {static}
	 * @Function-Name returnCharacterCount
	 * @Param message
	 * @Return-Type {integer}
	 * 
	 * @Description
	 * -Takes the message and returns the number of characters in it, without any white spaces
	 */
	public int returnCharacterCount(String message){
		int characterCount = 0;		
		for(int i=0;i<message.length();i++) {
			if(message.charAt(i)!=' ') {
				characterCount++;
			}
		}	
		return characterCount;
	}
	
	/**
	 * @Access-Modifier {public}
	 * @Function-Name singleLineMessage
	 * 
	 * @Description
	 * -Asks the user to enter any message and it is displayed onto the screen
	 */
	public void singleLineMessage() {
		System.out.print("ENTER MESSAGE TO DISPLAY: ");
		String userInput = display_stringScanner.nextLine();
		setUserMessage(userInput);
		System.out.println("YOU HAVE DISPLAYED MESSAGE! ~ "+getUserMessage());
	}
	
	/**
	 * @Access-Modifier {public}
	 * @Function-Name multiLineMessage
	 * 
	 * @Description
	 * -Asks the user to enter the number of messages they want to enter and it is displayed onto the screen
	 * -along with the count
	 */
	public void multiLineMessage() {
		System.out.print("ENTER NUMBER OF LINES TO ENTER: ");
		int lineCount=display_integerScanner.nextInt();
		for(int i=0;i<lineCount;i++) {
			singleLineMessage();
		}
		System.out.println("NUMBER OF LINES PRINTED: "+lineCount);
	}
	
	/**
	 * @Access-Modifier {public}
	 * @Function-Name batchMessage
	 * 
	 * @Description
	 * -Displays the current batch number of the message, then asks the user to enter the number of messages they want
	 * -to enter, then it stores the messages into an arrayList and displays the entire batch as a single message
	 */
	public void batchMessage() {
		System.out.println("CURRENT BATCH NO: "+getCurrentBatchCount());
		System.out.print("ENTER NUMBER OF LINES TO ENTER: ");
		int lineCount=display_integerScanner.nextInt();
		for(int i=0;i<lineCount;i++) {
			System.out.print("ENTER MESSAGE TO STORE: ");
			String userInput = display_stringScanner.nextLine();
			batchStack.add(userInput);
		}
		System.out.println("YOU HAVE STORED: "+lineCount);
		System.out.println("YOU ARE VIEWING BATCH: "+getCurrentBatchCount());
		for(String j: batchStack) {
			System.out.println("Value at Line "+batchStack.indexOf(j)+":"+j);
		}
		updateBatchCount();
	}
}
