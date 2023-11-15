package de.ostfalia.gdp.ws23.s1;

import java.util.Scanner;

public class Goldpreis {
	
	public static void main(String[] args) {
		final double feinunze = 31.1034768;  
		
		Scanner sc = new Scanner(System.in);
		
		int feinUnzeCent = sc.nextInt();
		
		double kilopreisCent = (1000 / feinunze) * feinUnzeCent;
		  
		float kiloPreisEuro = (float) kilopreisCent / 100;
		
		kiloPreisEuro = kiloPreisEuro*100;
		int ze2= (int) kiloPreisEuro;
		float ze3 = (float)ze2/100;
		
		
	
		
		System.out.println("Goldpreis pro Kg in Euro = " + ze3);
		
		sc.close();
		
	}


}
