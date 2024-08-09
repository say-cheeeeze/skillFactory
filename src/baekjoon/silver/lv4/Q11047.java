package baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 동전 0
 *
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	256 MB	154162	82867	63225	52.770%
 * 문제
 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
 * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다.
 * 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
 *
 * 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다.
 * (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
 *
 * 출력
 * 첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
 *
 * 예제 입력 1
 * 10 4200
 * 1
 * 5
 * 10
 * 50
 * 100
 * 500
 * 1000
 * 5000
 * 10000
 * 50000
 * 예제 출력 1
 * 6
 */
public class Q11047 {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String inputA = br.readLine();
		StringTokenizer tokenizer1 = new StringTokenizer( inputA, " " );
		int coinCnt = Integer.parseInt( tokenizer1.nextToken() );
		int coinTarget = Integer.parseInt( tokenizer1.nextToken() );
		int typeCnt = 0;
		
		int[] coinList = new int[ coinCnt ];
		
		for( int i = 0; i < coinCnt; i++ ) {
			coinList[ i ] = Integer.parseInt( br.readLine() );
		}
		
		// 3개, 1500 이라고 하자.
		// 그럼 1000 + 500 으로 할 수 있다.
		for( int i = coinCnt - 1; i >= 0; i-- ) {
			if ( coinList[ i ] > coinTarget || coinTarget == 0 ) {
				continue;
			}
			typeCnt += coinTarget / coinList[ i ];
			coinTarget = coinTarget % coinList[i];
		}
		
		System.out.println( typeCnt );
	}
}
