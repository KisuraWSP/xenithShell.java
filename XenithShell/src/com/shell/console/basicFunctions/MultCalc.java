package com.shell.console.basicFunctions;

import java.util.ArrayList;
import java.util.Scanner;

import com.shell.console.keywords.Syntax;

/*
 * @Class MultCalc
 * this stores the interface which allows the users to do calculations with multiple values
 * multiple calculation between division and subtraction are not supported in this program 
 */
public class MultCalc implements Syntax{
	private static Scanner StringPromptValue_multcalc = new Scanner(System.in); //String
	private static Scanner IntegerValue_multcalc = new Scanner(System.in); //Integer
	private static Scanner DoubleValue_multcalc = new Scanner(System.in); //Double
	private static Scanner FloatValue_multcalc = new Scanner(System.in); //Float
	private static Scanner LongValue_multcalc = new Scanner(System.in); //Long
	
	/*
	 * @function multAddition
	 * Asks user to enter the amount of inputs
	 * Then asks it what data type does it want to take as an input
	 * Then does a calculation and gives the output of the function, count of the numbers and average
	 */
	public static void multAddition() {
		System.out.print("enter number of values you want to enter: ");
	    int maxVal = IntegerValue_multcalc.nextInt();
	    System.out.print("enter the data type of the value you want: ");
	    String type= StringPromptValue_multcalc.nextLine();
	    switch(type) {
	    	case INTEGER:
	    		ArrayList<Integer> intValues = new ArrayList<>();
	    		int intSumTotal = 0;
	    		for(int q=0;q<maxVal;q++) {
	    			System.out.print("enter your number:");
	    			int IntnumberAdd = IntegerValue_multcalc.nextInt();
	    			intValues.add(IntnumberAdd);
	    			intSumTotal += intValues.get(q);
	    		}
	    		System.out.println("THE SUM OF THE NUMBERS THAT YOU ENTERED IS: "+intSumTotal);
	    		System.out.println("Count: "+maxVal);
	    		System.out.println("Average: "+((int)intSumTotal/(int)maxVal));
	    		break;
	    	case DOUBLE:
	    		ArrayList<Double> dubValues = new ArrayList<>();
	    		double dubSumTotal = 0.0d;
	    		for(int q=0;q<maxVal;q++) {
	    			System.out.print("enter your number:");
	    			double DubnumberAdd = DoubleValue_multcalc.nextDouble();
	    			dubValues.add(DubnumberAdd);
	    			dubSumTotal += dubValues.get(q);
	    		}
	    		System.out.println("THE SUM OF THE NUMBERS THAT YOU ENTERED IS: "+dubSumTotal);
	    		System.out.println("Count: "+maxVal);
	    		System.out.println("Average: "+((double)dubSumTotal/(double)maxVal));
	    		break;
	    	case LONG:
	    		ArrayList<Long> longValues = new ArrayList<>();
	    		long longSumTotal = 0L;
	    		for(int q=0;q<maxVal;q++) {
	    			System.out.print("enter your number:");
	    			long LongnumberAdd = LongValue_multcalc.nextLong();
	    			longValues.add(LongnumberAdd);
	    			longSumTotal += longValues.get(q);
	    		}
	    		System.out.println("THE SUM OF THE NUMBERS THAT YOU ENTERED IS: "+longSumTotal);
	    		System.out.println("Count: "+maxVal);
	    		System.out.println("Average: "+((long)longSumTotal/(long)maxVal));
	    		break;
	    	case FLOAT:
	    		ArrayList<Float> fltValues = new ArrayList<>();
	    		float fltSumTotal = 0.0f;
	    		for(int q=0;q<maxVal;q++) {
	    			System.out.print("enter your number:");
	    			float FltnumberAdd = FloatValue_multcalc.nextFloat();
	    			fltValues.add(FltnumberAdd);
	    			fltSumTotal += fltValues.get(q);
	    		}
	    		System.out.println("THE SUM OF THE NUMBERS THAT YOU ENTERED IS: "+fltSumTotal);
	    		System.out.println("Count: "+maxVal);
	    		System.out.println("Average: "+((float)fltSumTotal/(float)maxVal));
	    		break;
	    	}
	}
	
	/*
	 * @Function multMultiplication
	 * Takes the amount of user inputs
	 * Asks for the data type it wants to assign to the arrayList
	 * Does the calculation by multiplying values with the existing values in the arrayList
	 * Displays the count of inputs entered and the expected output from the function
	 */
	public static void multMultiplication() {
		System.out.print("enter number of values you want to enter: ");
	    int maxVal = IntegerValue_multcalc.nextInt();
	    System.out.print("enter the data type of the value you want: ");
	    String type= StringPromptValue_multcalc.nextLine();
	    switch(type) {
	    	case INTEGER:
	    		ArrayList<Integer> intValues = new ArrayList<>();
	    		int intMultTotal = 1;
	    		for(int q=0;q<maxVal;q++) {
	    			System.out.print("enter your number:");
	    			int IntnumberMult = IntegerValue_multcalc.nextInt();
	    			intValues.add(IntnumberMult);
	    			intMultTotal *= intValues.get(q);
	    		}
	    		System.out.println("THE MULTIPLES OF THE NUMBERS THAT YOU ENTERED IS: "+intMultTotal);
	    		System.out.println("Count: "+maxVal);
	    		break;
	    	case DOUBLE:
	    		ArrayList<Double> dubValues = new ArrayList<>();
	    		double dubMultTotal = 1.0d;
	    		for(int q=0;q<maxVal;q++) {
	    			System.out.print("enter your number:");
	    			double DubnumberMult = DoubleValue_multcalc.nextDouble();
	    			dubValues.add(DubnumberMult);
	    			dubMultTotal *= dubValues.get(q);
	    		}
	    		System.out.println("THE MULTIPLES OF THE NUMBERS THAT YOU ENTERED IS: "+dubMultTotal);
	    		System.out.println("Count: "+maxVal);
	    		break;
	    	case LONG:
	    		ArrayList<Long> longValues = new ArrayList<>();
	    		long longMultTotal = 1L;
	    		for(int q=0;q<maxVal;q++) {
	    			System.out.print("enter your number:");
	    			long LongnumberMult = LongValue_multcalc.nextLong();
	    			longValues.add(LongnumberMult);
	    			longMultTotal *= longValues.get(q);
	    		}
	    		System.out.println("THE MULTIPLES OF THE NUMBERS THAT YOU ENTERED IS: "+longMultTotal);
	    		System.out.println("Count: "+maxVal);
	    		break;
	    	case FLOAT:
	    		ArrayList<Float> fltValues = new ArrayList<>();
	    		float fltMultTotal = 1.0f;
	    		for(int q=0;q<maxVal;q++) {
	    			System.out.print("enter your number:");
	    			float FltnumberMult = FloatValue_multcalc.nextFloat();
	    			fltValues.add(FltnumberMult);
	    			fltMultTotal *= fltValues.get(q);
	    		}
	    		System.out.println("THE MULTIPLES OF THE NUMBERS THAT YOU ENTERED IS: "+fltMultTotal);
	    		System.out.println("Count: "+maxVal);
	    		break;
	    	}
	}
}
