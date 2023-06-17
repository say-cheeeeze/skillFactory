package baekjoon.step09_sort.q2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2587 {
	
	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int[] numArr = new int[5];
		int average = 0;
		for( int i = 0; i < numArr.length; i++ ) {
			numArr[i] = Integer.parseInt( br.readLine() );
			average += numArr[i];
		}
		average = average / 5;
		
		System.out.println( "평균 : " + average );
		Arrays.sort( numArr );
		
		System.out.println( Arrays.toString( numArr ) );
		
		System.out.println( "중앙값 : " + numArr[ numArr.length / 2] );
	}
}
