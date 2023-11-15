package de.ostfalia.gdp.ws23.s1;

import java.util.Scanner;

public class Logikbaustein {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean a = scanner.nextBoolean();
		
		boolean b = scanner.nextBoolean();
		
		boolean c = scanner.nextBoolean();
		
		boolean d = scanner.nextBoolean();
		
		//boolean z = !(((a||b) ^ ((!c) && d)));
		
		boolean e1 = a||b;
		boolean e2 = !c&&d;
		boolean e3 =!(e1 ^ e2);
		
		System.out.println("z = " + e3);
		
		scanner.close();
		
		
	}
	
	

}
