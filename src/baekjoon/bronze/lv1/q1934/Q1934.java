package baekjoon.bronze.lv1.q1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1934 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		int caseCnt = Integer.parseInt( br.readLine() );
		for( int i = 0; i < caseCnt; i++ ) {
			
			StringTokenizer st = new StringTokenizer( br.readLine() );
			int a = Integer.parseInt( st.nextToken() );
			int b = Integer.parseInt( st.nextToken() );
			
			int x = a;
			int y = b;
			while( y != 0 ) {
				int temp = y;
				y = x % y;
				x = temp;
			}
			sb.append( (a * b) / x ).append( "\n" );
		}
		
		System.out.print( sb );
	}
	
	public static List<Integer> getFactorList( int num ) {
		List<Integer> factorList = new ArrayList<>();
		int factorAcc = 1;
		while ( true ) {
			
			if ( factorAcc == num ) {
				factorList.add( factorAcc );
				break;
			}
			
			int remainder = num % factorAcc; // 나머지
			
			if ( remainder == 0 ) {
				factorList.add( factorAcc );
			}
			factorAcc++;
		}
		return factorList;
	}
}
