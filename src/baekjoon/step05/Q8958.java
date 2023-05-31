package baekjoon.step05;

import java.util.Scanner;

/**
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
 * O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
 * 
 * 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 테스트 케이스의 개수가 주어진다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 
 * 문자열은 O와 X만으로 이루어져 있다.
 * 
 * 출력
 * 각 테스트 케이스마다 점수를 출력한다.
 * 
 * ex )	OOXXOXXOOO ->  10
 *		XOXXOXXXOO ->  4

 * 
 * @author cheeeeze
 *
 */
public class Q8958 {

	public static void main( String[] args ) {
		
		Scanner sc = new Scanner( System.in );
		int count = sc.nextInt();
		if ( count <= 0 || count >= 80 ) {
			System.out.println( "##### 0 보다 크고 80 보다 작아야 합니다. 프로그램을 종료합니다..");
			sc.close();
			return;
		}
		
		String[] strArr = new String[count];
		
		for( int i = 0; i < strArr.length; i++ ) {
			
			strArr[i] = sc.next();
			// 만약 더 할 수 있으면 여기서 문자열 중에 O 나 X 이 아닌 것이면 프로그램 종료전개
		}
		
		sc.close();
		
		
		
		for ( int i = 0; i < strArr.length; i++ ) {

			int totalScore = 0;
			int countScore = 0;
			
			for ( int j = 0; j < strArr[i].length(); j++ ) {
				
				if ( strArr[i].charAt(j) == 'O' ) {
					countScore++;
					totalScore += countScore;
				}
				else {
					countScore = 0;
				}
				
			}
			System.out.println( "각 테스트 케이스 별 점수 : " + totalScore );
			
		}
	}
}
