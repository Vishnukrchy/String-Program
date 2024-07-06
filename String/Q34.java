package String;

import java.util.Scanner;

public class Q34 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter STring: ");
		String s1=sc.nextLine();
		System.out.println("The String is: "+s1);
		System.out.println("All Word Frequency is: ");
		countDuplicateWords(s1);
	}
	public static void countDuplicateWords(String s) {
		String [] k=s.split(" ");
		int n=k.length;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if (k[i].equalsIgnoreCase(k[j])) {
					count++;
					k[j]=k[n-1];
					n--;
					j--;
				}
			}
			System.out.println(k[i]+" Is Apear : "+ count+" times");
		
				
		}
		String p="";
		for(int i=0;i<n;i++) {
			p=p+k[i]+" ";
		}
		System.out.println(" New String Is : "+p);
	}
}
