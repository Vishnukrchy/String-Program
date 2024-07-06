package OTHERS;

import java.util.Scanner;

public class Factor {
public static void main(String[] args) {
	// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the Number ");
	        int n =sc.nextInt();
	        int count =0;
	        for(int i=1;i<=n;i++) {
	        	if (n%i==0) {
					System.out.println(" Factor is : "+i);
					count++;
				}
	        }
	        System.out.println(" No of Factor is :"+count);
		}
}
