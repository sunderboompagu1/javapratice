package OwnJavaPratice;
import java.util.Scanner;

public class PrintDataTypesByInputIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            try {
                long number = sc.nextLong(); // Try reading as long first
                
                System.out.println(number + " can be fitted in:");
                
                // Check if it can fit in byte
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                // Check if it can fit in short
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                // Check if it can fit in int
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                // If it can fit in long
                System.out.println("* long");
                
            } catch (Exception e) {
                // If an exception occurs (input too large for long), handle it here
                String number = sc.next(); // Get the problematic input
                System.out.println(number + " can't be fitted anywhere.");
            }
        }
    }
}
