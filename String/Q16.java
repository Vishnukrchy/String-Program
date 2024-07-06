package String;

import java.util.Scanner;

public class Q16 {
	 public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println(" Enter The String");
			String s=sc.nextLine();
			System.out.println(" Original String  is is : "+s);
			System.out.println(" Total Words in Given String is : "+getReverseWords(s));

}
	 public static String getReverseWords(String s) {
			int n=s.length()-1;
			String[] c =s.split(" ");
			String rev="";
//			int count=0;
			for(int i=0 ;i<c.length;i++) {
				 rev =c[i]+" "+rev;
				}
		    return rev;
				
		}
}