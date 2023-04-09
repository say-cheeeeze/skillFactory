package programmers.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 직각삼각형 출력하기
 * 문제 설명
 * "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 10
 * 입출력 예
 * 입력 #1
 *
 * 3
 * 출력 #1
 *
 * *
 * **
 * ***
 */
public class RightTriangle {
	
	public static void main( String[] args ) {
	
		try {
			// solution();
			
//			System.out.println( "test".repeat( 3 ) );
			
			solution2();
			
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
		
	}
	
	public static void solution() throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine();
		
		int height = Integer.parseInt( input );
		System.out.println( "높이 : " + height );
		
		for( int n = 1; n <= height; n++ ) {
			
			for( int j = 1; j <= n; j++ ) {
				System.out.print( "*" );
			}
			
			if ( n != height ) {
				System.out.println();
				
			}
		}
	}
	
	public static void solution2() throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine();
		int inputNum = Integer.parseInt( input );
		StringBuilder sb = new StringBuilder();
		
		for( int i = 1; i <= inputNum; i++ ) {
			
			for( int j = 0; j < i; j++ ) {
				sb.append( "*" );
			}
			
			if ( i != inputNum ) {
				sb.append( "\n" );
			}
			
		}
		System.out.println( sb );
		
	}
}
