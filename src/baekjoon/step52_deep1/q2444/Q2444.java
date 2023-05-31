package baekjoon.step52_deep1.q2444;

import java.util.Scanner;

public class Q2444 {
	
	public static void main( String[] args ) {
		
		//		test1();
		//		q2444_2();
		
		//		q2444_3();
		
		// 성공
		q2444();
	}
	
	private static void q2444_3() {
		
		int M = 10;
		// 다이아몬드 상단
		for(int i = 0; i < M; i++){
			for(int j = i; j < M; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			for(int j = 0; j < i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 다이아몬드 하단
		for(int i = 0; i < M; i++){
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			for(int j = i; j < M; j++){
				System.out.print("*");
			}
			for(int j = i+1; j < M; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void q2444_2() {
		int N = 5;
		
		for( int i = 0; i < N; i++ ) {
			
			// i 는 행이다.
			// 0,1,2,3,4, ... N 행-1까지 i loop
			
			
			// j 는 열이다.
			// j 는 i 가 N 일때까지 증가하고 그 이후에는 감소한다.
			// 정확히 말하면 별이 찍히는 마지막 열이
			for( int j = 1; j <= ( i * 2 ) + N; j++ ) {
				if ( j + i < N ) {
					System.out.print( " " );
				}
				if ( j >= N ) {
					System.out.print( "*" );
				}
			}
			System.out.println();
		}
		
		for( int i = 0; i < N-1; i++ ) {
			for( int j = 1; j <= N - ( i * 2 ); j++ ) {
				System.out.print( "_" );
			}
			System.out.println();
		}
	}
	
	/**

         *
	    ***
	   *****
	  *******
	 *********
	  *******
       *****
        ***
         *
	 
	 24620KB 648ms 성공!
	 */
	private static void q2444() {
		
		Scanner sc = new Scanner( System.in );
		//		int N = sc.nextInt();
		int N = 5;
		
		for( int i = 1; i < N; i++ ) {
			for( int j = i; j < N; j++ ) {
				System.out.print( " " );
			}
//			for( int j = 0; j <= 2 * i - 1; j++ ) {
			for( int j = 0; j < i; j++ ) {
				System.out.print( "*" );
			}
			for( int j = 1; j < i; j++ ) {
				System.out.print( "*" );
			}
			System.out.println();
		}
		for( int i = 0; i < N; i++ ) {
			for( int j = 0; j < i; j++ ) {
				System.out.print( " " );
			}
			for( int j = 0; j < 2 * ( N - i ) - 1 ; j++ ) {
//				System.out.print( j );
				System.out.print( "*" );
			}
			System.out.println();
		}
		sc.close();
	}
	
	/**
        *
	   ***
	  *****
	 *******
	*********
	 
	 */
	private static void test1() {
		
		for( int i = 0; i < 5; i++ ) {
			
			for( int j = 1; j <= ( i * 2 ) + 5; j++ ) {
				if ( j + i < 5 ) {
					System.out.print( " " );
				}
				if ( j >= 5 ) {
					System.out.print( "*" );
				}
			}
			System.out.println();
		}
	}
}
