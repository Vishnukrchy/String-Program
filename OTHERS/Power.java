package OTHERS;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number a,b ");
	    int a =sc.nextInt();
	    int b=sc.nextInt();
	    int ans =1;
	    for(int i=1;i<=b;i++) {
	    	ans =ans*a;
	    }
	    System.out.println("Ans is  : "+ ans);
	    
	}
}
