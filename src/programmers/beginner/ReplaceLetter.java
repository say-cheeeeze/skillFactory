package programmers.beginner;

public class ReplaceLetter {
	
	public static void main( String[] args ) {
		
		
		/**
		 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을
		 * return하도록 solution 함수를 완성해주세요.
		 */
		String my_string = "something for nothing";
		String letter = "for";
		
		String test1 = my_string.replaceAll( letter, "" );
		System.out.println( test1 );
//		return "";
	}
}
