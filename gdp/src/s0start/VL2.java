package s0start;

//import java.util.Iterator;
import java.util.Scanner;

public class VL2 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean isPrim = true;
		
		for(int i = 2; i*i<n; i++) {
			if(n % i == 0) {
				isPrim = false;
			}
			
			
		}
		
		System.out.println(isPrim);
		sc.close();
		
		for(int i = 1; i< 10; i++) {
			for(int k = 1; k < 10; k++) {
				System.out.printf("%4d",i*k);
			}
			System.out.println();
		}
		
		
		
		
	}

}
