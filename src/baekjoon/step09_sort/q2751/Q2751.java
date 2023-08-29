package baekjoon.step09_sort.q2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q2751 {

	public static void main( String[] args ) throws IOException {
		
		//148488KB	1660ms 성공
//		원래오름차순이문제였음();
		
		내림차순정렬을해보자();
		
	}
	
	public static void 원래오름차순이문제였음() throws IOException {

		
		long start = System.nanoTime();
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt( br.readLine() );
//		int cnt = 1000000;
		int[] numArr = new int[ cnt ];
		
		for( int i = 0; i < cnt; i++ ) {
			numArr[i] = Integer.parseInt( br.readLine() );
//			numArr[i] = i;
		}
		
		Arrays.sort( numArr );
		for( int i = 0; i < numArr.length; i++ ) {
			sb.append( numArr[i] + "\n" );
		}
		System.out.println( sb.toString().trim() );
		
		long end = System.nanoTime();
		System.out.println( ( end - start ) / 1000 / 1000 + "ms" );
	}
	
	public static void 내림차순정렬을해보자() throws IOException {

		int cnt = 1000;
		int[] numArr = new int[ cnt ];
		
		for( int i = 0; i < cnt; i++ ) {
			numArr[i] = i;
		}
		
		List<Integer> numList = Arrays.stream( numArr ).boxed().toList();
		numList = numList.stream().sorted(Comparator.reverseOrder() ).toList();
		System.out.println( numList );
	}
}
