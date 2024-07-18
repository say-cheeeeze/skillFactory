package baekjoon.bronze.lv2.q2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2581 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int N = Integer.parseInt( br.readLine() );
		int M = Integer.parseInt( br.readLine() );
		
		int sum = 0; // 소수인 것의 합
		int minValue = -1;
		for( int i = N; i <= M; i++ ) {
			
			// 이중 소수인 것을 찾아야함.
			boolean t1 = isPrime( i );
			
			if ( t1 ) {
				System.out.println( i + "는 소수여" );
				sum += i;
				if ( minValue == - 1 ) {
					minValue = i;
				}
			}
			else {
				System.out.println( i + "는 소수가 아니다." );
			}
		}
		
		if ( sum == 0 ) {
			System.out.println( -1 );
		}
		else {
			System.out.println( sum );
			System.out.println( minValue );
		}
	}
	
	public static boolean isPrime( int t ) {
		
		if ( t <= 1 ) {
			return false;
		}
		
		System.out.println( t + "까지 확인하는 isPrime....." );
		for( int i = 2; i <= t/2; i++ ) {
			// t 까지 확인하는 중에 하나도 없어야 소수임.
			// t % i == 0 인 것이 하나라도 있으면 소수가 아님.
			if ( t % i == 0 ) {
				return false;
			}
		}
		
		return true;
	}
}
