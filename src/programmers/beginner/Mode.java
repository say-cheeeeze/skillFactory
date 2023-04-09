package programmers.beginner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Mode {
	
	public static void main( String[] args ) {
		
		/**
		 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
		 * 정수 배열 array가 매개변수로 주어질 때, 최빈값을
		 * return 하도록 solution 함수를 완성해보세요.
		 * 최빈값이 여러 개면 -1을 return 합니다.
		 */
		//        int[] numbers = { 0,1,1,1,5,5,5,7,7,7}; // ok -1
		//        int[] numbers = { 0 }; // 0 ok
		int[] numbers = { 1,2,3,3,4,0, 99, 99, 99}; // ok
		int returnVal = 0;
		
		// 각 숫자별로 몇 번 나왔는지 map 에 저장한다.
		Map<Integer, Integer> map = new HashMap<>();
		
		for( int i = 0; i < numbers.length; i++ ) {
			
			System.out.println( "######## CHECK........##### : " +  numbers[i]  );
			
			if ( null == map.get( numbers[i] ) ) {
				System.out.println( "처음보는 숫자 >> put" );
				map.put( numbers[i], 1 );
			}
			else {
				int mode = map.get( numbers[i] );
				System.out.println( "있는 숫자 >> 현재 해당 숫자의 빈도수 : " + mode );
				System.out.println( " +++ " );
				mode++;
				map.put( numbers[i], mode );
				System.out.println( "빈도수 추가함 : " + map.get( numbers[i] ) );
			}
		}
		
		System.out.println( "Map : " + map );
		
		// 최빈값을 판별한다. 가장 많이 나온 값이 몇인지 구한다.
		int maxMode = 0;
		for( Map.Entry<Integer, Integer> entry : map.entrySet() ) {
			
			System.out.println( "숫자 : " + entry.getKey() + " / 빈도수 : " + entry.getValue() );
			
			if ( entry.getValue() > maxMode ) {
				maxMode = entry.getValue();
			}
		}
		
		// 최빈값이 몇번이나 나왔는지 아직 판별이 안됐다. 이 작업은 loop 가 끝난 뒤 검증해야한다.
		System.out.println( "최빈값 : " + maxMode );
		boolean isMoreThanOne = false;
		int check = 0;
		for( Map.Entry<Integer, Integer> entry : map.entrySet() ) {
			
			// 만약 entry 의 value 를 검사하는데 maxMode 와 같은 값이 2개 이상이라면?
			if ( entry.getValue() == maxMode ) {
				check++;
			}
			if ( check > 1 ) {
				isMoreThanOne = true;
			}
		}
		
		System.out.println( "최대 빈도수 같은 값을 가지는게 1개 이상인가?? : " + isMoreThanOne );
		
		// 만약 최빈 value 값이 높은 것이 2개 이상이면 -1 을 return 하고 프로그램 종료한다.
		if ( isMoreThanOne ) {
			System.out.println( "!!!! 최빈값이 2개 이상입니다." );
			returnVal = -1;
		}
		else {
			// 해당 최빈값을 value 로 하는 key 을 returnVal 에 할당해야함.
			
			for( Integer key : map.keySet() ) {
				Integer value = map.get( key );
				if ( maxMode == value ) {
					returnVal = key;
				}
			}
			System.out.println( "같은 값의 빈도수 가진게 1개밖에 없어요. : " + returnVal );
		}
		System.out.println( "프로그램 종료..... 최빈값 : " + returnVal );
	}
}
