package String130;

import java.util.Scanner;

// WAJP TO PRINT THE OCCURANCE OF PARTICULAR WORDS
// like is 2 Times in Given String
public class Q37OccuranceOfParticularWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter The String ");
		String string = scanner.nextLine();
		wordOccurance(string);

	}

	private static void wordOccurance(String string) {
		Scanner scanner = new Scanner(System.in);
		String[] string2 = string.split(" ");
		int n = string2.length;
		System.out.println(" Enter The Word ");
		String word = scanner.next();
		for (int i = 0; i < n; i++) {
			int count = 1;

			for (int j = i + 1; j < n; j++) {
				if (string2[i].equalsIgnoreCase(string2[j])) {
					count++;
					string2[j] = string2[n - 1];
					j--;
					n--;
				}
			}
			if (string2[i].equalsIgnoreCase(word)) {

				System.out.println(string2[i] + " is apeared  " + count + " Times");
			}
		}

	}

	private static void wordOccurance1(String string) {
		Scanner scanner = new Scanner(System.in);
		String[] string2 = string.split(" ");
		int n = string2.length;
		System.out.println(" Enter The Word ");
		String word = scanner.next();
		int count = 0;
		for (int i = 0; i < n; i++) {

			if (string2[i].equalsIgnoreCase(word)) {
				count++;

			}
		}
		System.out.println(word + " is apeared  " + count + " Times");
	}
}
