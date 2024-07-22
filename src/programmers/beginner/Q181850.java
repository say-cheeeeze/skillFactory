package programmers.beginner;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181850
 *
 * 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ flo ≤ 100
 * 입출력 예
 * flo	result
 * 1.42	1
 * 69.32	69
 *
 */
public class Q181850 {
	
	public static void main( String[] args ) {
		int answer = solution( 1.42 );
		System.out.println( answer );
	}
	
	public static int solution( double flo ) {
		System.out.println( flo );
		// 1 로 나누고 나머지가 존재한다면?
		int answer = (int) flo;
		return answer;
	}
}
