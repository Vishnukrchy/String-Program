package String130;

import java.util.Scanner;

public class Q13RemoveDuplicate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========== Enter The String ========= ");
		String string = scanner.next();

		replace(string);

	}

	public static void replace(String s) {

		s=s.toLowerCase();
//		char[] c = string.toCharArray();
		String resultString="";
		int n = s.length() - 1;
		for (int i = 0; i <= n; i++) {
			int count = 1;
			for (int j = i + 1; j <= n; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
			resultString+=s.charAt(i);
			}
		}
		System.out.println(resultString);
	}
}
