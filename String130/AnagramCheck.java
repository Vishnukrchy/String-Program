package String130;

import java.util.Arrays;

public class AnagramCheck {
	// Function to check if two strings are anagrams
	public static boolean areAnagrams(String str1, String str2) {
		// Remove any whitespace and convert strings to lower case
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// If lengths of strings are not the same, they cannot be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert strings to char arrays
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		// Sort the char arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Compare sorted char arrays
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		String str1 = "Listen";
		String str2 = "Silent";

		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}
}
