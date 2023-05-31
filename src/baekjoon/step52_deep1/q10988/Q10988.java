package baekjoon.step52_deep1.q10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {
	public static void main( String[] args ) throws IOException {
	
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		String inputStr = br.readLine();
		System.out.println( inputStr );
		
		StringBuffer sb = new StringBuffer( inputStr );
		System.out.println( sb.reverse() );
		String reversedStr = sb.reverse().toString();
		
		if ( inputStr.equals( reversedStr ) ) {
			System.out.println( "1" );
		}
		else {
			System.out.println( "0" );
		}
	}
}
