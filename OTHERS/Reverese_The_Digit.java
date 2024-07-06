package OTHERS;

import java.util.Scanner;

public class Reverese_The_Digit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();
	    int reverse =0;
	    while (n>0) {
			int rev=n%10;
			reverse=reverse*10+rev;
			n=n/10;
		}
	    System.out.println("Reverse of digit of Number is  : "+ reverse);
	    
	}
} 