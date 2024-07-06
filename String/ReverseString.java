package String;
import java.util.*;
public class ReverseString {
 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println(" Enter The String");
	String s=sc.nextLine();
	System.out.println(" Original String  is is : "+s);
	System.out.println(" Reverse String is : "+ reverseString(s));
	
}
 public static String reverseString(String s) {
	 String reverse="";
	 for (int i=0;i<s.length();i++) {
		 reverse =s.charAt(i)+reverse;
	 }
	 return reverse;
 }
}
