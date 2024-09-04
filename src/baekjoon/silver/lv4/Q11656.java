package baekjoon.silver.lv4;

import java.io.*;
import java.util.Arrays;

/**
 * 접미사 배열
 *
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	256 MB	27272	19107	15910	70.910%
 * 문제
 * 접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
 *
 * baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가 있고,
 * 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
 *
 * 문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000보다 작거나 같다.
 *
 * 출력
 * 첫째 줄부터 S의 접미사를 사전순으로 한 줄에 하나씩 출력한다.
 *
 * 예제 입력 1
 * baekjoon
 * 예제 출력 1
 * aekjoon
 * baekjoon
 * ekjoon
 * joon
 * kjoon
 * n
 * on
 * oon
 */
public class Q11656 {
	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String S = br.readLine();
		String[] sArr = new String[S.length()];
		for ( int i = 0; i < S.length(); i++ ) {
			System.out.println( S.substring( i ) );
			sArr[i] = S.substring( i );
		}
		
		Arrays.sort( sArr );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		for ( String s : sArr ) {
			bw.write( s );
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
