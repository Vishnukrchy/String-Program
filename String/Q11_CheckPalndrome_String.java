package String;
import java.util.*;
public class Q11_CheckPalndrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.println(" Enter the string");
	     String s = sc.nextLine();
	     if (checkPlandrome(s)) {
			System.out.println(" Given String is Palandrome String : "+s);
		}
	     else {
	    	 System.out.println(" Given String is Not Palandrome String : "+s);
			
		}
	}
	public static boolean checkPlandrome(String s) {
		int n =s.length();
		for(int i=0; i<n/2;i++) {
//			char c =s.charAt(i);
			if(s.charAt(i)!=s.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}

}
