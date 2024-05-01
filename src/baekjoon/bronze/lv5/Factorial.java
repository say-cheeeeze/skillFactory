package baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	1024 MB	26846	12502	11268	47.941%
 *
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 *
 * 입력 첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.
 *
 * 출력 첫째 줄에 N!을 출력한다.
 *
 * 예제 입력 1
 * 10
 * 예제 출력 1
 * 3628800
 * 예제 입력 2
 * 0
 * 예제 출력 2
 * 1
 */
public class Factorial {
	
	public static void main( String[] args ) {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			String s = br.readLine();
			long num = Integer.parseInt( s );
			long sum = getFactorial( num );
			System.out.println( sum );
		}
		catch ( IOException e ) {
			throw new RuntimeException( e );
		}
	}
	
	private static long getFactorial( long num ) {
		
		System.out.println( num );
		
		if ( num == 0 ) {
			return 1;
		}
		else if ( num == 1 ) {
			return num;
		}
		else {
			return num * getFactorial( num - 1 );
		}
	}
	
}
