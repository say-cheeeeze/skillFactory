package programmers.level1;

/**
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 * 입출력 예
 * num	return
 * 3	"Odd"
 * 4	"Even"
 */
public class Q12937_EvenOrOdd {
	
	String solution( int num ) {
		System.out.println( "정수 : " + num );
		return ( num % 2 == 0 ) ? "Even" : "Odd";
	}
	
	public static void main( String[] args ) {
		
		Q12937_EvenOrOdd evenOrOdd = new Q12937_EvenOrOdd();
		System.out.println( "결과 : " + evenOrOdd.solution( 4 ) );
		System.out.println( "결과 : " + evenOrOdd.solution( -1 ) );
		System.out.println( "결과 : " + evenOrOdd.solution( 0 ) );
	}
}
