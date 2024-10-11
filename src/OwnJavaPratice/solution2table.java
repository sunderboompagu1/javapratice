package OwnJavaPratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution2table {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        int result = 0;
        for(int i=1;i<=10;i++) {
        	
        	result = N * i ;
        	System.out.println(N + "x"+ i + "=" + result);
        }

        bufferedReader.close();
	}


}
