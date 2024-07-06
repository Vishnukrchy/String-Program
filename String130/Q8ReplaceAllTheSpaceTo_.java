package String130;

import java.util.Scanner;

// WAJP TO TAKE THE STRING INPUT AND REPLACE THE SPACE CHARACTER FROM _
//INT THE STRING
public class Q8ReplaceAllTheSpaceTo_ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========== Enter The String ========= ");
		String string = scanner.nextLine();
		scanner.nextLine();
		replaceSpace(string);
	}

	public static void replaceSpace(String s) {
		String resultString = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				resultString = resultString + c;
			} else {
				resultString = resultString + '_';
			}
		}
		System.out.println(" New String is : " + resultString);
	}
}
