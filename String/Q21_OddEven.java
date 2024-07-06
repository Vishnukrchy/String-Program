package String;
import java.util.*;
public class Q21_OddEven {
public static void main(String[] args) {
	String [] arr = {"Even","Odd"};
	Scanner sc =new Scanner(System.in);
	System.out.println(" Enter The No ");
	int no=sc.nextInt();
	System.out.println(" No is "+arr[no%2]);
}
}
