package String130;

public class Q17_ReverseTheString_Word {
	public static void main(String[] args) {
		String original = "Hello World";
		String reversed = reverseString(original);

		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reversed);
	}

	public static String reverseString(String input) {
		String reversed="";
        String word="";
        for (int i = input.length()-1; i >=0; i--) {
			char c=input.charAt(i);
			if (c!=' ') {
				word=c+word;
			}
			if (c==' '|| i==0&&!word.isBlank() ) {
				reversed=reversed+word;
				System.out.println(word);
				word="";
			}
		}
        return reversed;
	}
	public static void getReverse(String string) {
		String str[]=string.split(" ");
		for (int i = str.length-1; i>=0 ; i--) {
			System.out.println(str[i]+" ");
			
		}
	}
}
