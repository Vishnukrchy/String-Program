package String130;

import java.util.Scanner;

public class PlaindromeString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========== Enter The String ========= ");
		String string = scanner.nextLine();
		if (checkPlaindrome(string)) {
			System.out.println(string + " Is A Plaindrome String ");
		} else {
			System.out.println(string + " Is Not A Plaindrome String ");
		}

	}

	public static boolean checkPlaindrome(String string) {
		string = string.toLowerCase();
		int n = string.length() - 1;
		for (int i = 0; i < string.length() / 2; i++) {

			if (string.charAt(i) == string.charAt(n)) {
				n--;
				return true;
			}
		}
		return false;
	}

	// Sir Methods
	public static boolean palindrome(String string) {
		string = string.toLowerCase();
		int length = string.length() - 1;
		for (int i = 0; i < string.length() / 2; i++) {

			if (string.charAt(i) != string.charAt(length - i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean revesrePalindrome(String string) {
		string = string.toLowerCase();
		String reverseString = "";
		for (int i = 0; i < string.length(); i++) {

			reverseString = string.charAt(i) + reverseString;
		}
		if (reverseString == string) {
			return true;
		} else {
			return false;

		}
	}
}
