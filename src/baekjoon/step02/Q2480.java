package baekjoon.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 주사위 세 개 
 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 * 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
 * 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
 * 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 * 
 * 입력 : 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
 * 출력 : 첫째 줄에 상금을 출력 
 * 
 * 3 3 6 => 1300
 * 2 2 2 => 12000
 * 6 2 5 => 600
 */
public class Q2480 {
	
	public static void main( String[] args ) throws IOException {
		
//		myCode();
		
		다른사람의어떤더빠른코드();
	}
	
	private static void myCode() {

		
		Scanner sc = new Scanner( System.in );
		
		String[] strArr = sc.nextLine().split( " " );
		int[] dices = new int[3];
		// 주사위 세 개 값 할당
		for( int i = 0; i < strArr.length; i++ ) {
			dices[ i ] = Integer.parseInt( strArr[ i ] );
			// System.out.print( dices[i] );
		}
		
		// 같은 눈의 갯수에 따라 count 계산
		// abc 가 있는데 같은 것 2개인 경우 a-b, a-c, b-c
		// 같은 것이 3개인 경우
		int price = 0;
		if ( dices[0] == dices[1] && dices[0] == dices[2] && dices[1] == dices[2] ) {
			// 10,000원+(같은 눈)×1,000원
			price = 10000 + dices[0] * 1000;
		}
		// 같은 것이 2개인 경우a-b, a-c, b-c
		else if ( dices[0] == dices[1] || dices[0] == dices[2] ) {
			// 1,000원+(같은 눈)×100원
			price = 1000 + dices[0] * 100; 
		}
		else if ( dices[1] == dices[2] ) {
			price = 1000 + dices[1] * 100;
		}
		// 모두 다른 눈
		else if ( dices[0] != dices[1] && dices[0] != dices[2] && dices[1] != dices[2] ){
			// 가장 큰 눈 × 100원
			price = Math.max( dices[0], Math.max( dices[1], dices[2] ) ) * 100;
		}
		// 상금
		System.out.println( price );
		
		sc.close();
	}
	
	private static void 다른사람의어떤더빠른코드() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int dice1 = Integer.parseInt(st.nextToken());
		int dice2 = Integer.parseInt(st.nextToken());
	int dice3 = Integer.parseInt(st.nextToken());

		if ( dice1 == dice2 && dice2 == dice3 ) {
			// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
			System.out.println( 10000 + dice1 * 1000 );
		} else if ( dice1 == dice2 ) {
			// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
			System.out.println( 1000 + dice1 * 100 );
		} else if ( dice2 == dice3 ) {
			System.out.println( 1000 + dice2 * 100 );
		} else if ( dice1 == dice3 ) {
			System.out.println( 1000 + dice1 * 100 );
		} else {
			// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다
			System.out.println( Math.max( Math.max( dice1, dice2 ), dice3 ) * 100);
		}

		br.close();
	}
}
