package String130;

import java.util.Scanner;

public class Q35DuplicateWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter The String ");
		String string = scanner.nextLine();

		countDuplicate(string);

	}

	private static void countDuplicate(String string) {
		String[] string2 = string.split(" ");
		int n = string2.length;
		int wordCounter = 0;
		for (int i = 0; i <n; i++) {
			int count = 1;

			for (int j = i + 1; j < n; j++) {
				if (string2[i].equalsIgnoreCase(string2[j])) {
					count++;
					string2[j] = string2[n-1];
					j--;
					n--;
				}
			}
			if (count >1) {

				wordCounter++;
				System.out.println(string2[i] + " is apeared Duplicates " + count + " Times");
			}
		}
		System.out.println(" Total Duplicate Word is => " + wordCounter);
	}
}
