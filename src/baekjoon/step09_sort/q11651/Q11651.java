package baekjoon.step09_sort.q11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11651 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int X = Integer.parseInt( br.readLine() );
		int[][] coordinates = new int[X][2];
		StringTokenizer st = null;
		for( int i = 0; i < X; i++ ) {
			String str = br.readLine();
			st = new StringTokenizer( str, " " );
			while( st.hasMoreTokens() ) {
				coordinates[i][0] = Integer.parseInt( st.nextToken() );
				coordinates[i][1] = Integer.parseInt( st.nextToken() );
			}
		}
		// 핵심 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		// 2차원배열은 sort() 를 사용할 수 없고, Comparable 을 구현해야한다.
		
		Arrays.sort( coordinates, ( a, b ) -> {
			if ( a[1] > b[1] ) {
				return 1;
			}
			else if ( a[1] == b[1] ) {
				return a[0] - b[0];
			}
			else {
				return -1;
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		for( int i = 0; i < coordinates.length; i++ ) {
			sb.append( coordinates[i][0] + " " + coordinates[i][1] + "\n" );
		}
		System.out.println( sb.toString() );
	}

}
