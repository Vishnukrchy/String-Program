package String130;

import java.util.Scanner;

public class Q22CaptalizeFirstChar {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println(" Enter The String");
	String s=sc.nextLine();
	System.out.println(" Original String  is is : "+s);
	captalizeFirstChar(s);
}
public static void captalizeFirstChar(String string) {
	String resultString="";
	for (int i = 0; i < string.length(); i++) {
		char c=string.charAt(i);
		if (i==0 &&c!= ' ' || c!=' '&&string.charAt(i-1)==' '&&c>='a'&&c<='z') {
			resultString=resultString+(c+"").toUpperCase();
			//resultString=resultString+(char)+(c-32);
		}else {
			resultString=resultString+c;
		}
	}
	System.out.println(" New String is : "+resultString);
}
}
