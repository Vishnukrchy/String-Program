package String;
import java.util.Scanner;
public class Q5_NumChar_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string");
        String s = sc.nextLine();
       returnNumber_index(s);

	}
	public static void returnNumber_index(String s) {
		
        for(int i=0;i<s.length();i++) {
    		char c = s.charAt(i);
    		
    		if (c>=48&&c<=57) {
			System.out.println(" Numeric Index is : "+i);
			}
        }
		
		
	
	}

}
