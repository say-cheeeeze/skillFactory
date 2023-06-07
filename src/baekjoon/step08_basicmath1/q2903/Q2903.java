package baekjoon.step08_basicmath1.q2903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2903 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		
		/**
		 * 초기 상태 : 점 4개만 있다.(정사각형 1개)
		 *
		 * n번 추가할 때마다
		 * 정사각형의 개수는
		 * ( 2의 n-1승 ) 의 제곱 이 된다.
		 *
		 * 점의 개수는
		 * ( 2의 n승 ) + 1 의 제곱이 된다.
 		 */
		double num = Math.pow( 2, n );
		System.out.println( "2의 " + n + "승 : " + num );
		System.out.println( "점의 개수 : " + (int)Math.pow( num + 1, 2 ) );
	}
}
