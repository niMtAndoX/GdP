package de.ostfalia.gdp.ws23.s2;

import java.util.Scanner;

public class LieblingsZeichen {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		String eingabe = sc.nextLine();
		
		char first =' ';
		char second = ' ';
		char third = ' ';
		
		int firstc = 0;
		int secondc = 0;
		int thirdc = 0; 
		
		
		for(int i = 0; i < eingabe.length(); i++) {
			int counter = 0;
			for(int k = i; k < eingabe.length(); k++) { //vergleicht jeden weiteren Buchstaben mit dem i-ten Buchstaben
				
				if(eingabe.charAt(i) == eingabe.charAt(k)){ //Wenn der Buchstabe an k gleich i ist c++
					counter++;
				}
			
			}
			
			if(eingabe.charAt(i) != first && eingabe.charAt(i) != second && eingabe.charAt(i) != third && eingabe.charAt(i) != ' ' && eingabe.charAt(i) != '	'){
			
				if(counter > firstc) { 
					thirdc = secondc; //Plaetze werden nach unten geschoben, sodass neuer höchster Counter an 1.
					secondc = firstc;
					firstc = counter;
				
					third = second; //Gleiches fuer zeichen
					second = first;
					first = eingabe.charAt(i);
				
			   
				}else if(counter > secondc) {
				
					thirdc = secondc; //Gleiches nur vom zweiten Platz an
					secondc = counter;
				
					third = second;
					second = eingabe.charAt(i);
				
				}else if(counter > thirdc) {
					thirdc = counter;
					third = eingabe.charAt(i); 
				}
			
			}
			
		}
		
		System.out.println("--Ranking der Zeichen--");
		System.out.println(first + " = " + firstc);
		System.out.println(second + " = " + secondc);
		System.out.println(third + " = " + thirdc);
		
		sc.close();
		
	}

	
}
