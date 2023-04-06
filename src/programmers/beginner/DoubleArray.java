package programmers.beginner;

import java.util.Arrays;

public class DoubleArray {
	
	public static void main( String[] args ) {
		
		/**
		 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록
		 * solution 함수를 완성해주세요. [1, 2, 100, -99, 1, 2, 3] [2, 4, 200, -198, 2,
		 * 4, 6]
		 */
		int[] numbers = new int[] { 1, 2, 100, -99, 1, 2, 3 };
		
		for ( int i = 0; i < numbers.length; i++ ) {
			
			System.out.print( "numbers[" + i + "] : " + numbers[ i ] );
			
			System.out.print( " => 곱하기  " + numbers[ i ] * 2 );
			System.out.println();
		}
		
		int[] answer = {}; // 아직 힙메모리에 아무것도 등록안하겠다.
		int[] 빈배열 = null; // 조금다름 null 로 초기화하겠다.
		String[] strArr = new String[ 3 ];
		System.out.println( strArr.length );
		System.out.println( strArr[ 0 ] );
		
		/**
		 * 다른 방법
		 */
		int[] answer2 = Arrays.stream( numbers ).map( i-> i * 2 ).toArray();
		
		for ( int i = 0; i < answer2.length; i++ ) {
			System.out.println( answer2[ i ] );
		}
		
		
	}
}
