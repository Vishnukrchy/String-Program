package OTHERS;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the two Number  ");
	    int n1 =sc.nextInt();
	    int n2=sc.nextInt();
	    int min=n1>n2?n1:n2;
	    int gcd=0;
	    for(int i=1;i<=min;i++) {
	    	if ((n1%i==0 && n2%i==0)) {
				gcd=i;
			}
	    }
	    System.out.println("GCD is  : "+ gcd);
	    int lcm=(int)(n1*n2)/gcd;
	    System.out.println("LCM is  : "+ lcm);
	    
	    
	}
}
