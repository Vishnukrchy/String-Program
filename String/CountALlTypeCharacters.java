package String;
import java.util.*;
public class CountALlTypeCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string");
        String s = sc.nextLine();
        
        AllCount a=new AllCount();
        
       System.out.println(" Total String Count : "+s.length());
       System.out.println("WithoutSpace charater in the given String is :   "+a.countWithoutSpace(s));
       System.out.println(" Total Space  in the given String : "+a.countSpace(s));
       System.out.println(" Total Space Uppercase  in the given String : "+a.countUpeercase(s));
       System.out.println(" Total Space Lowercase in the given String : "+a.countLowerpeercase(s));
       System.out.println(" Total Space Numeric in the given String : "+a.countNumericChar(s));
        
        
	}
	

}
