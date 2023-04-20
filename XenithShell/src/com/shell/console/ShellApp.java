package com.shell.console;

//shell program
//executable file

import java.util.Scanner;
import com.shell.console.basicFunctions.Display;
import com.shell.console.basicFunctions.MultCalc;
import com.shell.console.basicFunctions.SimpCalc;
import com.shell.console.dependancies.ZHQnQQp2VOgxXI;
import com.shell.console.dependancies.BasicPrintMessageFunctions;
import com.shell.console.dependancies.ShellException;
import com.shell.console.keywords.Syntax;
import com.shell.console.keywords.ExtendedSyntax;

/*
 * @Class ShellApp
 * main executable file 
 * child of ShellException Class
 * implements the Syntax & Extended Syntax interfaces
 */
public class ShellApp extends ShellException implements Syntax, ExtendedSyntax{
	private static Scanner normalPromptValueScanner = new Scanner(System.in); //String
	private static Scanner integerValueScanner = new Scanner(System.in); //Integer
	private static boolean isRunning = true;
	
	public static void main(String[] args) {
		new BasicPrintMessageFunctions().WelcomeMessageFunction();
		while(isRunning) {
			System.out.print("LOG:\\>");
			String xenithPrompt = normalPromptValueScanner.nextLine();
			if(xenithPrompt.length()<=25) {
				if (xenithPrompt.equals(stopShell) || xenithPrompt.equals(stopShell_u)) {
					isRunning = false;
					new BasicPrintMessageFunctions().ExitMessageFunction();					
				
				}else if(xenithPrompt.equals(messageDisplay) || xenithPrompt.equals(messageDisplay_u)) {
					Display.messageDisplay();
					new BasicPrintMessageFunctions().EmptySpaceFunction();
				
				}else if(xenithPrompt.equals(batchDisplay) || xenithPrompt.equals(batchDisplay_u)) {
					Display.batchDisplay();
					new BasicPrintMessageFunctions().EmptySpaceFunction();
				
				}else if(xenithPrompt.equals(multipleCalculation) || xenithPrompt.equals(multipleCalculation_u)) {
					System.out.println("1: Addition");
					System.out.println("2: Multiplication");
					System.out.print("ENTER MATH PROMPT:");
					int mathPrompt = integerValueScanner.nextInt();
						switch(mathPrompt) {
							case 1:
							    MultCalc.multAddition();
							    break;				
							case 2:
								MultCalc.multMultiplication();
								break;
							default:								
								new ShellException().modePromptFailure();
								isRunning = false;								
					    }
						new BasicPrintMessageFunctions().EmptySpaceFunction();				
				
				}else if(xenithPrompt.equals(simpleCalculation) || xenithPrompt.equals(simpleCalculation_u)) {
					SimpCalc.Calculator();
					new BasicPrintMessageFunctions().EmptySpaceFunction();			
				
				}else if(xenithPrompt.equals(emptyLine) || xenithPrompt.equals(emptyLine_u)) {
					new BasicPrintMessageFunctions().EmptySpaceFunction();
				
				}else if(xenithPrompt.equals(batchEmptyLine) || xenithPrompt.equals(batchEmptyLine_u)) {
					new BasicPrintMessageFunctions().BatchEmptySpaceFunction();	
				
				}else if(xenithPrompt.equals(eUz0d8)) {
					ZHQnQQp2VOgxXI.ypJf0My();
					new BasicPrintMessageFunctions().EmptySpaceFunction();		
				
				}else if(xenithPrompt.equals(NeAGG97)) {	
					ZHQnQQp2VOgxXI.dyIKSC2();
					new BasicPrintMessageFunctions().EmptySpaceFunction();			
				
				}else if(xenithPrompt.equals(Gh36o7dJ)) {
					ZHQnQQp2VOgxXI.kWgIHK();
					new BasicPrintMessageFunctions().EmptySpaceFunction();		
				
				}else if(xenithPrompt.equals(b17vyCp)){
					ZHQnQQp2VOgxXI.XKs81Lr();
					new BasicPrintMessageFunctions().EmptySpaceFunction();		
				
				}else if(xenithPrompt.equals(Ze60aD)){
					ZHQnQQp2VOgxXI.w2vg2o();
					new BasicPrintMessageFunctions().EmptySpaceFunction();			
				
				}else if(xenithPrompt.equals(diXx9pJh)) {
					ZHQnQQp2VOgxXI.qvjXbtZ();
					new BasicPrintMessageFunctions().EmptySpaceFunction();			
				
				}else if(xenithPrompt.equals(Un6Pf2)) {
					ZHQnQQp2VOgxXI.t9AGDq();
					new BasicPrintMessageFunctions().EmptySpaceFunction();		
				
				}else if(xenithPrompt.equals(NanhOO)) {
					ZHQnQQp2VOgxXI.rIlTGA4();
					new BasicPrintMessageFunctions().EmptySpaceFunction();		
				
				}else if(xenithPrompt.equals(I8skz6U)) {
					ZHQnQQp2VOgxXI.IqsXulw();
					new BasicPrintMessageFunctions().EmptySpaceFunction();		
				
				}else if(xenithPrompt.equals(ed2jdEQRlc4h)) {
					ZHQnQQp2VOgxXI.yq0igd();
					new BasicPrintMessageFunctions().EmptySpaceFunction();	
				
				}else if(xenithPrompt.equals(YGlsAq3WwI)) {
					ZHQnQQp2VOgxXI.jiGAvw();
					new BasicPrintMessageFunctions().EmptySpaceFunction();	    
				
				}else if(xenithPrompt.equals(help) || xenithPrompt.equals(help_u)) {
					BasicPrintMessageFunctions.help();
				
				}else if(xenithPrompt.equals(creator) || xenithPrompt.equals(creator_full)) {
					BasicPrintMessageFunctions.creatorMessage();
					new BasicPrintMessageFunctions().EmptySpaceFunction();
					
				}
				else { 
					new ShellException().nonExistantKeyword();					
					break;
				}
			
			}else {
				new ShellException().characterLengthFailure();
				new BasicPrintMessageFunctions().ExitMessageFunction();
				isRunning = false;
			}
		}
	}
}
