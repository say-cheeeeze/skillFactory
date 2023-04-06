package programmers.beginner;

public class DotPoint {
	
	public static void main( String[] args ) {
		/**
		 * 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다. x
		 * 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 좌표 dot이 사분면 중 어디에 속하는지
		 * 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요. [2,4] => 1 [-7,9]
		 * => 2
		 */
		
		int[] dot = new int[] { -7, 4 };
		int quardrant = dot[ 0 ] > 0 ? ( dot[ 1 ] > 0 ? 1 : 4 ) : ( dot[ 1 ] > 0 ? 2 : 3 );
		
		System.out.println( quardrant );
		
//		return 0;
	}
}
