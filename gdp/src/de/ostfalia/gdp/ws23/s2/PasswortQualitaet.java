package de.ostfalia.gdp.ws23.s2;

import java.util.Scanner;

public class PasswortQualitaet {
	
	public static void main(String[] args) {
		
		
		int numberCount = 0;
		int laengeCount = 0;
		int letterCount = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int sonderCount = 0;
		
		int qualitaet = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); 
		
		for(int i = 0; i < s.length(); i++) {  //ASCII Werte der Buchstaben werden ueberprueft und evtl counter hochgesetzt
			
			int help = s.charAt(i);
			
			if(help < 58 && help > 47 && numberCount !=10) {  //Zahlen 0-9
				numberCount+= 5;
				continue;
			}
			
			if( (help >=65 && help <= 90) || (help >= 97 && help <= 122) && letterCount != 10 ) { //a-z und A-Z
				letterCount+= 5;
				
			}
			
			if(help >=	65 && help <= 90 && upperCaseCount == 0) { //Grossbuchstaben
				upperCaseCount += 10;
				continue;
			}
			
			if(help >= 97 && help <= 122 && lowerCaseCount == 0) { //Kleinbuchstaben
				lowerCaseCount +=10;
				continue;
			}
			
			if( (help >= 33 && help <= 47) || (help >= 58 && help <= 64 ) &&
					(help >= 91 && help <= 96) || (help >= 123 && help <=126) && sonderCount == 0 ) { //Sonderzeichen
				
				sonderCount += 10;
				continue;
			}
			
			
			
			
		
		}
		
		if(s.length() >= 8) { // Laenge wird ueberprueftfp
			laengeCount = 10;
		}
		
		if(letterCount == 5) { // Wenn nur ein Buchstabe ist, gibt es keine Punkte, daher count zurueckgesetzt
			letterCount = 0;
		}
		
		if(numberCount == 5) { //Wenn nur eine Zahl, wie oben
			numberCount = 0;
		}
		
		qualitaet = numberCount + laengeCount + letterCount + upperCaseCount + lowerCaseCount + sonderCount;
		
		
		System.out.println("Bewertung in Punkten = " + qualitaet);
		
		sc.close();
		
		
		
		
		
		
		
	}

}
