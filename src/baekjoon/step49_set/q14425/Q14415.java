package baekjoon.step49_set.q14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q14415 {

	public static void main( String[] args ) throws IOException {
		
		/**
		 * 입력
		 * 첫째 줄에 문자열의 개수 N과 M (1 ≤ N ≤ 10,000, 1 ≤ M ≤ 10,000)이 주어진다.
		 * 다음 N개의 줄에는 집합 S에 포함되어 있는 문자열들이 주어진다.
		 * 다음 M개의 줄에는 검사해야 하는 문자열들이 주어진다.
		 * 입력으로 주어지는 문자열은 알파벳 소문자로만 이루어져 있으며,
		 * 길이는 500을 넘지 않는다.
		 * 집합 S에 같은 문자열이 여러 번 주어지는 경우는 없다.
		 */
		solution1(); // 정답 // 31312kb 420ms
	}
	
	public static void solution1() throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() );
		int strCntN = Integer.parseInt( st.nextToken() );
		System.out.println( "문자열의 개수 : " + strCntN );
		
		int targetStringM = Integer.parseInt( st.nextToken() );
		System.out.println( "검사해야할 문자열 개수 : " + targetStringM );
		
		Set<String> setString = new HashSet<>();
		
		for( int i = 0; i < strCntN; i++ ) {
			setString.add( br.readLine() );
		}
		
		// 삽입횟수만큼 add 한 후에 바로 검사할 문자열을 입력받는데
		// 이 때 카운팅을 하면 된다.
		int containCnt = 0;
		for( int i = 0; i < targetStringM; i++ ) {
			String code = br.readLine();
			
			if ( setString.contains( code ) ) {
				containCnt++;
			}
		}
		
		System.out.println( "몇 개가 집합 S 에 포함? : " + containCnt );
		
	}
}
