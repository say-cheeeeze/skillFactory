package programmers.level1;

import java.util.Arrays;

/**
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 *
 * 제한사항
 * N의 범위 : 100,000,000 이하의 자연수
 * 입출력 예
 * N	answer
 * 123	6
 * 987	24
 */
public class Q12931_SumDigit {
	
	public static void main( String[] args ) {
		// solution( 123 );
		solution2( 1203 );
	}
	
	/**
	 * 리소스를 많이 잡아먹는 단점이 있고, 디버깅하기 편하고 보기 좋은 장점이 있다.
	 * @param n
	 * @return
	 */
	public static int solution(int n) {
		int answer = 0;
		
		String num1 = String.valueOf( n );
		String[] numArr = num1.split("");
		System.out.println( Arrays.toString( numArr ) );
		for( int i = 0; i < numArr.length; i++ ) {
			answer += Integer.parseInt( numArr[i] );
		}
		System.out.println( answer );
		return answer;
	}
	
	public static int solution2( int n ) {
		
		System.out.println( n );
		
		int answer = 0;
		
		while( n > 0 ) {
			System.out.println( "n : " + n + " 을 10 으로 나눈 나머지 값 :" + ( n % 10 ) );
			answer += n % 10;
			
			if( n < 10 ) {
				System.out.println( "break;" );
				break;
			}
			
			n = n / 10;
			System.out.println( "한번 나눈 뒤 n 값 : " + n );
		}
		
		System.out.println( answer );
		return answer;
	}
	
}
