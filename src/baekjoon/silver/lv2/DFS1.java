package baekjoon.silver.lv2;

/**
 * 재귀함수 이해
 */
public class DFS1 {
	
	public static void main( String[] args ) {
		// DFS1_binaryNumber( 11 );
		int num = DFS2_factorial( 5 );
		System.out.println( "=" + num );
	}
	
	/**
	 * 자연수 n 을 2진수로 출력
	 */
	public static void DFS1_binaryNumber( int n ) {
		if( n == 0 ) {
			return;
		}
		else {
			DFS1_binaryNumber( n/2 );
			System.out.print( n%2 );
		}
	}
	/**
	 * 팩토리얼 재귀함수
	 * 자연수 N 주어지면 N! 을 구하기
	 */
	public static int DFS2_factorial( int n ) {
		System.out.print( n );
		if ( n == 1 ) {
			return 1;
		}
		else {
			System.out.print( "x" );
			return ( n * DFS2_factorial( n - 1 ) );
		}
	}
	
}
