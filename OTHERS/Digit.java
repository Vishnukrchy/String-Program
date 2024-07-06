package OTHERS;

import java.util.Scanner;

public class Digit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number  ");
	    int n =sc.nextInt();
	   while (n>0) {
		int digit=n%10;
		System.out.println(digit+"*"+digit+"= "+(digit*digit));
		n=n/10;
	}
	   
	}
}
