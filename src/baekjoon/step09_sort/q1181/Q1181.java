package baekjoon.step09_sort.q1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1181 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int num = Integer.parseInt( br.readLine() );
		String[] strArr = new String[ num ];
		
		for( int i = 0; i < num; i++ ) {
			strArr[ i ] = br.readLine();
		}
		
		Arrays.sort( strArr, ( a, b ) -> {
			if ( a.length() == b.length() ) {
				return a.compareTo( b );
			}
			else {
				return a.length() - b.length(); 
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for( int i = 0; i < strArr.length; i++ ) {
			if ( sb.indexOf( strArr[i] ) == -1 ) { 
				sb.append( strArr[i] + "\n" );
			}
		}
		System.out.println( sb );
		
	}
}
