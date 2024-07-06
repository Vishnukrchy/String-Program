package String130;

import java.util.Scanner;

public class Q26DuplicateChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter STring: ");
	String s1=sc.nextLine();
	System.out.println("The String is: "+s1);
	System.out.println("All character Frequency is: ");
	getDuplicateChar(s1);

}
public static void getDuplicateChar(String s) {
	int a[]=new int[256];
	for (int i = 0; i < s.length(); i++) {
		a[s.charAt(i)]++;
	}
	for (int i = 0; i < a.length; i++) {
		if (a[i]>1) {
			System.out.println((char)i+ " is Apear "+a[i]+" is More than ones times ");
		}
	}
}

}
