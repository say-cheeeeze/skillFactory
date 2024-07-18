package baekjoon.bronze.lv1.q11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11005 {
	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		int num = Integer.parseInt( st.nextToken() );
		int radix = Integer.parseInt( st.nextToken() );
		
		String radixNum = Integer.toString( num, radix ).toUpperCase();
		System.out.println( radixNum );
	}
	
}
