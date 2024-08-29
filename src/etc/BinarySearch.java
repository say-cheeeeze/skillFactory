package etc;

import java.time.LocalDateTime;
import java.util.Calendar;

// 이분탐색 연습
// 정렬된 배열 또는 리스트에 적합한 고속 탐색 방법이다.
public class BinarySearch {
	
	public static void main( String[] args ) {
		
		// >>> 최소비용으로 55 을 탐색하려고 할 때 소요되는 검색 횟수는?
		int[] intArr = new int[] { 1, 5, 17, 43, 55, 57, 64, 79, 80, 91, 98, 104, 115, 124 };
		
		final int targetInt = 55;
		// 1. arr 배열의 첫번째 탐색의 범위는 start 부터 end 라고 할 때,
		// start : arr 배열의 index 0번째 값
		// end : arr 배열의 index[arr.length-1]번째 값
		// 이 된다.
		
		// 2. 전체를 이분하여 A / B 로 나눈다고 했을 때
		// A : arr[0] ~ arr[middle-1]
		// B : arr[middle+1] ~ arr[length-1] 라고 할 수 있다.
		
		// 3. arr[mid] 값과 찾으려는 값을 대조한다.
		// 양쪽의 재탐색을 계속 한다.
		
		// 4. 값이 일치하는 경우 종료
		
		// 전개과정>>>>
		int midIdx = intArr.length / 2;
		System.out.println( "intArr.length = " + intArr.length );
		
		int i1 = intArr[midIdx];
		if ( targetInt < i1 ) {
			System.out.println( "왼쪽에 있다" );
		}
	}
}
