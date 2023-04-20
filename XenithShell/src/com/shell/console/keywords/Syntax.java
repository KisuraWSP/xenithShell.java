package com.shell.console.keywords;

//keywords (Syntax for shell exist here)
public interface Syntax {
	String messageDisplay = "display-message!";
	String messageDisplay_u = "DISPLAY-MESSAGE!";
	String batchDisplay = "display-batch!";
	String batchDisplay_u = "DISPLAY-BATCH!";
	String simpleCalculation = "simpcalc!";
	String simpleCalculation_u = "SIMPCALC!";
	String multipleCalculation = "multcalc!";
	String multipleCalculation_u = "MULTCALC!";
	String stopShell = "stop!";
	String stopShell_u = "STOP!";
	String emptyLine = "empty";
	String emptyLine_u = "EMPTY";
	String batchEmptyLine ="batch-empty";
	String batchEmptyLine_u ="BATCH-EMPTY";
	String help = "help!";
	String help_u = "HELP!";
	String creator = "kisura";
	String creator_full = "Kisura WSP";
	
	//Data types
	String INTEGER = "int";
	String FLOAT = "flt";
	String LONG = "lng";
	String DOUBLE = "dub";
}
