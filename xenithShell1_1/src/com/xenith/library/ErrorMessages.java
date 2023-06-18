package com.xenith.library;

/**
 * @author Kisura W.S.P
 */

/*
 * @Class ErrorMessages
 */
@SuppressWarnings("serial")
public class ErrorMessages extends Exception{
	/**
	 * @method ErrorMessages
	 * @type Constructor
	 * @Description
	 * - displays the error messages according to the error
	 */
	public ErrorMessages(String message) {
		super(message);
	}
	
	/* list of errors we detect
	 * ============================================================================================
	 * "ModePromptFailure EXCEPTION!!\nInvalid Value for mode prompt has been entered"
	 * "CharacterPrompt EXCEPTION!!\nCannot enter more than 25 characters"
	 * "KeywordDoesntExistPrompt EXCEPTION!!\\nKeyword ~(Syntax) entered doesn't exist in the shell"
	 * ============================================================================================
	 */
}
