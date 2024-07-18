package baekjoon.silver.lv4.q10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q10816 {

	public static void main( String[] args ) throws IOException {
		
//		test1();
		
//		test2(); // 출력 초과
		
//		test3();
		
		// hashMap 으로 해보자.
		test4(); // 맞았습니다!!	166256KB	1192ms
	}
	/**
	 * hashMap
	 * 
	 * @throws IOException
	 */
	public static void test4() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt( br.readLine() );
		String cardArr = br.readLine();
		st = new StringTokenizer( cardArr );
		
		Map<Integer, Integer> mapN = new HashMap<>();
		for( int i = 0; i < N; i++ ) {
			int cnt = 1;
			int key = Integer.parseInt( st.nextToken() );
			
			System.out.println( mapN.get( key ) );
			if ( mapN.get( key ) != null ) {
				cnt = mapN.get( key ) + 1;
			}
			mapN.put( key, cnt );
		}
		System.out.println( "mapN => " + mapN );
		
		int M = Integer.parseInt( br.readLine() );
		cardArr = br.readLine();
		st = new StringTokenizer( cardArr );
		
		for( int i = 0; i < M; i++ ) {
			
			int checkNum = Integer.parseInt( st.nextToken() );
			
			int result = 0;
			
			if ( mapN.get( checkNum ) != null ) {
				result = mapN.get( checkNum );
			}
			sb.append( result ).append( " " );
		}
		
		System.out.println( sb );
	}

	public static void test3() throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt( br.readLine() );
		String cardArr = br.readLine();
		
		int[] arrN = new int[ N ]; 
		st = new StringTokenizer( cardArr );
		for( int i = 0; i < N; i++ ) {
			arrN[ i ] = Integer.parseInt( st.nextToken() );
		}

		int M = Integer.parseInt( br.readLine() );
		String checkCard = br.readLine();
		st = new StringTokenizer( checkCard );
		
		int[] arrM = new int[ M ];
		
		int[] resultArr = new int[ M ];
		st = new StringTokenizer( checkCard );
		
		// 비교 시작
		for( int i = 0; i < M; i++ ) {
			
			int num = Integer.parseInt( st.nextToken() );
			arrM[ i ] = num;
			
			for( int j = 0; j < arrN.length; j++ ) {
				if ( arrN[j] == arrM[i] ) {
					resultArr[i]++;
				}
			}
			sb.append( resultArr[i] ).append( " " );
		}
		System.out.println( sb );
		
	}
	
	public static void test2() throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		// int N = Integer.parseInt( br.readLine() );
		int N = 10;
//		String cardArr = br.readLine();
		
		// int[] arrN = new int[ N ]; 
		int[] arrN = { 6, 3, 2, 10, 10, 10, -10, -10, 7, 3 };
		
//		st = new StringTokenizer( cardArr );
//		for( int i = 0; i < N; i++ ) {
//			arrN[ i ] = Integer.parseInt( st.nextToken() );
//		}
		System.out.println( "arrN : " + Arrays.toString( arrN ) );

//		int M = Integer.parseInt( br.readLine() );
		int M = 8;
//		String checkCard = br.readLine();
//		st = new StringTokenizer( checkCard );
		
//		int[] arrM = new int[ M ];
		int[] arrM = { 10, 9, -5, 2, 3, 4, 5, -10 };
		
		int[] resultArr = new int[ M ];
//		st = new StringTokenizer( checkCard );
//		for( int i = 0; i < M; i++ ) {
//			
//			int num = Integer.parseInt( st.nextToken() );
//			arrM[ i ] = num;
//			
//		}
		System.out.println( "arrM : " + Arrays.toString( arrM ) );
		
		for( int i = 0; i < arrM.length; i++ ) {
			
			System.out.println( "[ arrM[i] =>> " + arrM[i] );
			
			for( int j = 0; j < arrN.length; j++ ) {
				System.out.println( arrN[j] );
				if ( arrN[j] == arrM[i] ) {
					resultArr[i]++;
				}
			}
			sb.append( resultArr[i] ).append( " " );
		}
		System.out.println( "resultArr : " + Arrays.toString( resultArr ) );
		
		System.out.println( "sb : " + sb.toString() );
	}
	
	public static void test1() throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		StringTokenizer st;
		int N = Integer.parseInt( br.readLine() );
		String cardArr = br.readLine();
		
		int[] arrN = new int[ N ]; 
		st = new StringTokenizer( cardArr );
		for( int i = 0; i < N; i++ ) {
			arrN[ i ] = Integer.parseInt( st.nextToken() );
		}
		System.out.println( "arrN : " + Arrays.toString( arrN ) );

		int M = Integer.parseInt( br.readLine() );
		String checkCard = br.readLine();
		st = new StringTokenizer( checkCard );
		
		int[] arrM = new int[ M ];
		
		int[] resultArr = new int[ M ];
		st = new StringTokenizer( checkCard );
		for( int i = 0; i < M; i++ ) {
			
			int num = Integer.parseInt( st.nextToken() );
			arrM[ i ] = num;
			
		}
		System.out.println( "arrM : " + Arrays.toString( arrM ) );
		
		for( int i = 0; i < arrM.length; i++ ) {
			
			System.out.println( "[ arrM[i] =>> " + arrM[i] );
			
			for( int j = 0; j < arrN.length; j++ ) {
				System.out.println( arrN[j] );
				if ( arrN[j] == arrM[i] ) {
					resultArr[i]++;
				}
			}
		}
		System.out.println( "resultArr : " + Arrays.toString( resultArr ) );
	}
}
