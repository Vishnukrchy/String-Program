package String;
import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the string");
	String s =" fdfd34";
	int count =0;
	for(int i=0;i<s.length();i++) {
		
		if (s.charAt(i)<=48 && s.charAt(i)>=57) {
			count++;
		}
		
	}
	System.out.println(count);
		
}
}
