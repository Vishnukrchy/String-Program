package String130;

public class Q17_ReverseStringWord {
	 public static void main(String[] args) {
	        String original = "Hello  World!";
	        System.out.println("========Original: " + original);
	        System.out.println("=======Reversed: " + reverseString(original));
	    }

	    public static String reverseString(String input) {
	        String reversed = ""; // To store the reversed string
	        String word = ""; // To store each word temporarily
	        
	        // Iterate through the characters of the input string
	        for (int i = input.length() - 1; i >= 0; i--) {
	            char c = input.charAt(i);

	            // If the character is not a space, add it to the current word
	            if (c != ' ') {
	                word = c + word;
	            } else {
	                // If it's a space, add the current word to the reversed string
	                reversed += word;
	                word = ""; // Reset the word for the next word
	            }

	            // Add the last word to the reversed string if it's the last iteration
	            if (i == 0 && !word.isBlank()) {
	                reversed += word;
	            }
	        }

	        return reversed;
	    }
}
