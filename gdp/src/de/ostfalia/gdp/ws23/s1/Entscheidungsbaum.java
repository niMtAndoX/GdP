package de.ostfalia.gdp.ws23.s1;
import java.util.Scanner;

public class Entscheidungsbaum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		
		if(b < c) {
			if(b < d) {
				if(a < b) {
					System.out.println("Ergebnis = "+a);
				}else {
					System.out.println("Ergebnis = "+b);
				}
			}else {
				if(d < a) {
					System.out.println("Ergebnis = "+d);
				}else {
					System.out.println("Ergebnis = "+a);
				}
			}
		}else {
			if (c < d) {
				if(a < c) {
					System.out.println("Ergebnis = "+a);
				}else {
					System.out.println("Ergebnis = "+c);
				}
			}else {
				if(d < a) {
					System.out.println("Ergebnis = "+d);
				}else {
					System.out.println("Ergebnis = "+a);
				}
			}
		}
		
		scanner.close();
	}

}
