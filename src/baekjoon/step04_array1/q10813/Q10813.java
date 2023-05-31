package baekjoon.step04_array1.q10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10813 {
	public static void main( String[] args ) throws IOException {
		
		solution1();
		
	}
	
	/**
	 * 15892KB 148ms
	 * @throws IOException
	 */
	private static void solution1() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input1 = br.readLine();
		StringTokenizer st = new StringTokenizer( input1 );
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt( st.nextToken() ); // 바구니 개수
		int N = Integer.parseInt( st.nextToken() ); // 공을 바꿀 횟수
		
		int[] basketArr = new int[M];
		for( int basket = 0; basket < basketArr.length; basket++ ) {
			basketArr[basket] = basket+1;
		}
		System.out.println( M + "개의 바구니 >> " + Arrays.toString( basketArr ) );
		System.out.println( N + "번 바꾼다." );
		
		
		for( int cnt = 0; cnt < N; cnt++ ) {
			
			String strRule = br.readLine();
			st = new StringTokenizer( strRule );
			int i = Integer.parseInt( st.nextToken() );
			int j = Integer.parseInt( st.nextToken() );
			int ballI = basketArr[i-1];
			basketArr[i-1] = basketArr[j-1];
			basketArr[j-1] = ballI;
		}
		
		for( int basket = 0; basket < basketArr.length; basket++ ) {
			
			sb.append( basketArr[basket] + " " );
		}
		
		System.out.println( sb.toString().trim() );
		br.close();
	}
}
