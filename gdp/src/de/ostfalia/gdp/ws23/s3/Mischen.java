package de.ostfalia.gdp.ws23.s3;

public class Mischen {
	
	public static void main(String[] args) {
		int[] a = null;
		int[] b = new int[] {5,6,7,8,9,3};
		
		for (int i : mischen(a,b,3)) {
			System.out.println(i);
		}
		
	
		
	}
	public static int[] mischen(int[] a, int b[]) {
		if(isNull(a) && isNull(b)) {
			return null; 
			
		}
		if(isNull(a)) {
			return b;
		
		}else if(isNull(b)) {
			return a;
		
		}else{
			
			int[] gemischt = new int[a.length +	b.length];
			
			int countA = 0;
			int countB = 0;
			
			
		
			for (int i = 0; i < gemischt.length; i++) {
				if(a.length == b.length) {
				
					if(i % 2 == 0 && countA < a.length) {
						gemischt[i] = a[countA];
						countA++;
			
					}else if(i % 2 == 1 && countB < b.length) {
						gemischt[i] = b[countB];
						countB++;
					}
				} else if(a.length != b.length) {
			
					if((i % 2 == 0 || b.length == countB)&& countA < a.length) {
						gemischt[i] = a[countA];
						countA++;
					}else if((i % 2 == 1 || a.length == countA)&& countB < b.length) {
						gemischt[i] = b[countB];
						countB++;
					}
			
				}
			}
			
			return gemischt;
		}
		
	
	}
	
	public static int[] mischen(int[] a, int b[], int k) {
		if(isNull(a) && isNull(b)) {
			return null; 
			
		}
		if(isNull(a)) {
			int[] gemischt = new int[b.length] ;
			for(int i =0; i<b.length; i++) {
				gemischt[i] = b[b.length-i-1];
				
				
				
			}
		 return gemischt;
		
		}else if(isNull(b)) {
			return a;
		
		}else {
		
			int[] gemischt = new int[a.length +	b.length];
			
			int countA = 0;
			int countB = b.length -1;
			int temp = countB;
			
			boolean aDran = true;
			
			for (int i = 0; i < gemischt.length; i++) {
					if(countA < a.length && aDran) {
						gemischt[i] = a[countA];
						countA ++;
						if(countA %k == 0) {
							aDran = false;
						}
						continue;
						
						
			
					}else if (countB >= 0 && !aDran  || countA == a.length) {
						gemischt[i] = b[countB];
						countB	-- ;
						if(countB == temp-k) {
							aDran = true;
							temp = countB;
						}
					}
			
		
			}
			
			return gemischt;
		}
		
	}
	
	public static boolean isNull(int[] arr) {
		if(arr == null) {
			return true;
		}else {
			return false;
		}
		
	}

}
