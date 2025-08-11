package day1.basics;

public class Identifiers {

	public static void main(String[] args) {
		 // Variable declaration - Invalid Identifier Examples

        /*
        int for = 13; // Error because 'for' is a Java keyword
        System.out.println("value of the number variable is :" + for);
        */

        /*
        int number 2 = 13; // Error because space is not allowed in identifiers
        System.out.println("value of the number variable is :" + number 2);
        */

        // Error because identifier cannot start with @ or #
        // int @number3 = 10;

        // Valid Identifier Examples

        int $number = 20; // Valid: starts with $
        System.out.println("value of the number variable is : " + $number);

        String studentName = "Aniket"; // Valid: uses camelCase naming
        System.out.println("value is : " + studentName);

	}

}
