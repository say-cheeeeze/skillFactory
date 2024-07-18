package baekjoon.bronze.lv2;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
 * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
 * 
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
 * 그 다음 서로 다른 값이 몇 개 있는지 출력
 * 
 * HashSet 은 Collection 중 Set 의 파생클래스이다.
 * HashSet 은 중복데이터를 허용하지 않기 때문에 이 문제에 적합한 자료구조라고 할 수 있다.
 * 
 * 
 * @author cheeeeze
 *
 */
public class Q3052 {
	
	public static void main( String[] args ) {
		
		Scanner in = new Scanner( System.in );
		
		HashSet<Integer> arr = new HashSet<>(10);
		
		for ( int i = 0; i < 10; i++ ) {
			
			// 아예 입력받은 값을 42 로 나눈 나머지를 저장해버림
			// 이 때 HashSet 의 add 는 중복데이터를 허용하지 않고 덮어씌운다.
			arr.add( in.nextInt() % 42 );
			
		}
		in.close();
		
		// HashSet 의 size() 메소드를 통해 개수를 구할 수 있다.
		System.out.println( arr.size() );
		
		
	}

}
