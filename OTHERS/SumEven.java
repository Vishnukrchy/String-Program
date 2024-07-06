package OTHERS;

public class SumEven {
	public static void main(String[] args) {
		int sum =0; int Sum_Odd=0;
		for(int i=1;i<=100;i++) {
			if (i%2==0) {
				sum=sum+i;
			}else {
				Sum_Odd=Sum_Odd+i;
			}
		}
		System.out.println(" Sum Even is :"+sum);
		System.out.println(" Sum Odd is :"+Sum_Odd);
		int i=200;
		while(i<=1000) {
			if (i%2==0) {
				sum=sum+i;
			}else {
				Sum_Odd=Sum_Odd+i;
			}
		i++;	
		}
		System.out.println(" Sum Even is :"+sum);
		System.out.println(" Sum Odd is :"+Sum_Odd);
	}

}
