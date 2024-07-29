package programmers.beginner;

import java.util.Arrays;

/**
 * 문제 설명
 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
 * 1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
 * 0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
 * 입출력 예
 * my_string	overwrite_string	s	result
 * "He11oWor1d"	"lloWorl"	2	"HelloWorld"
 * "Program29b8UYP"	"merS123"	7	"ProgrammerS123"
 */
public class Q181943 {
	
	public static void main( String[] args ) {
		String my_string = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int idx = 2;
		solution( my_string, idx, overwrite_string );
	}
	
	public static String solution( String my_string, int idx, String overwrite_string ) {
		char[] charArray = my_string.toCharArray();
		System.arraycopy( overwrite_string.toCharArray(), 0, charArray, idx, overwrite_string.length() );
		String str = new String( charArray );
		System.out.println( "str = " + str );
		String string = Arrays.toString( charArray );
		System.out.println( "string = " + string );
		return "";
	}
}
