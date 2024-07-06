package OTHERS;

import java.util.Scanner;

public class Series {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();
	    int ans =0;
	    int i=1;
	    while (i<=n) {
			
			if (i%2==0) {
				ans =ans-i;
			}else {
				ans =ans+i;
			}
		}
	    System.out.println("Ans is  : "+ ans);
	    
	}
}
