package baekjoon.step09_sort.q1427;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1427 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
//		String strNum = br.readLine();
		String strNum = "500613009";
		
		String[] strArr = strNum.split( "" );
		int[] numArr = new int[ strArr.length ];
		for( int i = 0; i < strArr.length; i++ ) {
			numArr[ i ] = Integer.parseInt( strArr[i] );
		}
		System.out.println( Arrays.toString( numArr ) );
		
		Arrays.sort( numArr );
		System.out.println( Arrays.toString( numArr ) );
		StringBuilder sb = new StringBuilder();
		
		for( int i = numArr.length - 1; i >= 0; i-- ) {
			sb.append( numArr[ i ] );
		}
		int result = Integer.parseInt( sb.toString() );
		System.out.println( result );
	}
}
