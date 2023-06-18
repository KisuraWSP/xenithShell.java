package com.xenith;

/**
 * @author Kisura W.S.P
 */


/*
 * @Import Statements
 */
import java.util.Scanner;
import com.xenith.library.*;

/*
 * @Class Main
 * @Implements Syntax
 */
public class XenithShellApp implements Syntax {
	public static void main(String[] args) {
		try {
			/*
			 * Variables
			 */
			Scanner normalPromptValueScanner = new Scanner(System.in); //String
			boolean isRunning = true;
			/*
			 * Objects allocated into program
			 */
			NameSpace namespace = new NameSpace();
			SimpCalc simpcalc = new SimpCalc();
			MultCalc multcalc = new MultCalc();
			Display display = new Display();
			
			/*
			 * Program Loop
			 * Only terminates if undefined keyword entered or More than 25 characters entered into the prompt
			 */
			BasicPrintFunctions.welcomeMessageFunction();
			while(isRunning) {
				System.out.print(namespace.getNameSpace()+":/>");
				String linePrompt = normalPromptValueScanner.nextLine();
				if(linePrompt.length()<=25) {
					switch(linePrompt) {
					case stopShellKeyword:
						isRunning = false;
						BasicPrintFunctions.exitMessageFunction();
						break;
					case printKeyword:
						display.singleLineMessage();
						BasicPrintFunctions.emptySpaceFunction();
						break;
					case printManyKeyword:	
						display.multiLineMessage();
						BasicPrintFunctions.emptySpaceFunction();
						break;
					case printBatchKeyword:
						display.batchMessage();
						BasicPrintFunctions.emptySpaceFunction();
						break;
					case basicCalculatorInterfaceKeyword:
						simpcalc.simpCalcInterface();
						BasicPrintFunctions.emptySpaceFunction();
						break;
					case BatchCalculatorInterfaceKeyword:
						multcalc.multiCalculatorInterface();
						BasicPrintFunctions.emptySpaceFunction();
						break;
					case nameSpaceSetKeyword:
						System.out.print("Changing namespace from \'"+namespace.getNameSpace()+ "\' to: ");
						String name = normalPromptValueScanner.nextLine();
						namespace.setNameSpace(name);
						break;
					case throwableErrorsListKeyword:
						BasicPrintFunctions.possibleErrorList();
						break;
					case printEmptySpaceKeyword:
						BasicPrintFunctions.emptySpaceFunction();
						break;
					case printBatchEmptySpaceKeyword:
						BasicPrintFunctions.batchEmptySpaceFunction();
						break;
					case helpKeyword:
						BasicPrintFunctions.help();
						break;
					default:
						normalPromptValueScanner.close();
						throw new ErrorMessages("KeywordDoesntExistPrompt EXCEPTION!!\nKeyword ~(Syntax) entered doesn't exist in the shell");
					}
				}else {
					System.out.println("AMOUNT OF CHARACTERS ENTERED TO PROMPT: " + display.returnCharacterCount(linePrompt));
					normalPromptValueScanner.close();
					throw new ErrorMessages("CharacterPrompt EXCEPTION!!\nCannot enter more than 25 characters");
				}
			}
			normalPromptValueScanner.close();
		}catch(ErrorMessages msg) {
			// respective Error is displayed
			System.out.println(msg.getMessage());
		}
	}
}
