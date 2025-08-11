package day1.basics;

public class TypeCasting {

	public static void main(String[] args) {
		 // Widening / Implicit Type Casting

        byte b = 10;
        int i = b;
        System.out.println(i); // Output: 10

        float f = 22.14f;
        double d = f;
        System.out.println(d); // Output: 22.14

        char ch = 'A';
        int i3 = ch;
        System.out.println(i3); // Output: 65 (ASCII value of 'A')

        char var1 = '\u00A7';
        int i4 = var1;
        System.out.println(i4); // Output: 167 (Unicode value of §)

        // Narrowing / Explicit Type Casting

        double f1 = 10.52f;
        long l = (long) f1;
        System.out.println(l); // Output: 10 (decimal truncated)

        long l1 = 923372036854775806L;
        int i2 = (int) l1;
        System.out.println(i2); // Output may overflow due to narrowing

        float f2 = 34.56f;
        int i1 = (int) f2;
        System.out.println(i1); // Output: 34 (decimal truncated)

        byte b1 = 90;
        char ch1 = (char) b1;
        System.out.println(ch1); // Output: Z (ASCII value of 90)

	}

}
