package String;

import java.util.Scanner;

public class Q23_Captalize {
	 public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println(" Enter The String");
			String s=sc.nextLine();
			System.out.println(" Original String  is is : "+s);
		String n =s.toUpperCase();
			System.out.println(" Total Words in Given String is : "+n);
			
	 }		
//	 public static String FirstCharCaptalize(String s) {
//		String [] k=s.split(" ");
//		
//		for(int i=0;i<k.length;i++) {
//			String p=k[i];
//			if (!(p.charAt(0)>='A'&& p.charAt(0)>='Z')) {
//				                                                  
//			}
//		}
//	}
}
