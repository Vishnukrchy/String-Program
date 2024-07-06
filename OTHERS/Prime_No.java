package OTHERS;

import java.util.Scanner;

public class Prime_No {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number a,b ");
	    int num =sc.nextInt();
	    if (chekPrime_No(num)) {
			System.out.println(" No is Prime No");
		}else {
			System.out.println(" No is Not Prime No");
		}
	    
	   
	    	    
	}
	public static boolean chekPrime_No(int n) {
		int count=0;
		if (n<=0) {
			return false;
		}else if (n%2==0&&n!=2) {
			return false;
		}else {
			for(int i=2;i<=n/2;i++) {
				if (n%i==0) {
					 return false;
				}
			}
			return true;
			
		}
	}
}
