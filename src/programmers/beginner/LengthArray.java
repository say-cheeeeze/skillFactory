package programmers.beginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LengthArray {
	
	public static void main( String[] args ) {
		
		/**
		 * 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 return 하도록
		 * solution 함수를 완성해주세요.
		 */
		String[] strList = { "We", "are", "the", "world" };
		int[] lengthArr = new int[ strList.length ];
		
		for ( int i = 0; i < strList.length; i++ ) {
			lengthArr[ i ] = strList[ i ].length();
			System.out.println( lengthArr[ i ] );
		}
		
//		return lengthArr;
	}
}
