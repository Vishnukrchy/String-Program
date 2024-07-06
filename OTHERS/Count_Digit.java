package OTHERS;

import java.util.Scanner;

public class Count_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();
	    int count =0;
	    int i=1;
	    while (n>0) {
			count++;
			n=n/10;
		}
	    System.out.println(" No of digit is : "+ count);
	    
	}

}
