package de.ostfalia.gdp.ws23.s1;

import java.util.Scanner;

public class ZylinderVolumen {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int durchmesser = sc.nextInt();
		
		int hoehe = sc.nextInt();
		
		double volumen = Math.PI * ((double)durchmesser / 2) * ((double)durchmesser / 2) * hoehe;
		
		System.out.println("Volumen = " + volumen);
		

		
		sc.close();
	}

}