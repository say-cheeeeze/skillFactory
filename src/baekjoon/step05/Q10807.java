package baekjoon.step05;

import java.util.Scanner;

/**
 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 * 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 
 * 둘째 줄에는 정수가 공백으로 구분되어져있다. 
 * 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 
 * 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
 * 
 * 
 * 11
	1 4 1 2 4 2 4 2 3 4 4
	2
=> 3
 * @author admin
 *
 */
public class Q10807 {

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in );
		
		// 받을 정수 개수
		int cnt = sc.nextInt();
		
		System.out.println( "받을 정수의 개수 : " + cnt );
		
		int[] numArr = new int[cnt];
		
		for( int i = 0; i < numArr.length; i++ ) {
			
			numArr[i] = sc.nextInt();
		}
		
		int findNum = sc.nextInt();
		
		System.out.println( "찾을 정수 : " + findNum );
		
		int findCnt = 0;
		for( int i = 0; i < numArr.length; i++ ) {
			if ( numArr[i] == findNum ) {
				findCnt++;
			}
		}
		
		System.out.println( "찾은  개수 : " + findCnt );
		
//		int findNum = Integer.parseInt( st.nextToken() );
//		System.out.println( "찾아야하는 정수 : " + findNum );

		sc.close();
	}

}
