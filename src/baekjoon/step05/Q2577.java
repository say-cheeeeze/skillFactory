package baekjoon.step05;

import java.util.Scanner;

/**
 * 세 개의 자연수 A,B,C 가 주어질 때 A * B * C 를 계산한 결과에 
 * 0 부터 9 까지 각각의 숫자가 몇번씩 쓰였는지를 구하기
 * 
 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
 *  계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 * @author cheeeeze
 *
 */
public class Q2577 {
	
	public static void main( String[] args ) {
		
		//먼저 자연수 세개를 입력받는다.
		//자연수 세개를 곱한값을 저장하고, 문자열로 변환한다.
		//자연수는 100이상 1000 미만이다.
		Scanner in = new Scanner( System.in );
		
		int value = ( in.nextInt() * in.nextInt() * in.nextInt() );
		
		String valueStr = Integer.toString( value );
		
		System.out.println("##################");
		System.out.println("valueStr....." + valueStr );
		System.out.println("##################");
		
//		String test = "10923";
//		
//		System.out.println( test.charAt(0));
//		System.out.println( test.charAt(1));
//		System.out.println( test.charAt(2));
//		System.out.println( test.charAt(3));
//		System.out.println( test.charAt(4));
//		
//		System.out.println( "9 - test.charAt(2) ::::: " + ( 9 - ( test.charAt(2)-'0' ) ) );
		

		in.close();
		// 0부터 9의 숫자가 각각 몇번씩 쓰였는지? 0이 몇번 쓰였냐 1이 몇번 쓰였냐 -> 0~9까지 loop1
		// 몇번 쓰였는지를 어케 아는지?
		// 각 자리의 숫자가 1이면 1을 count++
		for( int i = 0; i < 10; i++ ) {
			
			int count = 0;
			
			for ( int j = 0; j < valueStr.length(); j++ ) {
			
				if ( ( valueStr.charAt(j) - '0' ) == i ) {
					count++;
				}
				
			}
			System.out.println( i + "=>  : " + count );
		}
	}
}
