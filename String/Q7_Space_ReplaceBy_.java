package String;

import java.util.Scanner;

public class Q7_Space_ReplaceBy_ {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println(" Enter the string");
	     String s = sc.nextLine();
	     System.out.println(" Intial String is  : "+s);
	     s=s.replace(' ', '_');
	     System.out.println(" Remoove duplicat Character String is : "+s);
	    		 
	     
//	     System.out.println(" Remoove duplicat Character String is : "+remooveDuplicate(s));
	} 
//	 public static String remooveDuplicate(String s) {
//		 char [] c =s.toCharArray();
//		 int n=s.length();
//		 for(int i=0;i<n-1;i++) {
//			 for(int j=i+1;j<n;j++) {
//				 if (c[i]==' ') {
//					c[i]='';
//					j--;
//					n--;
//				}
//			 }
//		 }
//		 
//		String result ="";
//		for(int i=0;i<n;i++) {
//			result=result+c[i];
//		}
//		
//		return result;
//	 }
}
