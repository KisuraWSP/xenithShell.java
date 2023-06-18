package com.xenith.library;

/**
 * @author Kisura W.S.P
 */


/*
 * @Interface Syntax
 */
public interface Syntax {
	String defaultNamespace="System";
	
	String printKeyword = "display-message!";
	String printManyKeyword = "display-multi!";
	String printBatchKeyword = "display-batch!";
	String basicCalculatorInterfaceKeyword = "simpcalc!";
	String BatchCalculatorInterfaceKeyword = "multcalc!";
	String nameSpaceSetKeyword = "setNamespace!";
	String throwableErrorsListKeyword = "whatThrows!";
	String stopShellKeyword = "stop!";
	String printEmptySpaceKeyword = "EMPTY";
	String printBatchEmptySpaceKeyword = "BATCH-EMPTY";
	String helpKeyword = "help!";
}
