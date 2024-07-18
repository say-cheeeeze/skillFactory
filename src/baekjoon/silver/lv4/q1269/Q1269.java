package baekjoon.silver.lv4.q1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1269 {
	
	public static void main( String[] args ) throws IOException {
	
		test1();
	}
	
	public static void test1() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st;
		int result = 0;
		String strInput = br.readLine();
		
		st = new StringTokenizer( strInput );
		int cntA = Integer.parseInt( st.nextToken() );
		int cntB = Integer.parseInt( st.nextToken() );
		
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		String strA = br.readLine();
		st = new StringTokenizer( strA );
		
		while( st.hasMoreTokens() ) {
			setA.add( Integer.parseInt( st.nextToken() ) );
		}
		
		String strB = br.readLine();
		st = new StringTokenizer( strB );
		
		while( st.hasMoreTokens() ) {
			
			int bNum = Integer.parseInt( st.nextToken() );
			setB.add( bNum );
			
			// 지금 A-B 차집합의 개수를 구할 수 있다.
			// Set 의 boolean contains() 는 O(n)
			if ( !setA.contains( bNum ) ) {
				System.out.println( "A 한테는 " + bNum + " 이 있고" );
				result++;
			}
		}
		System.out.println( setA );
		System.out.println( setB );
		
		for ( int aNum : setA ) {
			if ( !setB.contains( aNum ) ) {
				System.out.println( "B 한테는 " + aNum + " 이 있고" );
				result++;
			}
		}
		
		System.out.println( result );
	}
}
