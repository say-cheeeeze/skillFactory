package programmers.beginner;

import java.util.Arrays;
import java.util.Locale;

/**
 *
 * 문제 설명
 * 문자열 배열 strArr가 주어집니다.
 * 모든 원소가 알파벳으로만 이루어져 있을 때,
 * 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로,
 * 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ strArr ≤ 20
 * 1 ≤ strArr의 원소의 길이 ≤ 20
 * strArr의 원소는 알파벳으로 이루어진 문자열 입니다.
 * 입출력 예
 * strArr	result
 * ["AAA","BBB","CCC","DDD"]	["aaa","BBB","ccc","DDD"]
 * ["aBc","AbC"]	["abc","ABC"]
 *
 */
public class Q181875 {
	
	public static void main( String[] args ) {
		String[] my_string = new String [] { "AAA", "BBB", "CCC", "DDD" };
		String[] answer = solution( my_string );
		System.out.println( "answer = " + Arrays.toString( answer ) );
	}
	
	public static String[] solution( String[] my_string ) {
		for( int i = 0; i < my_string.length; i++ ) {
			if ( i % 2 == 1 ) {
				my_string[i] = my_string[i].toUpperCase();
			}
			else {
				my_string[i] = my_string[i].toLowerCase();
			}
		}
		
		return my_string;
	}
}
