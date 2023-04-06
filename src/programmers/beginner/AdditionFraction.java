package programmers.beginner;

import java.util.Arrays;

public class AdditionFraction {
	
	public static void main( String[] args ) {
		
		/**
		 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2,
		 * denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을
		 * return 하도록 solution 함수를 완성해보세요.
		 */
		int numer1 = 2;
		int denom1 = 10;
		
		int numer2 = 4;
		int denom2 = 8;
		
		// 2/10 + 4/8 = >>??? 기약분수
		// 일단 어떤 수가 들어오든 최소공배수를 분모로 하는 수를 계산한다.
		// 분모10과 8의 최소공배수는 80
		// 16/80 + 40/80 = 56/80 이 된다.
		
		int denom3 = denom1 * denom2; // 두 분모값을 단순히 곱한 수
		int numer3 = ( ( denom3 / denom1 ) * numer1 ) + ( ( denom3 / denom2 ) * numer2 ); // ( ( denom3 / denom1 ) * numer1 ) *
		// ( ( denom3 / denom2 ) * numer2 )
		
		System.out.println( "처음 수 : " + numer1 + "/" + denom1 + " + " + numer2 + "/" + denom2 );
		System.out.println( "공배수 : " + numer3 + "/" + denom3 );
		// 그리고 이를 기약분수로 ..
		int GCD = 0; // 최대 공약수 Graetest Common Divisor
		
		for ( int i = 1; i <= numer3 && i <= denom3; i++ ) {
			
			if ( numer3 % i == 0 && denom3 % i == 0 ) {
				GCD = i;
			}
		}
		System.out.println( "최대공약수 : " + GCD );
		
		int numer4 = numer3 / GCD;
		int denom4 = denom3 / GCD;
		
		System.out.println( "결과 : " + numer4 + "/" + denom4 );
	}
}
