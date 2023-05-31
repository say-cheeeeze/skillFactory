package baekjoon.step06_string.q11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11718 {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		while( true ) {
			String inputStr = br.readLine();
			
			System.out.println( inputStr + ">> equals( '' )? : " + inputStr.equals( "" ) );
			
			if ( null == inputStr || inputStr.equals( "" ) ) {
				break;
			}
			sb.append( inputStr + "\n" );
		}
		System.out.println( sb );
	}
}
