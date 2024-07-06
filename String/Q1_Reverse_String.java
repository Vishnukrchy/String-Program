package String;

import java.util.Scanner;

public class Q1_Reverse_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The String");
		String s = sc.nextLine();
		System.out.println(" Original String  is is : " + s);

		getReverseString(s);
	}

	public static void getReverseString(String s1) {
		String[] words = s1.split(" ");
		int n = words.length - 1;
		for (int i = n; i >= 0; i--) {
			System.out.println(" Reverse String is : " + words[i] + " ");
		}
	}
}
