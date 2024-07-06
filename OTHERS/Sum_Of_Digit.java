package OTHERS;

import java.util.Scanner;

public class Sum_Of_Digit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();
	    int sum =0;
//	    int i=1;
	    int count=0;
	    while (n>0) {
			int digit =n%10;
			sum=sum+digit;
			n=n/10;
			count++;
		}
	    System.out.println(" Sum of digit is : "+ sum);
	    System.out.println(" Count of digit is : "+ count);
	    
	}
}
