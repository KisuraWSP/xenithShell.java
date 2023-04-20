package com.shell.console.basicFunctions;

import java.util.Scanner;

/*
 * @Class SimpCalc
 * stores the calculator interface
 */
public class SimpCalc {
	private static Scanner calcPrompt = new Scanner(System.in);
	private static Scanner numberPrompt = new Scanner(System.in);
	private static double total = 0.0d;
	private static double num1,num2;
	
	/*
	 * @function Calculator
	 * A simple Calculator that takes 2 inputs and does a specific operation according to the user choice
	 * if choice == 1
	 * do addition operation
	 * else 
	 * etc...
	 */
	public static void Calculator() {
	   System.out.println("1: Addition");
	   System.out.println("2: Subtraction");
	   System.out.println("3: Multiplication");
	   System.out.println("4: Division");
	   System.out.print("ENTER CHOICE: ");
	   int choice = numberPrompt.nextInt();
	   switch(choice) {
	   		case 1:
	   			System.out.print("enter num1: ");
	   			num1= calcPrompt.nextDouble();
	   			System.out.print("enter num2: ");
	   			num2= calcPrompt.nextDouble();
	   			total = num1+num2;
	   			System.out.println("the addition of these 2 numbers is: "+total);
	   			break;
	   		case 2:
	   			System.out.print("enter num1: ");
	   			num1= calcPrompt.nextInt();
	   			System.out.print("enter num2: ");
	   			num2= calcPrompt.nextInt();
	   			total = num1-num2;
	   			System.out.println("the addition of these 2 numbers is: "+total);
	   			break;
	   		case 3:
	   			System.out.print("enter num1: ");
	   			num1= calcPrompt.nextInt();
	   			System.out.print("enter num2: ");
	   			num2= calcPrompt.nextInt();
	   			total = num1*num2;
	   			System.out.println("the addition of these 2 numbers is: "+total);
	   			break;
	   		case 4:
	   			System.out.print("enter num1: ");
	   			num1= calcPrompt.nextInt();
	   			System.out.print("enter num2: ");
	   			num2= calcPrompt.nextInt();
	   			total = num1/num2;
	   			System.out.println("the addition of these 2 numbers is: "+total);
	   			break;
	   		default:
	   			System.out.println("invalid number prompt");
	   }
	}
}

