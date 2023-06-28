package baekjoon.step09_sort.q18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q18870 {

	public static void main( String[] args ) throws IOException {
		
		// 시간초과...
//		solution1();
		
		
		// 맞았습니다!290800KB	1864ms
		solution2();
	}
	
	public static void solution1() throws IOException {

		
//		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
//		int num = Integer.parseInt( br.readLine() );
//		int[] numArr = new int[ num ];
		int[] numArr = { 2, 4, -10, 4, -9 };
//
//		StringTokenizer st = new StringTokenizer( br.readLine(), " " );
//		for( int i = 0; i < numArr.length; i++ ) {
//			numArr[i] = Integer.parseInt( st.nextToken() );
//		}
		
		// 좌표 압축값을 출력하기 위해.
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0; i < numArr.length; i++ ) {
			
			int check = numArr[i];
			int compressionVal = 0;
			StringBuilder checkNum = new StringBuilder();
			System.out.println( "###### check : " + check );
			
			for( int j = 0; j < numArr.length; j++ ) {
				if ( numArr[j] >= check ) {
					continue;
				}
				System.out.print( numArr[j] + " " );
				System.out.println( checkNum.toString().contains( String.valueOf( numArr[j] ) ) );
				if ( checkNum.toString().contains( String.valueOf( numArr[j] ) ) ) {
					continue;
				}
				checkNum.append( numArr[j] );
				compressionVal++;
			}
			System.out.println( "compressionVal : " + compressionVal );
			sb.append( compressionVal + " "  );
		}
		
		System.out.println( "[ " + sb + " ]" );
		
	}
	
	public static void solution2() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int num = Integer.parseInt( br.readLine() );
		int[] numArr = new int[ num ];

		StringTokenizer st = new StringTokenizer( br.readLine(), " " );
		for( int i = 0; i < numArr.length; i++ ) {
			numArr[i] = Integer.parseInt( st.nextToken() );
		}
		
		int[] sortArr = Arrays.copyOf( numArr, numArr.length );
		Map<Integer, Integer> rankMap = new HashMap<>();
		Arrays.sort( sortArr );
		
		int rank = 0;
		for( int val : sortArr ) {
			if ( !rankMap.containsKey( val ) ) {
				
				rankMap.put( val, rank );
				rank++;
			}
		}
		System.out.println( rankMap );
		
		StringBuilder sb = new StringBuilder();
		for( int i = 0; i < numArr.length; i++ ) {
			System.out.println( numArr[i] + " : " + rankMap.get( numArr[i] ) );
			sb.append( rankMap.get( numArr[i] ) + " " );
		}
		System.out.println( sb );
	}
}
