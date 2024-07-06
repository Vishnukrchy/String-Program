package OTHERS;
import java.util.Scanner;

public class Factoriacl {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the Number ");
    int n =sc.nextInt();
    int fact =1;
    int fact1=1;
    for(int i=1;i<=n;i++) {
    	
    	fact=fact*i;
    	System.out.println("Fcatorial of "+n+"!"+" = "+fact);
    }
    System.out.println(" Factoriacl is :"+fact);
    System.out.println(" Enter the No Again");
    n=sc.nextInt();
    int i=1;
    while (n>=i) {
    	System.out.println("Fcatorial of "+i+"!"+" = "+fact1);
    	fact1=fact1*n;
		
		n--;
	}
}
}
