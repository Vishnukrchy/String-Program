package OTHERS;
import java.util.*;
public class Mupltiplaction_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the TableNumber");
        int n =sc.nextInt();
        for(int i=0;i<=10;i++) {
        	int table = n*i;
        	System.out.println(n+"*"+i+"="+table);
        }
	}

}
