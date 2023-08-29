package baekjoon.step52_deep1.q10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {
	public static void main( String[] args ) throws IOException {
	
//		solution1();
		
		String str1 = "윤재야 와서 밥먹어라";
		System.out.println( str1 );
		
		StringBuilder sb = new StringBuilder();
		
		char[] arrChar = str1.toCharArray();
		for( int i = arrChar.length - 1; i >= 0; i-- ) {
//			System.out.print( arrChar[ i ] );
			sb.append( arrChar[ i ] );
		}
		System.out.print( "=> ");
		System.out.println( sb.toString());
		
		//		StringBuffer sb = new StringBuffer( str1 );
//		sb = sb.reverse();
//
//		System.out.println( sb.toString() );
		
	}
	
	
	
	public static void solution1() throws IOException {
		
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
