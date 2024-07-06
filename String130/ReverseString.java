package String130;
// WAJP TO TAKE STRING INPUT AND PRINT THE REVERSE OF STRING
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========== Enter The String ========= ");
		String string = scanner.nextLine();
		System.out.println("Reverse String is By string 0 " + getReverse(string));
		System.out.println("==================================================");
		System.out.println("Reverse String is By string 1 " + getReverse1(string));

	}

	public static String getReverse(String string) {
		String reversString = "";

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			reversString = c + reversString;
		}
		return reversString;
	}

	public static String getReverse1(String string) {
		String reversString = "";

		for (int i = string.length() - 1; i >= 0; i--) {
			char c = string.charAt(i);
			reversString = reversString + c;
		}
		return reversString;
	}

}
