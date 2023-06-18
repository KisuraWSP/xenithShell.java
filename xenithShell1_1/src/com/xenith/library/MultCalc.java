package com.xenith.library;

/**
 * @author Kisura W.S.P
 */


/*
 * @Import Statements
 */
import java.util.Scanner;

/*
 * @Class MultCalc
 */
public class MultCalc implements DATATYPE{
	/*
	 * @Variables
	 * @Access-Modifier {private}
	 */
	private Scanner multcalc_integerScanner = new Scanner(System.in);
	private Scanner multcalc_doubleScanner = new Scanner(System.in);
	private Scanner multcalc_longScanner = new Scanner(System.in);
	private Scanner multcalc_floatScanner = new Scanner(System.in);
	private Scanner multcalc_stringScanner = new Scanner(System.in);
	
	/**
	 * @Access-Modifier {private}
	 * @Function intMultiAdd
	 * @Function-Type {int}
	 * @Param maxValue {int}
	 */
	private int intMultiAdd(int maxValue) {
		int intSumTotal = 0;
		for(int i=0;i<maxValue;i++) {
			System.out.print("ENTER VALUE:");
			int intValue = multcalc_integerScanner.nextInt();
			intSumTotal += intValue;
		}
		return intSumTotal;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function dubMultiAdd
	 * @Function-Type {double}
	 * @Param maxValue {int}
	 */
	private double dubMultiAdd(int maxValue) {
		double dubSumTotal = 0.0d;
		for(int i=0;i<maxValue;i++) {
			System.out.print("ENTER VALUE:");
			double dubValue = multcalc_doubleScanner.nextDouble();
			dubSumTotal += dubValue;
		}
		return dubSumTotal;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function fltMultiAdd
	 * @Function-Type {float}
	 * @Param maxValue {int}
	 */
	private float fltMultiAdd(int maxValue) {
		float fltSumTotal = 0.0f;
		for(int i=0;i<maxValue;i++) {
			System.out.print("ENTER VALUE:");
			float fltValue = multcalc_floatScanner.nextFloat();
			fltSumTotal += fltValue;
		}
		return fltSumTotal;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function lngMultiAdd
	 * @Function-Type {long}
	 * @Param maxValue {int}
	 */
	private long lngMultiAdd(int maxValue) {
		long lngSumTotal = 0L;
		for(int i=0;i<maxValue;i++) {
			System.out.print("ENTER VALUE:");
			long lngValue = multcalc_longScanner.nextLong();
			lngSumTotal += lngValue;
		}
		return lngSumTotal;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function intMultiMultiply
	 * @Function-Type {int}
	 * @Param maxValue {int}
	 */
	private int intMultiMultiply(int maxValue) {
		int intMulTotal = 1;
		for(int i=0;i<maxValue;i++) {
			System.out.print("ENTER VALUE:");
			int intValue = multcalc_integerScanner.nextInt();
			intMulTotal *= intValue;
		}
		return intMulTotal;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function dubMultiMultiply
	 * @Function-Type {double}
	 * @Param maxValue {int}
	 */
	private double dubMultiMultiply(int maxValue) {
		double dubMulTotal = 1.0d;
		for(int i=0;i<maxValue;i++) {
			System.out.print("ENTER VALUE:");
			double dubValue = multcalc_doubleScanner.nextDouble();
			dubMulTotal *= dubValue;
		}
		return dubMulTotal;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function fltMultiMultiply
	 * @Function-Type {float}
	 * @Param maxValue {int}
	 */
	private float fltMultiMultiply(int maxValue) {
		float fltMulTotal = 1.0f;
		for(int i=0;i<maxValue;i++) {
			System.out.print("ENTER VALUE:");
			float fltValue = multcalc_floatScanner.nextFloat();
			fltMulTotal *= fltValue;
		}
		return fltMulTotal;
	}
	
	/**
	 * @Access-Modifier {private}
	 * @Function lngMultiMultiply
	 * @Function-Type {long}
	 * @Param maxValue {int}
	 */
	private long lngMultiMultiply(int maxValue) {
		long lngMulTotal = 1L;
		for(int i=0;i<maxValue;i++) {
			System.out.print("ENTER VALUE:");
			long lngValue = multcalc_longScanner.nextLong();
			lngMulTotal *= lngValue;
		}
		return lngMulTotal;
	}
	
	/**
	 * @Function multiCalculatorInterface
	 * @Function-Type {void}
	 * @Description
	 * - Interface where all the math functions can be used 
	 */
	public void multiCalculatorInterface() throws ErrorMessages{
		System.out.println("TYPES\n");
		System.out.println("-INT\n-DUB\n-LNG\n-FLT");
		System.out.print("ENTER CHOICE: ");
		String choice = multcalc_stringScanner.nextLine();
		System.out.print("ENTER THE MAX VALUE: ");
		int max = multcalc_integerScanner.nextInt();
		int op;
		switch(choice){
		case INT_u:
			System.out.println("1: ADD\n2:MULTIPLY");
			System.out.print("ENTER OPERATION: ");
			op = multcalc_integerScanner.nextInt();
			if(op==1) {
				System.out.println("TOTAL: "+intMultiAdd(max));
			}else if(op==2) {
				System.out.println("TOTAL: "+intMultiMultiply(max));
			}else {
				System.out.println("!!NOT VALID\n!!ENTER AGAIN");
				multiCalculatorInterface();
			}
			break;
			
		case DUB_u:
			System.out.println("1: ADD\n2:MULTIPLY");
			System.out.print("ENTER OPERATION: ");
			op = multcalc_integerScanner.nextInt();
			if(op==1) {
				System.out.println("TOTAL: "+dubMultiAdd(max));
			}else if(op==2) {
				System.out.println("TOTAL: "+dubMultiMultiply(max));
			}else {
				System.out.println("!!NOT VALID\n!!ENTER AGAIN");
				multiCalculatorInterface();
			}
			break;
				
		case FLT_u:
			System.out.println("1: ADD\n2:MULTIPLY");
			System.out.print("ENTER OPERATION: ");
			op = multcalc_integerScanner.nextInt();
			if(op==1) {
				System.out.println("TOTAL: "+fltMultiAdd(max));
			}else if(op==2) {
				System.out.println("TOTAL: "+fltMultiMultiply(max));
			}else {
				System.out.println("!!NOT VALID\n!!ENTER AGAIN");
				multiCalculatorInterface();
			}
			break;
				
		case LNG_u:
			System.out.println("1: ADD\n2:MULTIPLY");
			System.out.print("ENTER OPERATION: ");
			op = multcalc_integerScanner.nextInt();
			if(op==1) {
				System.out.println("TOTAL: "+lngMultiAdd(max));
			}else if(op==2) {
				System.out.println("TOTAL: "+lngMultiMultiply(max));
			}else {
				System.out.println("!!NOT VALID\n!!ENTER AGAIN");
				multiCalculatorInterface();
			}
			break;
		
		case INT_l:
			System.out.println("1: ADD\n2:MULTIPLY");
			System.out.print("ENTER OPERATION: ");
			op = multcalc_integerScanner.nextInt();
			if(op==1) {
				System.out.println("TOTAL: "+intMultiAdd(max));
			}else if(op==2) {
				System.out.println("TOTAL: "+intMultiMultiply(max));
			}else {
				System.out.println("!!NOT VALID\n!!ENTER AGAIN");
				multiCalculatorInterface();
			}
			break;
			
		case DUB_l:
			System.out.println("1: ADD\n2:MULTIPLY");
			System.out.print("ENTER OPERATION: ");
			op = multcalc_integerScanner.nextInt();
			if(op==1) {
				System.out.println("TOTAL: "+dubMultiAdd(max));
			}else if(op==2) {
				System.out.println("TOTAL: "+dubMultiMultiply(max));
			}else {
				System.out.println("!!NOT VALID\n!!ENTER AGAIN");
				multiCalculatorInterface();
			}
			break;
				
		case FLT_l:
			System.out.println("1: ADD\n2:MULTIPLY");
			System.out.print("ENTER OPERATION: ");
			op = multcalc_integerScanner.nextInt();
			if(op==1) {
				System.out.println("TOTAL: "+fltMultiAdd(max));
			}else if(op==2) {
				System.out.println("TOTAL: "+fltMultiMultiply(max));
			}else {
				System.out.println("!!NOT VALID\n!!ENTER AGAIN");
				multiCalculatorInterface();
			}
			break;
				
		case LNG_l:
			System.out.println("1: ADD\n2:MULTIPLY");
			System.out.print("ENTER OPERATION: ");
			op = multcalc_integerScanner.nextInt();
			if(op==1) {
				System.out.println("TOTAL: "+lngMultiAdd(max));
			}else if(op==2) {
				System.out.println("TOTAL: "+lngMultiMultiply(max));
			}else {
				System.out.println("!!NOT VALID\n!!ENTER AGAIN");
				multiCalculatorInterface();
			}
			break;
		default:
			throw new ErrorMessages("ModePromptFailure EXCEPTION!!\nInvalid Value for mode prompt has been entered");
		}
	}
}
