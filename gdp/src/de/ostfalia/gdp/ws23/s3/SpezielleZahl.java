package de.ostfalia.gdp.ws23.s3;

public class SpezielleZahl {
	
	public static void main(String[] args) {

		
		
	}

	
	public static int quersumme(int zahl) {
		
		int summe = 0;
		while (0 != zahl) {
			// addiere die letzte ziffer der uebergebenen zahl zur summe
			summe = summe + (zahl % 10);
			// entferne die letzte ziffer der uebergebenen zahl
			zahl = zahl / 10;
		}
		return summe;
	}
	
	public static boolean istSpeziell(int m) {
		
		return (m % quersumme(m) == 0) && true;
		
	}
}
