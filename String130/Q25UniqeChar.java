package String130;

import java.util.Scanner;


public class Q25UniqeChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The String");
		String s = sc.nextLine();
		System.out.println(" Original String  is is : " + s);
       //getUniqeChar(s);
		getDuplicateChar(s);
		
	}
	public static void getUniqeChar(String s) {
		int a[]=new int[256];
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i)]++;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]==1) {
				System.out.println((char)i+ " is Only one time  "+a[i]);
			}
		}
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
