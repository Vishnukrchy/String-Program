package String;

import java.util.Scanner;

public class Q30_OcuuranceOfEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter STring: ");
		String s1=sc.nextLine();
		System.out.println("The String is: "+s1);
		System.out.println("All Word Frequency is: ");
		occuranceOfEachWord(s1);
	}
	public static void occuranceOfEachWord(String s) {
		String [] s1=s.split(" ");
		int n=s1.length;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if (s1[i].equalsIgnoreCase(s1[j])) {
					count++;
					s1[j]=s1[n-1];
					n--;
					j--;
				}
			}
			System.out.println(s1[i]+" Is Apear "+count+" times");
		}
	}
}
