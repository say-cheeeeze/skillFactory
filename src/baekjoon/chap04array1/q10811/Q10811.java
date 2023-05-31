package baekjoon.chap04array1.q10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10811 {
	
	static int[] basketArr;
	
	public static void main( String[] args ) throws IOException {
		
		reverseTest();
		solution1();
	}
	
	private static void solution1() throws IOException  {
	
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input1 = br.readLine();
		StringTokenizer st = new StringTokenizer( input1 );
		int M = Integer.parseInt( st.nextToken() );
		int N = Integer.parseInt( st.nextToken() );
		
		basketArr = new int[M];
		for( int basket = 0; basket < basketArr.length; basket++ ) {
			basketArr[basket] = basket+1;
		}
		for( int cnt = 0; cnt < N; cnt++ ) {
			
			String strRule = br.readLine();
			st = new StringTokenizer( strRule );
			int i = Integer.parseInt( st.nextToken() );
			int j = Integer.parseInt( st.nextToken() );
			reverse( i, j );
		}
		
		StringBuilder sb = new StringBuilder();
		
		for( int basket = 0; basket < basketArr.length; basket++ ) {
			sb.append( basketArr[basket] + " " );
		}
		System.out.println( sb.toString().trim() );
	}
	private static void reverse( int i, int j ) {
		
		int[] copy = Arrays.copyOfRange( basketArr, i-1, j );
		System.out.println( "Copy 본 : " + Arrays.toString( copy ) );
		
		System.out.println( "바꾸기 전 : " + Arrays.toString( basketArr ) );
		
		for( int n = 0; n < copy.length; n++ ) {
			basketArr[ i-1 + n ] = copy[copy.length - 1 - n];
		}
		System.out.println( "reverse 후 : " + Arrays.toString( basketArr ) );
		
	}
	
	private static void reverseTest() {
		
		System.out.println( "reverse Test ##########" );
		int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};
		int from = 2;
		int to = 5;
		int[] copy = Arrays.copyOfRange( arr1, from, to );
		System.out.println( Arrays.toString( copy ) ); // [3,4,5]
		for( int n = 0; n < copy.length; n++ ) {
			System.out.println( "n : " + n + "// 바꿀 값 : " + copy[copy.length - 1 - n] );
			arr1[ from + n ] = copy[copy.length - 1 - n];
		}
		System.out.println( Arrays.toString( arr1 ) );
		System.out.println( "reverse Test ##########" );
	}
}
