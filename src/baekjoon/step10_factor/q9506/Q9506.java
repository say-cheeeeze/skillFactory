package baekjoon.step10_factor.q9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9506 {
	
	public static void main( String[] args ) throws IOException {
		
		//15128KB	156ms
		solution1();
		
	}
	
	public static void solution1() throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb;
		
		while( true ) {
			
			sb = new StringBuilder();
			
			int num = Integer.parseInt( br.readLine() ); 

			if ( num == -1 ) {
				break;
			}
			sb.append( num + " =" );
			
			int sum = 0;
			
			for( int i = 1; i <= num / 2; i++ ) {
				
				if ( num % i == 0 ) {
					
//					System.out.println( sb.lastIndexOf( "=" ) );
//					System.out.println( sb.length() );
					
					if ( sb.lastIndexOf( "=" ) != sb.length() - 1 ) {
						sb.append( "+" );
					}
					sb.append( " " + i + " " );
					
					sum += i;
				}
			}
//			System.out.println();
//			System.out.println( "자신을 제외한 약수들의 합 : " + sum );
			
			if ( num != sum ) {
				sb.delete(0, sb.length());
				sb.append( num + " is NOT perfect." );
			}
//			sb.append( "\n" );
			
			System.out.println( sb );
		}
	}
}
