package de.ostfalia.gdp.ws23.s3;

import java.util.Scanner;

public class VerEntschluesselung {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welchen Text möchten sie verschluesseln?");
		String plainText = sc.next();
		System.out.println("Welchen Schlüssel möchten sie verwenden?");
		int key = sc.nextInt();
		
		
		String chiffre = verschluesseln(plainText,key);
		System.out.println(chiffre);
		
		String plain = entschluesseln(chiffre, key);
		System.out.println(plain);
		
		sc.close();
	}
	
	
	public static String verschluesseln(String plain, int key) {
		String chiffre = "";
		char[] arr = toCharArray(plain);;
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z') {
			arr[i] = (char) ((int) arr[i] + key);
			}
			
			if(arr[i] > 90 && arr[i] <97 || arr[i] > 122) {
				arr[i] -= 26;
			}
		}
		chiffre = toString(arr);
		
		return chiffre;
	}
	
	
	
	public static String entschluesseln(String eingabe, int n) {
		
		
		char[] arr2 = toCharArray(eingabe);
		
		for(int i = 0; i < arr2.length; i++) {
			if((arr2[i] >= 'a' && arr2[i] <= 'z') ||(arr2[i] >= 'A' && arr2[i] <= 'Z')) {
			arr2[i] = (char) (arr2[i] - n);
			
			if((arr2[i] > 90 && arr2[i] <97) || (arr2[i] < 65)) {
				arr2[i] += 26;
				}
			}
			
		}
		
		return toString(arr2);
	}
	
	public static char[] toCharArray(String s) {
		char[] plainT = new char[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
				plainT[i] = s.charAt(i);
			}
		
		
		return plainT;
		
	}
	
	public static String toString(char[] arr) {
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			s += arr[i] + "";
		}
		return s;
	}

}
