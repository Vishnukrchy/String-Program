package String130;

import java.util.Scanner;

public class Q18EvenCharWord {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter The String");
		String s=sc.nextLine();
		System.out.println(" Original String  is is : "+s);
		System.out.println(" Even char word in String  is  : ");
		getEvencharstringWord(s);
		
		
	}
	public static void getEvencharstringWord(String s) {
		String [] str=s.split(" ");
		for (int i = 0; i < str.length; i++) {
			String word=str[i];
			if (word.length()%2==0) {
				System.out.println(word);
			}
		}
	}
}
