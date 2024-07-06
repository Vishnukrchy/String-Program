package String;
//WAJP TO COUNT VOWELS CHAR IN STRING
import java.util.*;
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string");
        String s = sc.nextLine();
        int count =0;
        System.out.println(" Vovels is : "+countVowels(s));

	}
	public static String countVowels(String s1) {
		String vowels ="";
		int count =0;
		for(int i =0 ; i<s1.length();i++) {
			char c =s1.charAt(i);
			if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U' ||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowels=""+c;
				count++;
			}
		}
        System.out.println(" Count Of Vopwels is : "+count);
		return vowels;
	}
	

}
