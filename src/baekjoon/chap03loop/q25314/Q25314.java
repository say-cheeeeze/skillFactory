package baekjoon.chap03loop.q25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q25314 {
	
	public static void main( String[] args ) throws IOException {
		Q25314 q25314 = new Q25314();
//		System.out.println( "answer : " + q25314.solution() );
		System.out.println( "answer : " + q25314.solution2() );
	}
	
	//17624KB	200ms
	public static String solution() {
		
		Scanner sc = new Scanner( System.in );
		int N = sc.nextInt();
		
		System.out.println( N / 4 );
		int cnt = N / 4;
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0; i < cnt; i++ ) {
			sb.append( "long " );
		}
		sb.append( "int" );
		
		return sb.toString();
	}
	
	// 14216KB	120ms
	public static String solution2() throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int N = Integer.parseInt( br.readLine() );
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0; i < N/4; i++ ) {
			sb.append( "long " );
		}
		sb.append( "int" );
		return sb.toString();
	}
}
