package programmers.beginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
	
	public static void main( String[] args ) {
		
		/**
		 * 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을
		 * return 하도록 solution 함수를 완성해보세요.
		 */
		int[] num_list = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] answer = new int[2];
		
		for ( int i = 0; i < num_list.length; i++ ) {
			
			// 홀수
			if ( num_list[i] % 2 == 1 ) {
				answer[1]++;
			}
			// 짝수
			else {
				answer[0]++;
			}
		}
		
		System.out.println( answer[0] + " / " + answer[1] );
		
//		return new int[] {};
	}
}
