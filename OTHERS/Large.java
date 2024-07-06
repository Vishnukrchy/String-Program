package OTHERS;

public class Large {
public static void main(String[] args) {
	int a=8,b=9,c=0,largest;
	if (a>b) {
		if (a>c) {
			largest=a;
		}else {
			largest=c;
		}
	}
	else if (b>c) {
		largest=b;
	}else {
		largest=c;
	}
	System.out.println(largest);
	
}
}
