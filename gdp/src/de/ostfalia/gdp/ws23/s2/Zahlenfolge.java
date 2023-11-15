package de.ostfalia.gdp.ws23.s2;

import java.util.Scanner;

public class Zahlenfolge {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		String s = x + "";
		int count = 1;
		int xMax = x;
		
		
		while(x != 1) { 
		
			if(x%2 == 0) {
				x = x/2;
			} else {
				x = (x*3)+1;
				if(x > xMax) {
					xMax = x;
				}
			}
			
			
			s += ", " + x;
			
			count++;
		} 
		System.out.println("Folge = " + s);
		System.out.println("Maximaler Wert = " + xMax);	
		System.out.println("Anzahl Elemente = " + count);
		
		sc.close();
	}
	

}
