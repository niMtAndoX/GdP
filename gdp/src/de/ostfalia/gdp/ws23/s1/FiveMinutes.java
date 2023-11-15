package de.ostfalia.gdp.ws23.s1;

import java.util.Scanner;

public class FiveMinutes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int eingabe = sc.nextInt(); //Zahl wird von Konsole eingelesen
		
		String augen = ""; //Variable fuer die Aufzaehlung aller Augen
		int sum = 0; //Variable fuer die Summe aller Augen
		
		if(eingabe < 0) { //Ueberprueft ob die Eingabe grösser null ist
			
			System.out.println("Bitte starten sie das Programm neu und geben eine positive Zahl oder null ein");
			
		}else {
			for(int i = 0; i < eingabe ;i++) { //zaehlt von 0 bis eingabe-1 fuer anzahl der Wuerfe
				
				int wurf = (int) ((Math.random() * 10) %6 + 1); //generiert eine Zufaellige Zahl von 1 - 6
				
				augen += wurf; //haengt die Augen an den String
				sum += wurf; //rechnet die Augen zusammen

			}
		}
		
		
		System.out.println(eingabe + "     //Eingabe");
		System.out.println("augen = " + augen);
		System.out.println("summe = " + sum);//gibt alles aus
		
		sc.close();

		
	}

}
