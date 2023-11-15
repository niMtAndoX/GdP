package de.ostfalia.gdp.ws23.s2;

import java.util.Scanner;

public class Multiplikation { 
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int ergebnis = 0;
		
		while(a != 0) {  //Abbruchbedingung
			if(a %2 == 1) { //Letzte Bit von eins, wenn a ungerade
				ergebnis = ergebnis + b;
				
			}
			a = a / 2;
			b = b * 2;
			
		
		}
		
		System.out.println("Produkt = " + ergebnis);
		
		sc.close();
		
		
	}
	
	

}
