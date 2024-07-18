package baekjoon.bronze.lv2;

import java.io.IOException;
import java.util.Scanner;

/**
 * 문자열 반복
 * 
 * 문자열 S를 입력받은 후에, 
 * 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
 * S에는 QR Code "alphanumeric" 문자만 들어있다.
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 * 
 * 입력 : 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
 * 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다.
 *  S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
 *  2
 *  3 ABC
 *  5 /HTP
 * 
 * 출력 : 각 테스트 케이스에 대해 P를 출력한다.
 * AAABBBCCC
 * /////HHHHHTTTTTPPPPP
 * 
 * @author cheeeeze
 *
 */
public class Q2675 {

	public static void main( String[] args ) throws IOException {
		
		// Scanner -> String -> 각 index char 반복 n 횟수는 scanner 에 
		// 공백 처리
//		Scanner scanner = new Scanner( System.in );
//		String str = scanner.nextLine();
//		
//		System.out.println( str );
//		int num = 
		
		myCode1();
	}
	
	private static void myCode1() throws IOException {
		
		Scanner scanner = new Scanner( System.in );
		int caseCount = scanner.nextInt();
		
		for( int i = 0; i < caseCount; i++ ) {
			int R  = scanner.nextInt();
			String S = scanner.next();
			for( int j = 0; j < S.length(); j++ ) {
				for( int k = 0; k < R; k++ ) {
					System.out.print( S.charAt( j ) );
				}
			}
			System.out.println();
		}
		
		
		scanner.close();
	}
}
