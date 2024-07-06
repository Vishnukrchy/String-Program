package String;
import java.util.*;
public class Q6_SpaceChar_Index {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string");
        String s = sc.nextLine();
        returnSpace_index(s);
	}
public static void returnSpace_index(String s) {
		
        for(int i=0;i<s.length();i++) {
    		char c = s.charAt(i);
    		
    		if (c==' ') {
			System.out.println(" Numeric Index is : "+i);
			}
        }

}
}
