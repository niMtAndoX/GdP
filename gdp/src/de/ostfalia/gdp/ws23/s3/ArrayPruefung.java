package de.ostfalia.gdp.ws23.s3;

public class ArrayPruefung {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		System.out.println(istGeordnet(arr, true));
		
		
	}
	
	public static boolean istGeordnet(int[] input, boolean flag) {
		if(input == null || input.length == 0) {
			return false;
			
		}else if(input.length == 1) {
			return true;
		}else {
			if(flag) {
				for (int j = 0; j < input.length-1; j++) {
					if(input[j] >= input[j+1]) {
						return false;
					}
					
				}
				return true;
				
			}else {
				for (int j = 0; j < input.length-1; j++) {
					if(input[j]<= input[j+1]) {
						return false;
					}
					
				}
				return true;
				
			}
		}
	}

	
	
}
