package programmers.beginner;

import java.util.Arrays;

/**
 * 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
 * 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
 * 문자열 letter가 매개변수로 주어질 때,
 * letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 모스부호는 다음과 같습니다.
 * morse = {
 *     '.-':'a',
 *     '-...':'b',
 *     '-.-.':'c',
 *     '-..':'d',
 *     '.':'e',
 *     '..-.':'f',
 *     '--.':'g',
 *     '....':'h',
 *     '..':'i',
 *     '.---':'j',
 *     '-.-':'k',
 *     '.-..':'l',
 *     '--':'m',
 *     '-.':'n',
 *     '---':'o',
 *     '.--.':'p',
 *     '--.-':'q',
 *     '.-.':'r',
 *     '...':'s',
 *     '-':'t',
 *     '..-':'u',
 *     '...-':'v',
 *     '.--':'w',
 *     '-..-':'x',
 *     '-.--':'y',
 *     '--..':'z'
 * }
 * ".... . .-.. .-.. ---"	"hello"
 * ".--. -.-- - .... --- -."	"python"
 * 1 ≤ letter의 길이 ≤ 1,000
 * return값은 소문자입니다.
 * letter의 모스부호는 공백으로 나누어져 있습니다.
 * letter에 공백은 연속으로 두 개 이상 존재하지 않습니다.
 * 해독할 수 없는 편지는 주어지지 않습니다.
 * 편지의 시작과 끝에는 공백이 없습니다.
 *
 * a ~ z에 해당하는 모스부호가 순서대로 담긴 배열입니다.
 * {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}
 *
 */
public class MorseCode {
	
	public static final String[] morseCode = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	
	public static void main( String[] args ) {
		
//		String letter = ".... . .-.. .-.. ---"; // hello
		String letter = ".--. -.-- - .... --- -."; // python
		
		String answer = solution( letter );
		
		System.out.println( answer );
	}
	
	public static String solution( String letter ) {
		
		String[] arr = letter.split( " " );
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0; i < arr.length; i++ ) {
			// 각 요소가 모스부호에서 일치하는 것의 index 를 구해야 알파벳으로 바꿀 수 있다.
			// 모스부호의 인덱스 0 이 a 이다.
			int morseIdx = 0;
			for( int j = 0; j < morseCode.length; j++ ) {
				
				if( morseCode[j].equals( arr[i] ) ) {
					morseIdx = j;
					break;
				}
			}
//			System.out.println( (char)( morseIdx + 97 ) );
			sb.append( (char) ( morseIdx + 97 ) );
		}
		return sb.toString();
	}
}
