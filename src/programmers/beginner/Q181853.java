package programmers.beginner;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 정수로 이루어진 리스트 num_list가 주어집니다.
 * num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 6 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 100
 * 입출력 예
 * num_list	result
 * [12, 4, 15, 46, 38, 1, 14]	[1, 4, 12, 14, 15]
 *
 */
public class Q181853 {
	
	public static void main( String[] args ) {
		
		int[] param = new int[] { 12,4,15,46,38,1,14 };
		
		int[] solution = solution( param );
		System.out.println( "solution = " + Arrays.toString( solution ) );
	}
	
	public static int[] solution( int[] param ) {
		Arrays.sort( param );
		return Arrays.copyOfRange( param, 0, 5 );
	}
	
	
}
