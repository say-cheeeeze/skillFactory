package baekjoon.bronze.lv2.q25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q25305 {

	public static void main( String[] args ) throws IOException {
		
		// N 명 중 k 명은 상을 받는다
		// 상 받는 사람들 중 가장 낮은 점수는?
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input1 = br.readLine();
		StringTokenizer st = new StringTokenizer( input1 );
		
		int[] examinee = new int[ Integer.parseInt( st.nextToken() ) ];
		int winnerCnt = Integer.parseInt( st.nextToken() );
		
		st = new StringTokenizer( br.readLine() );
		
		for( int i = 0; i < examinee.length; i++ ) {
			examinee[i] = Integer.parseInt( st.nextToken() );
		}
		
		Arrays.sort( examinee );
		System.out.println( Arrays.toString( examinee ) );
		System.out.println( examinee[ examinee.length - winnerCnt ] );
	}
}
