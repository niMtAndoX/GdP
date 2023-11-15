package de.ostfalia.gdp.ws23.s1;

import java.util.Scanner;

public class Umrechnung {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bin1 = sc.nextInt();
		int bin2 = sc.nextInt();
		int bin3 = sc.nextInt();
		int bin4 = sc.nextInt();
		int bin5 = sc.nextInt();
		int bin6 = sc.nextInt();
		int bin7 = sc.nextInt();
		int bin8 = sc.nextInt();
		
		int ergebnis = bin1 * 1<<7 + bin2 * 1<<6 + bin3 * 1<<5 + bin4 * 1<<4 + bin5 *1<<3 + bin6*1<<2 + bin7 *1<<1 + bin8 *1;
		System.out.println("Dezimalzahl = " + ergebnis);
		
		sc.close();
	}

}
