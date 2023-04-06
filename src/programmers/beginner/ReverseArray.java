package programmers.beginner;

public class ReverseArray {
	
	public static void main( String[] args ) {
		
		/**
		 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을
		 * return하도록 solution 함수를 완성해주세요.
		 */
		int[] array = new int[] { 1, 2, 3, 4, 4 };
		int[] reverseArr = new int[ array.length ];
		
		for ( int i = array.length - 1, j = 0; j < array.length; i--, j++ ) {
			reverseArr[ j ] = array[ i ];
		}
		
		for ( int i = 0; i < reverseArr.length; i++ ) {
			System.out.println( reverseArr[ i ] );
		}
		
		// return array;
	}
}
