package String;

import java.util.Scanner;

public class Q16_WithoutMethod {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter The String");
		String s=sc.nextLine();
		System.out.println(" Original String  is is : "+s);
		
       getReverseString(s);
}
	 public static void getReverseString(String s1) {
		String word ="";
		for(int i=s1.length()-1;i>=0;i--) {
			char c=s1.charAt(i);
			if (c!=' ') {
				word=c+word;
			}
//			

		}
		}
}
