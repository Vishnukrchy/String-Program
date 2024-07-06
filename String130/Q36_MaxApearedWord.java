package String130;

import java.util.Scanner;

public class Q36_MaxApearedWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter The String ");
		String string = scanner.nextLine();
		maxAppreadeWord_String(string);
	}

	public static void maxAppreadeWord_String(String string) {
        String [] s =string.split(" ");
        int n=s.length-1;
        int maxApread=0;
        String tragetWord="";
        for (int i = 0; i <=n; i++) {
			int count=1;
			for (int j = i+1; j <=n; j++) {
				if (s[i].equalsIgnoreCase(s[j])) {
					s[j]=s[n];
					count++;
					j--;
					n--;
				}
			}
			if (maxApread<=count) {
				maxApread=count;
				tragetWord=s[i];
			}
		}
        System.out.println(" Maximum Apread Words is => "+tragetWord+" Apread is "+maxApread+" Times");
	}
}
