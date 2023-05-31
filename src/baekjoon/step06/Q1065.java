package baekjoon.step06;

import java.util.Scanner;

/**
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 *
 * 입력 : 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다. 
 *
 * 출력 : 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 *  
 * @author cheeeeze
 *
 */
public class Q1065 {

	public static void main( String[] args ) {
		
		/**
		등차수열의 일반항 표현식은
		초항 a1 과 공차 d 
		a(n) = a1 + (n-1)d 로 나타낼 수 있다.
		
		[1,1,1,1,1] ,... [ 1,2,3,4,5 ,...] , [ 1,3,5,7,9, ... ] 
		1) 1 ~ 99 까지는 모두 등차수열이다.
		1-1) 한자리 수 : 1 ~ 9 까지는 수 하나 그 자체로 등차수열이다.
		1-2) 두자리수인 경우
		10, 11, 12 부터,,, 99 까지는 공차가 하나뿐이기 때문에 모두 등차수열이다.
		
		2) 100 부터 1000 까지 생각해보자.
		100 은 등차수열인가? 789 ? 987 ? 989 ?
		일의자리수 - 십의자리수 == 십의자리수 - 백의자리수 
		이면 등차수열이라고 할 수 있다.
		숫자 n 이 주어졌을 때 
		n 의 일의자리수 - n 의 십의자리수 == n 의 십의자리수 - n 의 백의자리수
		를 계산한다 이 때 절대값으로 비교하면 안됨 (-,+ 를 살려야함)
		
		만약 등차수열이 아니라면? 1 보다 크고 n 보다 작거나 같은 한수의 개수는
		n 이 100보다 크다면 
		1~99 까지는 모두 등차수열이므로 99 개이고,
		100 부터는 한수여부를 확인하고 true 인 것을 셈에 더한다.
		*/

//		System.out.println( isArithmeticSequence( 123 ) );
//		System.out.println( isArithmeticSequence( 479 ) );
//		System.out.println( isArithmeticSequence( 1000 ) );
//		System.out.println( isArithmeticSequence( 999 ) );
		
		// 이제 정수 n 이 등차수열인지 아닌지는 알 수 있다.
		// 이제 n 이 주어졌을 때, n 보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner( System.in );
		int num = sc.nextInt();
		
		printArithemeticNum( num );
		sc.close();
	}
	
	/**
	 * parameter int num 보다 작거나 같고, 1보다 크거나 같은 한수의 개수를 출력한다.
	 *  
	 * @param num
	 */
	private static void printArithemeticNum( int num ) {
		
		int arithemeticNum = 0;
		
		for( int i = 1; i <= num; i++ ) {
			// 한수인지 아닌지 체크 
			boolean checkMeIfTrue = isArithmeticSequence( i );
			
			if ( checkMeIfTrue  ) {
				arithemeticNum++;
			}
		}
		System.out.println( arithemeticNum + " 개");
			
	}

	/**
	 * 등차수열인지 확인하고 true, false 를 반환
	 * 입력값은 1~1000 까지.
	 * @param a
	 * @return
	 */
	private static boolean isArithmeticSequence( int a ) {
		
		System.out.println( "######### " + a );
		// 두자리수까지는 모두 등차수열이다.
		if ( a < 100 ) {
			System.out.println( "두자리수까지는 모두 등차수열이다." );
			return true;
		}
		
		// 일의자리수
		int unitDigit = a % 10;
		// 십의자리수
		int tensDigit = ( a % 100 ) / 10;
		// 백의 자리수
		int hundredsDigit = ( a % 1000 ) / 100;
		
		int diffUnitTens = unitDigit - tensDigit;
		int difftensHundreds = tensDigit - hundredsDigit;
		System.out.println( "일의자리와 십의자리 차이 : " + diffUnitTens );
		System.out.println( "십의자리와 백의자리 차이 : " + difftensHundreds );
		
		boolean result = diffUnitTens == difftensHundreds;
		
		if ( a > 999 && result ) {
			int thousandsDigit = a / 1000;
			System.out.println( "천의자리수 : " + thousandsDigit );
			int diffHundredsThousands = hundredsDigit - thousandsDigit;
			System.out.println( "천의자리와 백의자리 차이 : " + diffHundredsThousands );
			result = diffHundredsThousands == difftensHundreds;
		}
		
		return result;
	}
}
