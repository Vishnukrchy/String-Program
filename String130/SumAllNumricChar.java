package String130;

import java.util.Scanner;

public class SumAllNumricChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========== Enter The String ========= ");
		String string = scanner.nextLine();
	
		
		sumOFEvenNumericChar(string);
	
	}
	private static void sumOFEvenNumericChar(String string) {
		int sum=0;
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			if (c>='0' && c<='9'  ){
				sum=sum+(c-48);
			}
		}
				System.out.println(" Sum OF All  Numeric Char : "+sum);
	}
}
