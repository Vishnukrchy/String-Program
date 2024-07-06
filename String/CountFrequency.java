package String;
import java.util.*;
public class CountFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter STring: ");
		String s1=sc.nextLine();
		System.out.println("The String is: "+s1);
		System.out.println("All character Frequency is: ");
		getFrequency(s1);
	}
	public static void getFrequency(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char p=s.charAt(i);
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(p==s.charAt(j))
				{
					count++;
					s=s.substring(0, j)+s.substring(j+1, s.length());
					j--;
				}
			}
			System.out.println(p+" is: "+count+" times");
		}
		System.out.println("New String is: "+s);
	}
}

