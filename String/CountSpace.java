package String;
//WAJP TO COUNT SPACE CHAR IN STRING
import java.util.*;
public class CountSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string");
        String s = sc.nextLine();
        
        System.out.println(" Total String Count : "+s.length());
        System.out.println("Space in the given String is :  "+countSpace(s));
        
	}
	public static int countSpace(String s ) {
		int count =0;
		for(int i =0;i<s.length();i++) {
			char c =s.charAt(i);
			if(c==' ') {
				count++;
			}
			
		}
		return count;
	}

}
