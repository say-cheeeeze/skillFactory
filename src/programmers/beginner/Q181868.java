package programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제 설명
 * 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
 * my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * my_string은 영소문자와 공백으로만 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string의 맨 앞과 맨 뒤에도 공백이 있을 수 있습니다.
 * my_string에는 단어가 하나 이상 존재합니다.
 * 입출력 예
 * my_string	result
 * " i    love  you"	["i", "love", "you"]
 * "    programmers  "	["programmers"]
 *
 */
public class Q181868 {
	
	public static void main( String[] args ) {
		String my_string = " i    love    you    ";
		String[] solution = solution2( my_string );
		System.out.println( Arrays.toString( solution ) );
	}
	
	public static String[] solution( String my_string ) {
		String[] splitStr = my_string.split( " " );
		List<String> strList = new ArrayList<>();
		for( int i = 0; i < splitStr.length; i++ ) {
			if ( !splitStr[i].equals( "" ) ) {
				strList.add( splitStr[ i ] );
			}
		}
		String[] array = strList.toArray( new String[ strList.size() ] );
		return array;
	}
	
	// 정규식 활용
	public static String[] solution2( String my_string ) {
		return my_string.trim().split("[ ]+");
	}
}
