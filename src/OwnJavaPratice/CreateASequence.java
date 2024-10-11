package OwnJavaPratice;

import java.util.Scanner;

public class CreateASequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int a = in.nextInt(); // First number
            int b = in.nextInt(); // Second number
            int n = in.nextInt(); // Number of terms
            
            int currentTerm = a; // Initialize with 'a'
            StringBuilder result = new StringBuilder();
            int powerOfTwo = 1; // Start with 2^0
            
            for (int j = 0; j < n; j++) {
                currentTerm += (powerOfTwo * b); // Update current term
                result.append(currentTerm).append(" "); // Append to result
                powerOfTwo *= 2; // Update to next power of 2
            }
            
            System.out.println(result.toString().trim()); // Print result
        }
        
        in.close(); // Close the scanner
    }
}
