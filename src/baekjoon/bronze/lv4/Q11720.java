package baekjoon.bronze.lv4;

import java.io.IOException;
import java.util.Scanner;

/**
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
 * 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 입력으로 주어진 숫자 N개의 합을 출력한다.


 * @author cheeeeze
 *
 */
public class Q11720 {

	public static void main( String[] args ) throws IOException {
		
		String hello = "안녕하세염";
		
		char c126 = (char)126;
		char c127 = (char)127;
		System.out.println( hello + c126 + hello + c127 );

//		내풀이1();
		
//		다른풀이1();
		
	}
	
	private static void 내풀이1() {
		Scanner sc = new Scanner( System.in );
		
		int count = sc.nextInt();
		String number = sc.next();
		
		System.out.println( "count : " + count );
		System.out.println( "numbers : " + number );
		
		int sum = 0;
		for( int i = 0; i < count; i++ ) {
			sum += number.charAt( i ) - 48;
		}
		
		System.out.println( sum );
		
		sc.close();
	}
	
	private static void 다른풀이1() {
		
		String test = "0123456789";
		int sum = 0;
		for( int i = 0; i < test.length(); i++ ) {
//			System.out.println( test.charAt( i ) );
			char c1 = test.charAt( i );
			int int1 = test.charAt( i );
			System.out.println( "char(유니코드) " + c1 + " 은 int 로 변경하면 " + int1 );
			char c2 = (char)int1;
			System.out.println( "다시 형변환 char c2 => " + c2 );
			
		}
	}
}
