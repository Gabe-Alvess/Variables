package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        int age = 21;
        age = 22;
        System.out.println(age);

        // whole numbers
        byte smallNumber = 127;
        System.out.println(smallNumber);

        smallNumber++; // increase value by 1
        System.out.println(smallNumber);

        short mediumNumber = 32000;
        System.out.println(mediumNumber);

        int largeNumber = 2147483647;
        System.out.println(largeNumber);

        // L is required
        long veryLargeNumber = 9223372036854775807L;
        System.out.println(veryLargeNumber);

        System.out.println("---- decimal numbers ----");
        // decimal numbers
        double decimalNumber = 1.7976931348623157;
        System.out.println(decimalNumber);

        float floatDecimalNumber = 3.14F;
        System.out.println(floatDecimalNumber);

        System.out.println("---- other datatype ----");
        boolean male = true;
        System.out.println(male);

        char character = 'A';
        System.out.println(character);

        System.out.println("---- Non primitive datatype ----");
        String name = "Gabriel Alves";
        System.out.println(name);

        // don't use
        var x = 10;
        System.out.println(x);

        System.out.println("--- exercise 1 ----");

        byte byteExample = 100;
        byteExample = 110;
        System.out.println(byteExample);

        short shortExample = -5000;
        shortExample = -5050;
        System.out.println(shortExample);

        int intExample = 2000000000;
        intExample = 2100000000;
        System.out.println(intExample);

        long longExample = 999999999999999999L;
        longExample = 999999999999999991L;
        System.out.println(longExample);

        float floatExample = 3.14F;
        floatExample = 3.15F;
        System.out.println(floatExample);

        double doubleExample = 2.71828;
        doubleExample = 2.71829;
        System.out.println(doubleExample);

        char charExample = 'A';
        charExample = 'B';
        System.out.println(charExample);

        boolean booleanExample = true;
        booleanExample = false;
        System.out.println(booleanExample);
    }
}
