package String130;

public class Q33Reverese_theWord {
public static void main(String[] args) {
	
}
private static void getWordFrequncy(String s) {
	String [] p =getArray(s);
	int n=p.length;
	for (int i = 0; i < n; i++) {
		int count=0;
		for (int j = i+1; j < n; j++) {
			if (p[i].equalsIgnoreCase(p[j])) {
				count++;
				p[j]=p[n-1];
				j--;
				n--;
			}
		}
		System.out.println(p[i]+ " is Count => "+count+" Times");
	}
}
public static int countWords(String s) {
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		char c=s.charAt(i);
		if (i==0 &&c!=' '|| s.charAt(i-1)==' ' &&s.charAt(i)!=' ') {
			count++;
		}
	}
	return count;
}
public static String[] getArray(String s1) {
	String [] p = new String[countWords(s1)];
	
	String wordString ="";
	for (int i = 0; i < s1.length(); i++) {
		char c=s1.charAt(i);
		if (c==' ') {
			wordString=wordString+c;
		}
		if () {
			
		}
	}
}
}
