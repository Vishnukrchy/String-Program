 package String130;

import java.util.Scanner;
// WAJP TO PRINT THE FREQUENCY OF EACH Char 
public class GetCharFrequncy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The String");
		String s = sc.nextLine();
		System.out.println(" Original String  is is : " + s);
		//getFrequncy(s);
		getFrequncy1(s);
	}

	public static void getFrequncy(String string) {
		int arr[] = new int[256];
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			arr[c]++;
		}
		for (int i = 0; i < string.length(); i++) {

			System.out.println(string.charAt(i) + " is => " + arr[string.charAt(i)] + " times");
		}
		
	}
	public static void getFrequncy1(String string) {
		int arr[] = new int[256];
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			arr[c]++;
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i]>0 &&arr[i]!=32) {
				System.out.println((char)i+" is "+arr[i]+" Times");
			}
		}
		
	}
	
}
