package baekjoon.step52_deep1.q1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 알파벳 대소문자로 된 단어가 주어지면, 
 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 입력 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 출력 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * 
 * 입력 : Mississipi
 * 출력 : ?
 * 
 * 입력 : zZa
 * 출력 : Z
 * 
 * 입력 : baaa
 * 출력 : A
 * 
 * @author admin
 *
 */
public class Q1157 {
	
	public static void main( String[] args ) {
		
		// 첫번째방법();
		Buffer를이용();
		
	}

	public static void 첫번째방법() {

		// System.out.println( (int)'a' ); // 97
		// System.out.println( (int)'A' ); // 65
		Scanner scanner = new Scanner( System.in );
		String inputStr = scanner.nextLine();
		
		// 이 단어중에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
		// 문자열을 각 알파벳으로 나눈다.
		
		// 1) char배열을 따로 마련하고 거기에다가 입력받은 문자를 체크하면서 등장할때마다 1개씩 값을 증가시킨다.
		// 검사가 끝나면 char 배열에서 max 를 뽑고 만약 2개 이상인 경우 ? 를 출력
		// 알파벳 중 가장 많이 사용된 것을 가려낸다.
		int[] refArr = new int[26]; // 영문자 배열 공간 선언
		char[] charArr = inputStr.toCharArray();
		for( int i = 0; i < charArr.length; i++ ) {
			
			int refIdx = (int)charArr[i];
			// 해당 문자가 대문자인 경우
			if ( 65 <= refIdx && 90 >= refIdx ) {
				refArr[ refIdx - 65 ]++;
			}
			// 소문자인 경우
			else {
				refArr[ refIdx - 97 ]++;
			}
			
		}
		
		int max = -1;
		char result = '?';
		for( int i = 0; i < refArr.length; i++ ) {
//			System.out.println( refArr[i] );
			if ( max < refArr[i] ) {
				max = refArr[i];
				result = (char)( i + 65 );
			}
			else if ( max == refArr[i] ) {
				result = '?';
			}
		}
		
		System.out.println( result );
		scanner.close();
	}
	
	public static void Buffer를이용() {
		
		try {
			
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			
			String inputStr = br.readLine();
			
			int[] refArr = new int[26];

			char[] charArr = inputStr.toCharArray();
			for( int i = 0; i < charArr.length; i++ ) {
				
				int refIdx = (int)charArr[i];
				// 해당 문자가 대문자인 경우
				if ( 65 <= refIdx && 90 >= refIdx ) {
					refArr[ refIdx - 65 ]++;
				}
				// 소문자인 경우
				else {
					refArr[ refIdx - 97 ]++;
				}
				
			}
			
			int max = -1;
			char result = '?';
			for( int i = 0; i < refArr.length; i++ ) {
//				System.out.println( refArr[i] );
				if ( max < refArr[i] ) {
					max = refArr[i];
					result = (char)( i + 65 );
				}
				else if ( max == refArr[i] ) {
					result = '?';
				}
			}
			
			System.out.println( result );
			
		}
		catch( IOException e ) {
			e.printStackTrace();
		}
		
	}
}
