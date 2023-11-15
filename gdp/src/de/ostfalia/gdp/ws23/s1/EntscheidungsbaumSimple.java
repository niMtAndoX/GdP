package de.ostfalia.gdp.ws23.s1;

import java.util.Scanner;

public class EntscheidungsbaumSimple {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		
		if(a < b && a < c && a < d) {
			System.out.println("Ergebnis = " + a);
		}else {
			if(b < a && b < c && b < d) {
				System.out.println("Ergebnis = " + b);
			}else {
				if(c < a && c < b && c < d) {
					System.out.println("Ergebnis = " + c);
				}else {
					System.out.println("Ergebnis = " + d);
				}

			}
		}
		
		scanner.close();
   }

}
				
