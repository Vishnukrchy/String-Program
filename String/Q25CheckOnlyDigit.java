package String;

import java.util.Scanner;

public class Q25CheckOnlyDigit {
	 public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println(" Enter The String");
			String s=sc.nextLine();
			System.out.println(" Original String   is : "+s);
//	      	String n =s.toUpperCase();
//			
           System.out.println(" The Given String Are Contain Only Digit "+checkDigitOnly(s));
			
	 }	
	 public static boolean checkDigitOnly(String s) {
		   int n=s.length();
		 for(int i=0;i<n;i++) {
			 char c=s.charAt(i);
			if (c<='0' || c>='9') {
				return false;
			}
		 }
		 return true;
	}
	 public static boolean checkDigitOnly1(String s) {
		   int n=s.length();
		 for(int i=0;i<n;i++) {
			 char c=s.charAt(i);
			if (!(c>='0'&&c<='9')) {
				return false;
			}
		 }
		 return true;
	}
}
