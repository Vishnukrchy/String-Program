package String;
import java.util.*;
public class CountFrequencyq26 {
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
			char[] p=s.toCharArray();
			int n=s.length();
			for(int i=0;i<n;i++)
			{
				int count=1;
				for(int j=i+1;j<n;j++)
				{
					if(p[i]==p[j])
					{
						count++;
						p[j]=p[n-1];
						j--;
						n--;
					}
				}
			System.out.println(p[i]+" is: "+count+" times");
		}
	}

}
