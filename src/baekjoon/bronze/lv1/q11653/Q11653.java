package baekjoon.bronze.lv1.q11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11653 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int num1 = Integer.parseInt( br.readLine() );
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println( num1 + "을 소인수분해한 결과를 한줄에 하나씩 오름차순으로 출력" );
		
		if ( num1 == 1 ) {
			System.out.println( "1인 경우 아무것도 출력하지 않습니다." );
			return;
		}

//		sb.append( num1 + " = " );
		// 72 = 2 x 2 x 2 x 3 x 3
		int factor = 2;
		while( true ) {
			// 숫자를 소수로(2부터) 나누는데,
			// 인수는 2부터 ++ 하여 시작하고,
			// 나눈 몫을 다시 num1 에 대입하고 반복하여 체크하고,
			// 나머지가 0 이 아닌 경우 인수를 ++ 한다.
//			System.out.println( factor + "로 나눠봅니다. 나머지 : " + num1 % factor );
			
			if ( num1 <= factor ) {
				sb.append( factor + "\n" );
				break;
			}
			
			if ( num1 % factor == 0 ) {
				// factor 가 소인수인 경우.
				sb.append( factor + "\n" );
				num1 = num1 / factor;
			}
			
			if ( num1 % factor != 0 ) {
				factor++;
			}
		}
		
		System.out.println( sb );
	}
}
