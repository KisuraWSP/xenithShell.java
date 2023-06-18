package com.xenith.library;

/**
 * @author Kisura W.S.P
 */


/*
 * @Import Statements
 */
import java.util.Scanner;

/*
 * @Class SimpCalc
 */
public class SimpCalc{
	/*
	 * @Variable Declarations
	 */
	private double num1, num2;
	private Scanner simpcalc_integerScanner = new Scanner(System.in);
	private Scanner simpcalc_doubleScanner = new Scanner(System.in);
	
	/**
	 * @Access-Modifier {private}
	 * @Function-Name add
	 * @Param n1, n2
	 * @Return-Type Double
	 */
	private double add(double n1, double n2) {
		return n1 + n2;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function-Name add
	 * @Param n1, n2
	 * @Return-Type Double
	 */
	private double subtract(double n1, double n2) {
		return n1 - n2;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function-Name add
	 * @Param n1, n2
	 * @Return-Type Double
	 */
	private double divide(double n1, double n2) {
		return n1 / n2;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function-Name add
	 * @Param n1, n2
	 * @Return-Type Double
	 */
	private double multiply(double n1, double n2) {
		return n1 * n2;
	}
	
	/**
	 * @Access-Modifier {public}
	 * @Function-Name simpCalcInterface
	 * 
	 * - Displays a simple Calculator interface, from which the user chooses an operation to perform
	 * - displays the output of the specific operation
	 */
	public void simpCalcInterface() {
		System.out.println("1: ADDITION\n2: SUBTRACTION\n3: DIVISION\n4: MULTIPLICATION");
		System.out.print("ENTER THE CHOICE: ");
		int choice = simpcalc_integerScanner.nextInt();
		switch(choice) {
		case 1:
			System.out.print("ENTER num1: ");
			num1 = simpcalc_doubleScanner.nextDouble();
			System.out.print("ENTER num2: ");
			num2 = simpcalc_doubleScanner.nextDouble();
			System.out.println("Addition of "+num1+" & "+num2+" = "+add(num1, num2));
			break;
		case 2:
			System.out.print("ENTER num1: ");
			num1 = simpcalc_doubleScanner.nextDouble();
			System.out.print("ENTER num2: ");
			num2 = simpcalc_doubleScanner.nextDouble();
			System.out.println("Subtraction of "+num1+" & "+num2+" = "+subtract(num1, num2));
			break;
		case 3:
			System.out.print("ENTER num1: ");
			num1 = simpcalc_doubleScanner.nextDouble();
			System.out.print("ENTER num2: ");
			num2 = simpcalc_doubleScanner.nextDouble();
			System.out.println("Division of "+num1+" & "+num2+" = "+divide(num1, num2));
			break;
		case 4:
			System.out.print("ENTER num1: ");
			num1 = simpcalc_doubleScanner.nextDouble();
			System.out.print("ENTER num2: ");
			num2 = simpcalc_doubleScanner.nextDouble();
			System.out.println("Multiplication of "+num1+" & "+num2+" = "+multiply(num1, num2));
			break;
		default:
			System.out.println("YOU ENTERED WRONG CHOICE\nENTER AGAIN\n");
			simpCalcInterface();
		}
	}
}
