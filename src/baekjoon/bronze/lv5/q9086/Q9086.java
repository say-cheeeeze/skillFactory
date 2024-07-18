package baekjoon.bronze.lv5.q9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9086 {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int testCase = Integer.parseInt( br.readLine() );
		String[] strArr = new String[testCase];
		for( int i = 0; i < testCase; i++ ) {
			strArr[i] = br.readLine();
		}
		for( int str = 0; str < testCase; str++ ) {
			System.out.println( strArr[str].charAt( 0 )  + "" + strArr[str].charAt( strArr[str].length() - 1 ) );
		}
		

	}
}
