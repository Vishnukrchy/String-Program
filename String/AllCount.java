package String;

public class AllCount {

	public static int countSpace(String s ) {
		int count =0;
		for(int i =0;i<s.length();i++) {
			char c =s.charAt(i);
			if(c==' ') {
				count++;
			}
			
		}
		return count;
	}
	public static int countWithoutSpace(String s ) {
		int count =0;
		for(int i =0;i<s.length();i++) {
			char c =s.charAt(i);
			if(c!=' ') {
				count++;
			}
			
		}
		return count;
	}
	public static int countUpeercase(String s ) {
		int count =0;
		for(int i =0;i<s.length();i++) {
			char c =s.charAt(i);
			if(c<='A' && c<='Z') {
				count++;
			}
			
		}
		return count;
	}
	public static int countLowerpeercase(String s ) {
		int count =0;
		for(int i =0;i<s.length();i++) {
			char c =s.charAt(i);
			if(c<='a' && c>='z') {
				count++;
			}
			
		}
		return count;
	}
	public static int countNumericChar(String s) {
		int count =0;
		for(int i =0;i<s.length();i++) {
			char c =s.charAt(i);
			if (c>=47&&c<=58) {
				count++;
			}
		}
		return count;
	}
}
