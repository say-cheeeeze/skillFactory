package baekjoon.step09_sort.q10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Q10989 {

	public static void main( String[] args ) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
		int cnt = Integer.parseInt( reader.readLine() );
		
		int[] numArr = new int[ cnt ];
		
		for( int i = 0; i < cnt; i++ ) {
			
			numArr[i] = Integer.parseInt( reader.readLine() );
		}
		
		Arrays.sort( numArr );
		
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0; i < numArr.length; i++ ) {
			sb.append( numArr[i] + "\n" );
		}
		
		System.out.println( sb.toString().trim() );
	}
}
