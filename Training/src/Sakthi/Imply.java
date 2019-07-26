package Sakthi;

import java.util.Scanner;
import java.lang.Math;

public class Imply {
	public void display() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any two numbers:");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		System.out.println("Enter a no to find sq root");
		double z1 = input.nextInt();
		double s = -(1.0 / 0);
		double m = (18 / 5);
		System.out.println("Enter a no to find cube root");
		double k = input.nextInt();
		if (a > b) {
			System.out.println("A is bigger number");
		} else {
			System.out.println("B is bigger one");
		}
		int y = 0;
		if (a == b) {
			System.out.println("Equals");
		} else {
			System.out.println("Not equals");
		}

		System.out.println("Addition:" + c);
		System.out.println("Subtraction: " + d);
		System.out.println("Multiplication:" + e);
		System.out.println("Division:" + f);
		System.out.println("Squareroot is:" + " " + Math.sqrt(z1));
		System.out.println("Cubic root is:" + " " + Math.cbrt(s));
		System.out.println("Cubic root is:" + " " + Math.cbrt(k));
		System.out.println("Modulus is: " + " " + m);
	}

}
