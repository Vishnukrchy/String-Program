package String130;

import java.util.Scanner;

public class Q33WordFrequncy {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The string");
		String string = scanner.nextLine();
		System.out.println();
		getFrequncyOfword(string);
	}

	public static void getFrequncyOfword(String string) {
		String stringArray[] = string.split(" ");
//		for (String string2 : stringArray) {
//			System.out.print(string2+" ");
//		}
//		System.out.println();
		int n=stringArray.length;
		for (int i = 0; i <n; i++) {
			int count=1;
			for (int j = i+1; j < n; j++) {
				if (stringArray[i].equalsIgnoreCase(stringArray[j])) {
					count++;
					stringArray[j]=stringArray[n-1];
					j--;
					n--;
				}
			}
			System.out.println(stringArray[i]+"  => "+count+" Times");
		}
	}
}