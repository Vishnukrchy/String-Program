package String;
// WAJP TO COUNT NUMERIC CHAR IN STRING
import java.util.Scanner;

public class CountNumberQ1 {
public static void main(String[] args) {
	System.out.println(" Enter the String");
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	System.out.println(" Total count of String is "+s1.length());
	  
	   System.out.println(" Numeric Charater in string : "+countNumericChar(s1));

}
public static int countNumericChar(String s) {
	int count =0;
	for(int i =0;i<s.length();i++) {
		char c =s.charAt(i);
		if (c>=47&&c<=58) {
			count++;
		}
	}
	return count;
}
}
