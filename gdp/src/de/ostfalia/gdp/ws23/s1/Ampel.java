package de.ostfalia.gdp.ws23.s1;

import java.util.Scanner;

public class Ampel {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int farbe = sc.nextInt();
		
		
		
		
		switch (farbe) {
		case 0b100: System.out.println("Status = Du musst anhalten / warten!");
			break;
		case 0b010: System.out.println("Status = Bremsen! Gleich wird es rot.");
		    break;
		case 0b001: System.out.println("Status = Du darfst fahren!" );
		    break;
		case 0b110: System.out.println( "Status = Aufgepasst! Gleich geht es weiter." );
			break;

		default:
			System.out.println("Status = Ampel ist defekt!");
			break;
		}
		
		sc.close();
	}
	
	

}
