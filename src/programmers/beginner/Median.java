package programmers.beginner;

import java.util.Arrays;

public class Median {
	
	public static void main( String[] args ) {
		
		/**
		 * 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2,
		 * 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록
		 * solution 함수를 완성해보세요.
		 */
		int[] array = { -9, 0, 11, 5, 9 };
		
		// 먼저 정렬을 해야됨
		int[] sortedArr = Arrays.stream( array ).sorted().toArray();
		System.out.println( sortedArr );
		
		for ( int i = 0; i < sortedArr.length; i++ ) {
			
			System.out.println( sortedArr[ i ] );
		}
		
		int midValue = sortedArr[ sortedArr.length / 2 ];
		
		System.out.println( " 가운데 값 : " + midValue );
		
		/**
		 * 다른 풀이
		 */
		int[] array2 = { -9, 0, 11, 5, 9 };
		Arrays.sort( array2 );
		int answer2 = array2[ array2.length >> 1 ];
		
		int test1 = 5;
		test1 = test1 >> 1; // 나누기2 랑 같다.
		System.out.println( test1 );
		
		
	}
}
