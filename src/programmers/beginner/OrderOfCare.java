package programmers.beginner;

import java.util.Arrays;
import java.util.Collections;

/**
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
 * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로
 * 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.제한사항
 * 중복된 원소는 없습니다.
 * 1 ≤ emergency의 길이 ≤ 10
 * 1 ≤ emergency의 원소 ≤ 100
 * 입출력 예
 * emergency	result
 * [3, 76, 24]	[3, 1, 2]
 * [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
 * [30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * emergency가 [3, 76, 24]이므로 응급도의 크기 순서대로 번호를 매긴 [3, 1, 2]를 return합니다.
 * 입출력 예 #2
 *
 * emergency가 [1, 2, 3, 4, 5, 6, 7]이므로 응급도의 크기 순서대로 번호를 매긴 [7, 6, 5, 4, 3, 2, 1]를 return합니다.
 * 입출력 예 #3
 *
 * emergency가 [30, 10, 23, 6, 100]이므로 응급도의 크기 순서대로 번호를 매긴 [2, 4, 3, 5, 1]를 return합니다.
 */
public class OrderOfCare {
	
	public static void main( String[] args ) {
		
		int[] emergency = new int[] { 3, 76, 24 };
		int[] emergency1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int[] emergency2 = new int[] { 30, 10, 23, 6, 100 };
		
		int[] answer = solution( emergency2 );
		
		System.out.print( "[ " );
		for( int n : answer ) {
			System.out.print( n + " ");
		}
		System.out.print( "]" );
	}
	
	private static int[] solution( int[] emergency ) {
		
		// 정렬을 한다.
		// 3,24,76
		Integer[] sortedInteger = Arrays.stream( emergency ).boxed().toArray( Integer[]::new );
		Arrays.sort( sortedInteger, Collections.reverseOrder() );
		
		for( Integer num : sortedInteger ) {
			//			System.out.println( num );
		}
		int[] sorted = Arrays.stream( sortedInteger ).mapToInt( Integer::intValue ).toArray();
		
		int[] orderArr = new int[emergency.length];
		
		for( int num = 0; num < emergency.length; num++ ) {
			
			System.out.println( sorted[num]);
			
			for( int originNum = 0; originNum < emergency.length; originNum++ ) {
				if ( emergency[originNum] == sorted[num] ) {
					// 값을 찾은 경우 기존 배열의 해당 인덱스 요소에 sorted 의 순서값을 넣는다.
//					System.out.println("찾음 : " + sorted[num] + " num : " + num );
					orderArr[originNum] = num + 1;
				}
			}
		}
		
		return orderArr;
	}
}
