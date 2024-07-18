package baekjoon.bronze.lv3.q2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2738 {
	public static void main( String[] args ) throws IOException {
		
		// 16640KB	184ms
		solution1();
	}
	
	private static void solution1() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() );
		int row = Integer.parseInt( st.nextToken() );
		int column = Integer.parseInt( st.nextToken() );
		
		System.out.println( "행 : " + row );
		System.out.println( "열 : " + column );
		
		int[][] matrix = new int[row][column];
		System.out.println( Arrays.deepToString( matrix ) );
		
		for( int i = 0; i < row*2; i++ ) {
			System.out.println( i + 1 + "번째 row");
			st = new StringTokenizer( br.readLine() );
			int columnCnt = st.countTokens();
			System.out.println( "column 개수 : " + columnCnt );
			
			for( int j = 0; j < columnCnt; j++ ) {
				System.out.println( "i / row : " + i / row );
				String columnValue = st.nextToken();
				matrix[ i % row ][ j ] += Integer.parseInt( columnValue );
			}
		}
		System.out.println( Arrays.deepToString( matrix ) );
		StringBuilder sb = new StringBuilder();
		for( int i = 0; i < row; i++ ) {
			for( int j = 0; j < matrix[i].length; j++ ) {
				
				sb.append( matrix[i][j] );
				
				if ( j != matrix[i].length - 1 ) {
					sb.append( " " );
				}
			}
			if ( i != matrix.length - 1 ) {
				sb.append( "\n" );
			}
		}
		System.out.println( sb );
	}
}
