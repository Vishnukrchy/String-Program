package String;
import java.util.*;
public class Q13_Count_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.println(" Enter the string");
	     String s = sc.nextLine();
	     System.out.println(" total length is "+s.length());
	     System.out.println(" No of Words in Given String is : "+countWords(s));
	}
	public static int countWords(String s1) {
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if ((s1.charAt(i)>=65&&s1.charAt(i)<=91)||(s1.charAt(i)<=97&&s1.charAt(i)<=123)) {
				count++;
			}
		}
		return count;
	}

}
