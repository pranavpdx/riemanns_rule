/*
 * This program solves the integral of a function using Riemann's rule, it solves using left rule, 
 * midpoint rule, and right rule
 * Date: 2/4/19
 * Author: Pranav Sharma
 */

import java.util.Scanner;

public class Main {
	Scanner scanner = new Scanner(System.in);
	
	Main(){
		System.out.println("If you would like toc hange the formula you must manually go into the code and change the method 'Formula'");
		System.out.println("");
		// has user enter constraints
		System.out.println("beginning point:");
		double a = Double.parseDouble(scanner.nextLine());
		System.out.println("ending point:");
		double b = Double.parseDouble(scanner.nextLine());
		System.out.println("Enter # rectangles");
		double N = Integer.parseInt(scanner.nextLine());
		double change1 = b-a;
		double change = change1/N;
		// Left Hand Rule
		double sumL = 0;
		for (double i = a; i < b; i= i + change) {
			sumL = sumL + formula(i);
		}
		System.out.println("LN = " + sumL * change);
		// Right Hand Rule
		double sumR = 0;
		for (double i = a + change; i <= b; i = i + change) {
			sumR = sumR + formula(i);
		}
		System.out.println("RN = " + sumR * change);
		//Midpoint Rule
		double sumM = 0; 
		for (double i = a + (change/2); i < b; i = i + change) {
			sumM = sumM + formula(i);
			
		}
		System.out.println("MN = " + sumM * change);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	// the function that user is finding integral of 
	public double formula(double x) {
		return Math.pow(x, 2) * Math.sin(x);
	}

}
