package baekjoon.bronze.lv3.q2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2566 {
	public static void main( String[] args ) throws IOException {
		
		//14156KB 124ms
		solution();
	}
	
	private static void solution() throws IOException {
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int[][] matrixOfNatural = new int[9][9];
		int maxVal = 0;
		int m = 0;
		int n = 0;
		
		for( int row = 0; row < 9; row++ ) {
			
			StringTokenizer st = new StringTokenizer( br.readLine() );
			for( int column = 0; column < 9; column++ ) {
				int columnVal = Integer.parseInt( st.nextToken() );
				matrixOfNatural[row][column] = columnVal;
				if ( columnVal > maxVal ) {
					maxVal = columnVal;
					m = row;
					n = column;
				}
			}
		}
		
		System.out.println( Arrays.deepToString( matrixOfNatural ) );
		System.out.println( "최대값 : " + maxVal );
		System.out.println( "행 : " + m + 1);
		System.out.println( "열 : " + n + 1 );
		
		// 입력할 때 이미 최대값을 알 수 있나?
	}
}
