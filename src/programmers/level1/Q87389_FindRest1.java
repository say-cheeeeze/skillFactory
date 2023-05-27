package programmers.level1;

/**
 * 나머지가 1이 되는 수 찾기
 * 문제 설명
 * 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
 * 답이 항상 존재함은 증명될 수 있습니다.
 *
 * 제한사항
 * 3 ≤ n ≤ 1,000,000
 * 입출력 예
 * n	result
 * 10	3
 * 12	11
 */
public class Q87389_FindRest1 {
	
	public int solution( int n ) {
		// n 을 x 로 나눈 나머지가 1이 되게 하는 가장 작은 자연수 x
		System.out.println( "###### 자연수 n : " + n );
		int x = 0;
		for( int i = 1; i < n; i++ ) {
			System.out.println( i + "로 나눈 나머지가 : " + n % i );
			if ( n % i == 1 ) {
				x = i;
				break;
			}
		}
		return x;
	}
	
	public static void main( String[] args ) {
		Q87389_FindRest1 q87389FindRest1 = new Q87389_FindRest1();
		int answer = q87389FindRest1.solution( 10 );
		System.out.println( answer );
	}
}
