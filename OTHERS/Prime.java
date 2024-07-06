package OTHERS;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number a,b ");
	    int n =sc.nextInt();
	    int count=0;
		if (n<=0) {
			System.out.println(" No is Not Prime No");
		}else if (n%2==0&&n==2) {
			System.out.println(" No is Not Prime No");
		}else {
			for(int i=2;i<=n/2;i++) {
				if (n%i==0) {
					 count++;
				}
			}
			if (count==0) {
				System.out.println(" No is  Prime No");
			}else {
				System.out.println(" No is Not Prime No");
			}
			
		}
		
	}

}
