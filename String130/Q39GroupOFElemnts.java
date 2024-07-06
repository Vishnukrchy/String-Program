package String130;

// in string str=" Mohan,
import java.util.Scanner;

public class Q39GroupOFElemnts {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter The No String ");
		int n = scanner.nextInt();
		scanner.nextLine();
		String [] strings=new String[n];
		for (int i = 0; i < strings.length; i++) {
			System.out.println(" Enter the "+i+1+" Elements");
			strings[i]=scanner.nextLine();
		}
		sortString(strings);

	}

	private static void sortString(String [] string) {
		int n=string.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n-i; j++) {
				if (string[i].compareToIgnoreCase(string[j])>0) {
					String tempString=string[i];
					string[i]=string[j];
					string[j]=tempString;
				}
			}
		}
		System.out.println("========================= Sorted Elemnts are ====================== ");
		for (String string2 : string) {
			System.out.print(string2+" ");
		}
	}
}
