package String;

import java.util.Scanner;

public class Q28UnqueCharinstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter STring: ");
		String s1=sc.nextLine();
		System.out.println("The String is: "+s1);
		System.out.println("All character Frequency is: ");
		getFrequency(s1);
	}
	public static void getFrequency(String s) {
		char [] ch=s.toCharArray();
		int n=ch.length;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if (ch[i]==ch[j]) {
					count++;
					ch[j]=ch[n-1];
					n--;
					j--;
					
				}
			}
			System.out.println(ch[i]+" Is apear "+count+" times");
			if (count==1) {
				System.out.println( ch[i]+" is apeas Only Ones times");
			}
		}
	}
}
