package de.ostfalia.gdp.ws23.s2;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		boolean palindrom = false;
		
		for(int i = 0; i < s.length()-1; i++) {
			
				if(s.charAt(i) == (s.charAt(s.length()-i-1))) { //vergleicht den ersten mit dem letzten, den zweiten mit dem vorletzen usw
					palindrom =	true;
				}else { 
					palindrom = false;// sobald ein buchstabe nicht gleich ist, ist es kein palindrom und die Schleife kann verlassen werden
					break;
				}
				
				
		
		}
		
		System.out.println("Eingabe = " + s); 
		System.out.println("Palindrom = " + palindrom); 
		
		sc.close();
	}

}
