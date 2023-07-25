package baekjoon.step49_set.q11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q11478 {
	
	public static void main( String[] args ) throws IOException {
		
//		test1();
		
		test2();//맞았습니다!!	227012	776
	}
	
	public static void test1() throws IOException  {
		String S = "ababc";
		StringBuilder sb = new StringBuilder();
		char[] charArr = S.toCharArray();
		Set<String> setA = new HashSet<>();
		
		for( int startIdx = 0; startIdx < charArr.length; startIdx++ ) {
			
			for( int length = 1; length <= charArr.length; length ++ ) {
				
				if ( startIdx + length > charArr.length ) {
					continue;
				}
				String stringCombination = S.substring( startIdx, startIdx + length );
				setA.add( stringCombination );
			}
		}
		
		System.out.println( setA.size() );
	}
	
	/**
	 * O(n) x O(n)
	 * @throws IOException
	 */
	public static void test2() throws IOException  {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String S = br.readLine();
		Set<String> setA = new HashSet<>();
		
		for( int startIdx = 0; startIdx < S.length(); startIdx++ ) {
			
			for( int length = 1; length <= S.length(); length ++ ) {
				
				if ( startIdx + length > S.length() ) {
					continue;
				}
				String stringCombination = S.substring( startIdx, startIdx + length );
				System.out.println( stringCombination );
				setA.add( stringCombination );
			}
		}
		System.out.println( setA.size() );
	}
}
