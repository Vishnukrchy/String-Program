package String130;

import java.util.Scanner;

// Count total words in string
public class Q14_CountTotatlWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========== Enter The String ========= ");
		String string = scanner.nextLine();
		System.out.println(" Total No of Words is : " + count(string));
		// by split() method
		
		getCount(string);
		
	}

	public static int count(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(i) != ' ' || s.charAt(i - 1) == ' ' && s.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}

	public static void getCount(String string) {
		String[] newStrings = string.split(" ");
		System.out.println(" Total  words is : "+newStrings.length);
	}
}
