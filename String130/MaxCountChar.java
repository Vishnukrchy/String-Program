package String130;

import java.util.Scanner;

public class MaxCountChar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter The String");
	String s = sc.nextLine();
	System.out.println(" Original String  is is : " + s);
	maxCountChar(s);

	
}
public static void maxCountChar(String string) {
	int p[]=new int[256];
	int max=0;
	char target=' ';
	for (int i = 0; i < string.length(); i++) {
		p[string.charAt(i)]++;
	}
	for (int i = 0; i < p.length; i++) {
		   if (p[i]>max) {
			max=p[i];
			target=(char)i;
		}
	}
	System.out.println(target+" is apread max times "+max);
}
}
