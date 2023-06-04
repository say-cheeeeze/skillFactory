package baekjoon.step2_array2d.q10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10798 {
	public static void main( String[] args ) throws IOException {
		
		//14312KB	128ms
		solution();
		
		// 이차원배열은행마다요소의수가같지않을수있다();
		
	}
	
	private static void solution() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String[][] wordMatrix = new String[5][];
		StringBuilder sb = new StringBuilder();
		int maxColumn = 0;
		for( int row = 0; row < 5; row++ ) {
			
//			StringTokenizer st = new StringTokenizer( br.readLine(), "" );
			String[] strLine = br.readLine().split("");
//			int tokenCnt = st.countTokens();
			int tokenCnt = strLine.length;
			System.out.println( row + "행의 글자수 : " + tokenCnt );
			wordMatrix[row] = new String[tokenCnt];
			
			for( int column = 0; column < tokenCnt; column++ ) {
				
				wordMatrix[row][column] = strLine[column];
			}
			
			if ( tokenCnt > maxColumn ) {
				maxColumn = tokenCnt;
			}
		}
		
		System.out.println( "세로줄 읽기 ####################" );
		System.out.println( "wordMatrix : " + Arrays.deepToString( wordMatrix ) );
		
		for( int column = 0; column < maxColumn; column++ ) {
			
			for( int row = 0; row < wordMatrix.length; row++ ) {
				
//				System.out.println( "column : " + column + " / wordMatrix[row].length : " + wordMatrix[row].length  );
				
				if ( column >= wordMatrix[row].length ) {
					System.out.println( "continue" );
					continue;
				}
				
				sb.append( wordMatrix[row][column] );
			}
		}
		
		System.out.println( sb );
	}
	
	private static void 이차원배열은행마다요소의수가같지않을수있다() {
		
		String[][] testArr = new String[5][];
		
		for( int i = 0; i < 5; i++ ) {
			testArr[i] = new String[i+1];
			
			for( int j = 0; j < i+1; j++ ) {
				
				testArr[i][j] = String.valueOf( j );
			}
		}
		
		System.out.println( Arrays.deepToString( testArr ) );
	}
}
