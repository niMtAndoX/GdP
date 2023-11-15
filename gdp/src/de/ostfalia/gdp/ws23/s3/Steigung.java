package de.ostfalia.gdp.ws23.s3;

import java.util.Scanner;

public class Steigung {
	
	public static void main(String[] args) {
		double[] messwert = new double[] {0,0,0,0};
		Scanner sc = new Scanner(System.in);
		double dx = sc.nextDouble();
		for (double d : steigung(messwert, dx)) {
			System.out.println(d);
			
			
		}
	}

	public static double[] steigung(double[] messwerte, double dx) {
		if(messwerte == null || dx <= 0) {
			return null;
		}
		
	
	
		if(messwerte.length <= 1) {
			double[] leer = new double[0];
			return leer;

		}else {
			double[] steigung = new double[messwerte.length-1];
			for (int i = 0; i < messwerte.length-1; i++) {
				steigung[i] = (messwerte[i+1] - messwerte[i]) / dx;
				
				
			}
			
			return steigung;
		}
	}

	
}
