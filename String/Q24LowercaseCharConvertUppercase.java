package String;

import java.util.Scanner;

public class Q24LowercaseCharConvertUppercase {
	 public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println(" Enter The String");
			String s=sc.nextLine();
			System.out.println(" Original String  is is : "+s);
//	      	String n =s.toUpperCase();
//			
           lowercaseToUpperCase(s);
			
	 }		
	 public static void lowercaseToUpperCase(String s) {
		char [] arr =s.toCharArray();
		String resultString="";
		for( int i=0;i<arr.length;i++) {
		
			if (arr[i]>=97 && arr[i]<=122) {
				arr[i]=(char) (arr[i]-32);
			}
		}
		
		for (char c : arr) {
			resultString=resultString+c;
		}
		System.out.println(" resultant string is "+resultString);
	}
}
