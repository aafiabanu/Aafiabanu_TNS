package day1.basics;

public class Char {

	public static void main(String[] args) {
		 char ch = 'a';
	        System.out.println(ch);  // Output: a

	        // assigning number to char (ASCII value of 65 is 'A')
	        char ch1 = 65;
	        System.out.println(ch1); // Output: A

	        // assigning Unicode to char
	        char var1 = '\u00A7';     // § symbol
	        System.out.println(var1);

	        // Unicode representation
	        char var2 = '\u20AC';     // € symbol
	        System.out.println(var2);

	        // ASCII code representation
	        int a = 'A';              // ASCII value of 'A' is 65
	        System.out.println(a);    // Output: 65

	}

}
