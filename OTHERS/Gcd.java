package OTHERS;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the two Number  ");
	    int n1 =sc.nextInt();
	    int n2=sc.nextInt();
	    int gcd=0;
	    for(int i=1;i<=n1;i++) {
	    	if ((n1%i==0 && n2%i==0)) {
				gcd=i;
			}
	    }
	    System.out.println("Ans is  : "+ gcd);
	    
	}
}
