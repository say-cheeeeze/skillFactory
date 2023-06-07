package baekjoon.step08_basicmath1.q2720;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2720 {

	public static void main( String[] args ) throws IOException {
		
		// 16240KB	176ms
		solution1();
	}
	
	public static void solution1() throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int testCase = Integer.parseInt( br.readLine() );
		int[] changeArr = new int[ testCase ];
//		int[] changeArr = new int[] { 124,25,194 };
		
		for( int i = 0; i < testCase; i++ ) {
			changeArr[ i ] = Integer.parseInt( br.readLine() );
		}
		
		for( int i = 0; i < changeArr.length; i++ ) { 
			
			printChange( changeArr[ i ] );
		}
	}
	
	public static void printChange( int change ) {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println( "거스름돈 : " + change );
		
		sb.append( change / 25 + " " );
		change = change % 25;
		
		sb.append( change / 10 + " " );
		change = change % 10;
		
		sb.append( change / 5+ " " );
		change = change % 5;
		
		sb.append( change / 1);
		change = change % 1;
		
		System.out.println( sb );
		
	}
}
