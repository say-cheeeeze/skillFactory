package baekjoon.step52_deep1.q2941;

import java.util.Scanner;

/**
 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 
 * 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
 * 크로아티아 알파벳	변경
		č	c=
		ć	c-
		dž	dz=
		đ	d-
		lj	lj
		nj	nj
		š	s=
		ž	z=

	예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
	단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * dž는 무조건 하나의 알파벳으로 쓰이고, 
 * d와 ž가 분리된 것으로 보지 않는다. 
 * lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 * 
 * @author admin
 *
 */
public class Q2941 {

	public static void main( String[] args ) {
		
		String test = "안녕안녕안녕";
		test = test.replace( "안녕", "하하ㅋ" );
		System.out.println( test );
		
		// 단어가 주어지면 몇개의 크로아티아 알파벳으로 이루어져있는지를 출력.
		// 입력 : String
		// 출력 : 몇개
		
		// 입력받은 문자열을 검사하여 targetStrArr 에 속한 문자열이 있으면 각 길이를 1개씩 줄여서 계산한다.
		String[] targetStrArr = new String[] {"c=","c-","dz=","d-","lj", "nj", "s=","z="};
		
		
		Scanner sc = new Scanner( System.in );
		String str = sc.nextLine();
		
		for( int i = 0; i < targetStrArr.length; i++ ) {
			
			if ( str.contains( targetStrArr[i] ) ) {
				
				// 두글자인 문자열이 존재하는 경우 "0" 이라는 의미없는 길이 1의 문자로 치환한다.
				// replace 를 통해 모두 바꾼다.
				str = str.replace( targetStrArr[i], "0" );
			}
			
		}
		
		System.out.println( "결과 길이 : " + str.length() );
		sc.close();
		
	}
}
