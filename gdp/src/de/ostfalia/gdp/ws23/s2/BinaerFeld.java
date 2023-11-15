package de.ostfalia.gdp.ws23.s2;

import java.util.Scanner;

public class BinaerFeld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		String checkBit = "";
		
		int result = 1 << n;
		
		for (int i = 0; i < result; i++) {
			
			int zahl = i;		
			int xor = 0;
			
			for (int j = 0; j < n; j++) {
				int bit = zahl % 2;
				xor = xor ^ bit;
				zahl = zahl/2;
				
			}
			if (xor == 0) {
				checkBit += "_";
			}
			else {
				checkBit += "X";
			}
		}
		System.out.println("CHKBIT = " + checkBit);
		
		for (int i = 0; i < n; i++) {
			System.out.print(i + ". Bit = ");
			for (int j = 0; j < result; j++) {
				if (((j >> i) & 1) == 1) {
					System.out.print("X");
				}
				else {
					System.out.print("_");
				}
			}
			System.out.println();
			scanner.close();
		}
	}
	
	

}
