package de.ostfalia.gdp.ws23.s2;

import java.util.Scanner;

public class ZahlenRaten { 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int zahl = sc.nextInt();
		
		zahl = (zahl +23) * 19; 
		
		zahl = zahl % 10; //Erzeugung der Zahl zwischen 0 und 9
		
		boolean richtig = false;
		
		int guessCount = 0;
		int guessZuKlein = 0;
		int guessZuGross = 0;
		
		while(!richtig) {
			System.out.println("Zahl zwischen 0 und 9?");
			int guess = sc.nextInt();
			guessCount++;
			
			if(guess > 9 || guess < -1) {
				System.out.println();
				continue;
			}
			
			
			if(guess == zahl) {
				richtig = true;
				System.out.println("richtig");
				System.out.println("Anzahl der Versuche: " + guessCount);
				
				double anteilZuKlein = (double)guessZuKlein / (double)guessCount; //Der Uebersicht halber in zwei Teilen
				System.out.println("Anteil zu klein: " + anteilZuKlein);
				
				double anteilZuGross = (double)guessZuGross / (double)guessCount;
				System.out.println("Anteil zu Gross: " + anteilZuGross);
				
				
				
			}
			
			if(guess == -1) {
				System.out.println("Abbruch");
				System.out.println("Anzahl der Versuche: " + guessCount);
				
				double anteilZuKlein = (double)guessZuKlein / (double)guessCount;
				System.out.println("Anteil zu klein: " + anteilZuKlein);
				
				double anteilZuGross = (double)guessZuGross / (double)guessCount;
				System.out.println("Anteil zu Gross: " + anteilZuGross);
				
				break; //Abbruch der Schleife
				
			}
			
			if(guess < zahl) {
				System.out.println("zu klein");
				guessZuKlein++;
				
			}
			
			if(guess > zahl) {
				System.out.println("zu groß");
				guessZuGross++;
			}
			
			
			
		}
		
		sc.close();
		
	}
	
	
	
	

}
