package String;

import java.util.Scanner;
public class Q13_CountWords {
	 public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println(" Enter The String");
			String s=sc.nextLine();
			System.out.println(" Original String  is is : "+s);
			System.out.println(" Total Words in Given String is : "+getCountWords(s));
}
//	 public static int countWords(String s) {
//		int count =0;
//		String  [] c =s.split(" ");
//		int n=s.length();
//		for(int i=0;i<c.length;i++) {
//			if (i==0&&s.charAt(i)==' '||s.charAt(i-1)==' ') {
//				count++;
//			}
//		}
//		return count;
//	}
	 public static int getCountWords(String s) {
		int n=s.length();
		String[] c =s.split(" ");
		int count=0;
		for(int i=0 ;i<c.length;i++) {
			String k =c[i];// Char can not Store String Value
			// String Method isBlank Return true if String is Empty or cantain any white space
			if(!k.isBlank()) {
				count++;
			}
		}
		return count;
			
	}
}