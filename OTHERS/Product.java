package OTHERS;

public class Product {
public static void main(String[] args) {
	int sum=0,product=1;
	int i =1;
	while(i<=10) {
		if(i%2==0) {
			sum=sum+i;
			product=product*i;
		}
		i++;
	}
	
	System.out.println(" sum is : "+sum);
	System.out.println(" Product  is : "+product);
	
}
}
