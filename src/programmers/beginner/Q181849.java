package programmers.beginner;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181849
 *
 * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 3 ≤ num_str ≤ 100
 * 입출력 예
 * num_str	result
 * "123456789"	45
 * "1000000"	1
 *
 */
public class Q181849 {
	
	public static void main( String[] args ) {
		int answer = solution( "123456789" );
		System.out.println( answer );
	}
	
	public static int solution(String num_str) {
		System.out.println( num_str );
		int answer = 0;
		for( int i = 0; i < num_str.length(); i++ ) {
			answer += Integer.parseInt( String.valueOf( num_str.charAt( i ) ) );
		}
		return answer;
	}
}
