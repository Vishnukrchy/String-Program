package String130;

import java.util.Scanner;

public class LowerToUppercase {
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
		
		String resultString="";
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a'&& s.charAt(i)<='z') {
				resultString=resultString+(char)(s.charAt(i)-32);
			}else {
				resultString=resultString+s.charAt(i);
			}
		}
		
		System.out.println(" resultant string is "+resultString);
	}
}
