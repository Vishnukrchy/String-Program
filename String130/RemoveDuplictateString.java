package String130;

import java.util.Scanner;

// take string input and remove Duplicate Char
// Input - "abcdxsda"
//output - "abcdxs"; only 
public class RemoveDuplictateString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========== Enter The String ========= ");
		String string = scanner.next();
		System.out.println(" new String is " + removeDupicateChar(string));

		 //reemove(string);
		removeDupicateChar(string);

	}
	public static String removeDupicateChar(String string) {
		char[] c = string.toCharArray();
		int n = string.length();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (c[i] == c[j]) {
					c[i] = c[n - 1];
					j--;
					n--;
				}
			}
		}

		String result = "";
		for (int i = 0; i <n; i++) {
			result = result + c[i];
		}

		return result;
	}

	public static void reemove(String string) {
		int[] a = new int[256];
		for (int i = 0; i < string.length(); i++) {
			a[string.charAt(i)]++;
//			System.out.println(a[i]);
		}
		System.out.println("=================================");
		for (int i = 0; i < a.length; i++) {
			// Here For Unique char a[i]=1
			if (a[i] >0) {
				System.out.print((char) i);

			}
		}
	}
}
