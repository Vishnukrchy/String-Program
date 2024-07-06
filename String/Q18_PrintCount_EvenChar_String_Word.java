package String;

import java.util.Scanner;
import java.util.Arrays;
public class Q18_PrintCount_EvenChar_String_Word {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter The String");
		String s=sc.nextLine();
		System.out.println(" Original String  is is : "+s);
		
   System.out.println(" total words is "+printCountString(s));
}
	public static int printCountString(String s) {
	int count =0;
	String [] arr =s.split(" ");
	for(int i=0;i<arr.length;i++) {
		String k=arr[i];
		if(!k.isBlank()) {
			if(k.length()%2==0) {
				System.out.println(k);
				count++;
			}
		}
	}
	System.out.print(arr.toString());
	return count;
	
	}
}
