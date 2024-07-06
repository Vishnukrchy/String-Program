package String130;

import java.util.Scanner;

// WAJP TO COUNT & PRINT THE UNIQUE WORD IN STRING 
public class Q34_CountUniqueWord_String {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println(" Enter The String ");
	String string=scanner.nextLine();
	
	countUniqeWord(string);
	
}
private static void countUniqeWord(String string) {
	String [] string2=string.split(" ");
	int n=string2.length-1;
	int wordCounter=0;
	for (int i = 0; i <= n; i++) {
		int count=1;
		
		for (int j = i+1; j <=n; j++) {
			if (string2[i].equalsIgnoreCase(string2[j])) {
				count++;
				string2[j]=string2[n];
				j--;
				n--;
			}
		}
		if (count==1) {
			
			wordCounter++;
			System.out.println(string2[i]+" is apeared Only ones times "+count+" Times");
		} 
	}
	System.out.println(" Total Uniqe Word is => "+wordCounter);
}
}
