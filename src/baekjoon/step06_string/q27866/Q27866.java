package baekjoon.step06_string.q27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27866 {
	
	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		String inputStr = br.readLine();
		int intNum = Integer.parseInt( br.readLine() );
		System.out.println( inputStr.charAt( intNum - 1 ) );
	}
}
