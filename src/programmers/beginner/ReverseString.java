package programmers.beginner;

public class ReverseString {
	
	public static void main( String[] args ) {
		
		/**
		 * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록
		 * solution 함수를 완성해주세요.
		 */
		String str = "문자열있어요";
		String answer = "";
		System.out.println( str.length() );
		System.out.println( str.charAt( 0 ) );
		for ( int i = str.length() - 1; i > -1; i-- ) {
			System.out.print( i + " ::::" + str.charAt( i ) + "\n" );
			answer += str.charAt( i );
		}
		
		System.out.println( answer );
		
		/**
		 * StringBuilder 를 이용하면 reverse 를 이용하기 쉽다!!
		 */
		String str2 = "더쉽게해봅시다!";
		StringBuilder sb = new StringBuilder();
		
		System.out.println( "생성자로 생성하면 ? : " + sb.toString() );
		
		sb.append( str2 );
		sb.reverse();
		System.out.println( sb.toString() );
		
//		return sb.toString();
	}
}
