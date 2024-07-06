package String130;

import java.util.Scanner;

public class Q15_AnagramString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========== Enter The Strings ========= ");
		String string = scanner.nextLine();
		String string2 = scanner.nextLine();
		scanner.close();

		if (checkAnagram(string, string2)) {
			System.out.println(string + " and " + string2 + " are anagrams.");
		} else {
			System.out.println(string + " and " + string2 + " are not anagrams.");
		}
	}

	public static boolean checkAnagram(String string, String string2) {
		// Remove whitespace and convert to lower case
		string = string.replaceAll("\\s", "").toLowerCase();
		string2 = string2.replaceAll("\\s", "").toLowerCase();

		// Check if lengths are the same
		if (string.length() != string2.length()) {
			return false;
		}

		// Get character counts
		int[] count1 = getCount(string);
		int[] count2 = getCount(string2);

		// Compare character counts
		for (int i = 0; i < count1.length; i++) {
			if (count1[i] != count2[i]) {
				return false;
			}
		}
		return true;
	}

	public static int[] getCount(String string) {
		int[] count = new int[26];
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				count[c - 'A']++;
			} else if (c >= 'a' && c <= 'z') {
				count[c - 'a']++;
			}
		}
		return count;
	}
}
