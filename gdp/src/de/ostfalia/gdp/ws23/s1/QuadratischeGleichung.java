package de.ostfalia.gdp.ws23.s1;

import java.util.Scanner;

public class QuadratischeGleichung {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double p = scanner.nextDouble();
		double q = scanner.nextDouble();
		
		
		if((((p/2)*(p/2)) - q) < 0) {
			
			System.out.println("Loesung = keine");
			
		}else if((((p/2)*(p/2)) - q) == 0) {
			
			double ergebnis = -(p/2);
			System.out.println("EineLoesung = " + ergebnis);
			
		}else {
			double ergebnis1 = (-p/2) + Math.sqrt((((p/2)*(p/2)) - q));
			double ergebnis2 = (-p/2) - Math.sqrt((((p/2)*(p/2)) - q));
			
			if(ergebnis1 < ergebnis2) {
				System.out.println("Loesung1 = " + ergebnis1);
				System.out.println("Loesung2 = " + ergebnis2);
			}else {
				System.out.println("Loesung1 = " + ergebnis2);
				System.out.println("Loesung2 = " + ergebnis1);
			}
			
		
		}
		
		scanner.close();
	}

}
