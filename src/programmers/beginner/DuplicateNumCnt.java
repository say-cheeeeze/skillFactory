package programmers.beginner;

import java.util.Arrays;

public class DuplicateNumCnt {
	
	public static void main( String[] args ) {
		
		/**
		 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록
		 * solution 함수를 완성해보세요.
		 */
		int[] array = new int[] { 1, 2, 3, 4, 4 };
		int n = 9;
		int cnt = 0;
		
		cnt = ( int ) Arrays.stream( array ).filter( i-> i == n ).count();
		
	}
}
