package baekjoon.step49_set.q10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q10815 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
//		int N = Integer.parseInt( br.readLine() );
		int N = 5;
//		StringTokenizer st = new StringTokenizer( br.readLine(), " " );
		StringTokenizer st = new StringTokenizer( "6 3 2 10 -10" );
		Map<Integer, Integer> cardMap = new HashMap<>();
		
		for( int i = 0; i < N; i++ ) {
			cardMap.put( Integer.parseInt( st.nextToken() ), 1 );
		}

//		int M = Integer.parseInt( br.readLine() );
		int M = 8;
//		st = new StringTokenizer( "10 9 -5 2 3 4 5 -10", " " );
		st = new StringTokenizer( br.readLine(), " " );
		StringBuilder sb = new StringBuilder();
		for( int i = 0; i < M; i++ ) {
			int checkNum = Integer.parseInt( st.nextToken() );
			
			System.out.println( checkNum + "이 cardMap 의 key 로써 존재하는가?" );
			System.out.println( cardMap.get( checkNum ) );
			if ( null == cardMap.get( checkNum ) ) {
				sb.append( 0 + " " );
			}
			else {
				sb.append( 1 + " "  );
			}
		}
		
		System.out.print( sb );
	}
}
