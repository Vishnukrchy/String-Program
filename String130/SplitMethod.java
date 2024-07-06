package String130;

/* split(string regullarExpression)  ***
split() methods take a regular expression and according to that expression it will split
the string into string [] array form
split methods store all the resultant string into string [] and it will retrun that string array
 
 1) split a String from an particular characters
    ex- Strings s1="Mohan is here";
        String s[]=s.split(" ");  ==> ["Mohan","is","here"]
        
        
  2) split(" ") => it will spite the string from every Space
  3) split("\\s") => it will spite the string from every space
  4) split("a") => it will spite the string when ever a will found
  
  **************** Split Exception case ************************
  5)split("a+")=> it will the split from the point when form one or more a is found
  6) split("\\s") => this method will split the string if one or more space is found
  

 ************************f Split From two more character   ************************************
   1) split("[@!#$"]") => by this split it will considered multiple characters and when any character is found 
   then it will split from that point
   2) split("^[ac]") => By The Split it will not considered  the expression that is provided
   3) split("[a-z]") => bY this split we can break a string whenever a lowercase alphabet will be found
   3) split("[a-z]+") => bY this split we can break a string whenever a lowercase alphabet will be found
   4) split("[0-9]") =>   its will spit when ever a digit from 0-9 will be found
   5) split("[0-9]+") =>  its will spit when ever one or more numeric digit  will be found
   5) split("[a-zA-z]+") => By this split we can  spit a string whenever one or more alphabet is found either
   In Uppercase or LowerCase 
   7) split("\\d") => By this split method will take the regular expression // and whenever a digit char is found
    then it will split from that point = Works like split("[0-9]")
   8)split("\\D") =>  
   9)split("[a|b)=> By This A String will spit whenever char a or char b is found 
  
    
   
   Q) For the given string add all the numeric digit found in string .
   if multiple digit are together then that should be considered as number
  
        
        */
public class SplitMethod {
	public static void main(String[] args) {
		String s1 = "Mohan is here and there";
		String string[] = s1.split(" ");
		// Get No of Words
		System.out.println(" total word count is => " + string.length);
		for (String string2 : string) {
			System.out.print(" Word is => " + string2);

		}

		reveseWord(s1);
		System.out.println();
		case1();
		case2();
		
		
		String str="abcaabdcfeabdvcse";
		String [] str1=str.split("[^bda]");
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}

	}

	public static void reveseWord(String s1) {
		String string[] = s1.split(" ");
		for (int i = string.length - 1; i >= 0; i--) {
			System.out.print("New String Is = > " + string[i]);
		}
	}

	public static void revevesTheWordchar(String s1) {
		System.out.println(" Original word Is " + s1);
		String string[] = s1.split(" ");
		for (String str : string) {
			String revWord = "";
			for (int i = 0; i < str.length(); i++) {
				revWord = str.charAt(i) + revWord;
			}
			System.out.println(revWord + " ");
		}

	}

	// Case -1 When string s="sdaaasddaasda"; => s.split("a")
	//
	public static void case1() {
		System.out.println("============== Case 1====================");
		String string = "bsfaaasdfdfasfa";
		System.out.println(" Oringnal string is " + string);
		String[] str = string.split("a");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static void case2() {
		System.out.println("============== Case 2 ====================");
		String string = "akbaacdapb";
		System.out.println(" Oringnal string is " + string);
		String[] str = string.split("a");
		System.out.println(" length is =>? " + string.length());
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	public static void case7() {
		System.out.println("============== Case 2 ====================");
		String string = "abcpacde34cde88ace";
		System.out.println(" Oringnal string is " + string);
		String[] str = string.split("\\d+");// work like [0-9]
		System.out.println(" length is =>? " + string.length());
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
