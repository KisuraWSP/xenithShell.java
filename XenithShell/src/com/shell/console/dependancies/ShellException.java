package com.shell.console.dependancies;

/*
 * @Class ShellException
 * these are displayed when a specific error occurs
 */
public class ShellException {
	public void modePromptFailure() {
		System.out.println("ModePromptFailure EXCEPTION!!\nInvalid Value for mode prompt has been entered");
	}
	public void characterLengthFailure() {
		System.out.println("CharacterPrompt EXCEPTION!!\nCannot enter more than 25 characters");
	}
	public void nonExistantKeyword() {
		System.out.println("KeywordDoesntExistPrompt Exception\\nKeyword ~(Syntax) entered doesn\\\\'t exist in the shell");
	}
	
}

