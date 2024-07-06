package String130;

import java.util.Scanner;

public class Q19_First_NonreppetingCharIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The String");
		String s = sc.nextLine();
		System.out.println(" Original String  is is : " + s);
		firstNonRepeating(s);
		System.out.println(getfirstNonRepeating(s));;
	}
	public static void firstNonRepeating(String s) {
		s=s.toLowerCase();
		int[] arr=new int[256];
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			arr[c]++;
		}
		for(int i=0;i<s.length();i++)
		{
			if(arr[s.charAt(i)]==1)
			{
				System.out.print("first non repeating chracter is:"+s.charAt(i)+"at index of"+i);
				return;
			}
		}
	}
	public static String getfirstNonRepeating(String s) {
		int n=s.length();
		for (int i = 0; i <n; i++) {
			char c=s.charAt(i);
			int j;
			for ( j= 0; j < n; j++) {
				if (i!=j &&c==s.charAt(j)) {
					break;
				}
				
			}
			if (j==n) {
				return " first non-repiting char "+c+" and index is "+i;
			}
			
		}
		return "no first non-repiting char and index is ";
	}
}
