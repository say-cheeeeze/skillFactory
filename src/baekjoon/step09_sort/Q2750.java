package baekjoon.step09_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 수 정렬하기
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.
 * 수는 중복되지 않는다.
 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 예제 입력 1
 * 5
 * 5
 * 2
 * 3
 * 4
 * 1
 * ->
 * 출력
 * 1
 * 2
 * 3
 * 4
 * 5
 */
public class Q2750 {
	
	public static void main( String[] args ) throws Exception {
		
//		solution1();
		solution2();
	}
	
	public static void solution1() {
		
		Scanner sc = new Scanner( System.in );
		int cnt = sc.nextInt();
		
		System.out.println( "입력받은 숫자 : " + cnt );
		int[] numArr = new int[ cnt ];
		for( int i = 0; i < cnt; i++ ) {
			numArr[i] = sc.nextInt();
		}
		
		Arrays.sort( numArr );
		
		for ( int j : numArr ) {
			System.out.println( j );
		}
		
		sc.close();
	}
	
	public static void solution2() throws Exception {
	
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int cnt = Integer.parseInt( br.readLine() );
		
		System.out.println( "받은 입력 수 : " + cnt );
		
		int[] arr = new int[ cnt ];
		for( int i = 0; i < cnt; i++ ) {
			arr[i] = Integer.parseInt( br.readLine() );
		}
		
		Arrays.sort( arr );
		
		StringBuilder sb = new StringBuilder();
		for( int i = 0; i < arr.length; i++ ) {
			sb.append( arr[i] );
			if ( i != arr.length - 1 ) {
				sb.append( "\n" );
			}
		}
		
		System.out.println( sb );
		
	}
	
}
