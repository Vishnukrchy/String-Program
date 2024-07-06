package OTHERS;

import java.util.Scanner;

public class Fabbanaicci_Seriese {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Nth Term term Of Fabonaicci_Seriese  ");
	    int n =sc.nextInt();
	    int a=0,b=1,c=0;
	    for(int i=1;i<=n;i++) {
	    	System.out.println("Fabonaicci_Seriese is "+a);
	    	c=a+b;
	    	a=b;
	    	b=c;
	    }
	}
}
