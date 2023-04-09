package programmers.beginner;

/**
 * 문자 반복 출력하기
 * 문제 설명
 * 문자열 my_string 과 정수 n 이 매개변수로 주어질 때,
 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 2 ≤ my_string 길이 ≤ 5
 * 2 ≤ n ≤ 10
 * "my_string"은 영어 대소문자로 이루어져 있습니다.
 *
 * 입출력 예
 * my_string	n	result
 * "hello"	3	"hhheeellllllooo"
 */
public class RepeatString {
	
	public static void main( String[] args ) {
	
		StringBuilder sb = new StringBuilder();
		String my_string = "helloWorld";
		int repeatCnt = 5;
		char[] my_char = my_string.toCharArray();
		
		for( char c : my_char ) {
			
			for( int i = 0; i < repeatCnt; i++ ) {
//				System.out.print( c );
				sb.append( c );
			}
		}
		
		System.out.println( sb );
		
	}
}
