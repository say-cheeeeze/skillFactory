package baekjoon.silver.lv4.q10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10773 {
	
	public static void main( String[] args ) throws IOException {
		
		// test1();
		
		// 굳이 모두 더할 필요가 없다!
		test2();
		
		
	}
	
	/**
	 * 마지막에 굳이 모두 sum 할 필요가 없다.
	 * @throws IOException
	 */
	public static void test2() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int K = Integer.parseInt( br.readLine() );
		int[] stack = new int[ K ];
		int size = 0;
		
		for ( int i = 0; i < K; i++ ) {
			int num = Integer.parseInt( br.readLine() );
			
			if ( num == 0 ) {
				System.out.println( "뺀다!" );
				
				if ( size > 0 ) {
					stack[ size - 1 ] = 0;
					size--;
				}
			}
			else {
				System.out.println( "더한다" );
				stack[ size ] = num;
				size++;
			}
		}
		
		/**
		 * stack 에 의해 size 만큼만 숫자가 있고 나머지 0 이니까..
		 * size 까지의 숫자만 더해주면 모든 요소까지 looping 할 필요 없다.
		 */
		int sum = 0;
		
		for ( int i = 0; i < size; i++ ) {
			sum += stack[i];
		}
		
		System.out.println( sum );
	}
	
	
	public static void test1() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int K = Integer.parseInt( br.readLine() );
		int[] stack = new int[ K ];
		int size = 0;
		
		for ( int i = 0; i < K; i++ ) {
			int num = Integer.parseInt( br.readLine() );
			
			if ( num == 0 ) {
				System.out.println( "뺀다!" );
				
				if ( size > 0 ) {
					stack[ size - 1 ] = 0;
					size--;
				}
			}
			else {
				System.out.println( "더한다" );
				stack[ size ] = num;
				size++;
			}
		}
		
		System.out.println( Arrays.toString( stack ) );
		int sum = Arrays.stream( stack ).sum(); // O(n)?
		System.out.println( sum );
	}
}
