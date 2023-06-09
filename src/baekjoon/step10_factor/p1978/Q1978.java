package baekjoon.step10_factor.p1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {
	
	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int cnt = Integer.parseInt( br.readLine() );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		if ( st.countTokens() != cnt ) {
			return;
		}
		int primeCnt = 0;
		while( st.hasMoreTokens() ) {
			
			int num = Integer.parseInt( st.nextToken() );
			
			System.out.println( num + " 체크 중....." );
			
			if ( num <= 1 ) {
				System.out.println( "1 은 소수의 대상이 아니다. continue" );
				continue;
			}
			
			boolean hasFactor = false;
			for( int i = 2; i <= num/2; i++ ) {
				
				System.out.println( i + " for 문 검사 중......" );
				
				if ( hasFactor ) {
					break;
				}
				if ( num % i == 0 ) {
					System.out.println( "소수를 발견 continue in for ..." );
					hasFactor = true;
					break;
				}
			}
			if ( hasFactor ) {
				System.out.println( "소수가 있는 수입니다. continue" );
				continue;
			}
			
			System.out.println( "primeCnt++" );
			primeCnt++;
		}
		
		System.out.println( "프로그램 종료.. 소수 개수 : " + primeCnt );
	}

}
