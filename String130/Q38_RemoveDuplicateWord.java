package String130;

import java.util.Scanner;
// WAJP TO Remove the duplicate word in string
public class Q38_RemoveDuplicateWord {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter The String ");
		String string=scanner.nextLine();
		System.out.println(" Original string is => "+string);
		
	System.out.println("New String is => "+removeDuplicateWord_String(string));
	//	removeDuplicateWord_String(string);
	}
	private static String removeDuplicateWord_String(String string) {
		String [] string2=string.split(" ");
		int n=string2.length;
	
		for (int i = 0; i <n; i++) {
			int count=1;
			
			for (int j = i+1; j <n; j++) {
				if (string2[i].equalsIgnoreCase(string2[j])) {
					count++;
					string2[j]=string2[n-1];
					j--;
					n--;
				}
			}
			
		}
		// Now WE GET Uniqe  String Array  elements duplicate will be remove and 
		// now we can strore into string or Array
		
		String uniqeWord="";
		for (int i = 0; i <n; i++) {
			uniqeWord=uniqeWord+string2[i]+" ";
		}
		return uniqeWord;
	}
}
