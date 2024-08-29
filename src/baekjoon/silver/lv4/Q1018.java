package baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 체스판 다시 칠하기
 *
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 2 초	128 MB	130471	65053	51987	49.924%
 * 문제
 * 지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다.
 * 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다.
 * 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.
 *
 * 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다.
 * 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고,
 * 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다.
 * 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다.
 * 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
 *
 * 보드가 체스판처럼 칠해져 있다는 보장이 없어서,
 * 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.
 * 당연히 8*8 크기는 아무데서나 골라도 된다.
 * 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N과 M이 주어진다.
 * N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.
 * 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다.
 * B는 검은색이며, W는 흰색이다.
 *
 * 출력
 * 첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
 *
 * 예제 입력 1
 * 8 8
 * WBWBWBWB
 * BWBWBWBW
 * WBWBWBWB
 * BWBBBWBW
 * WBWBWBWB
 * BWBWBWBW
 * WBWBWBWB
 * BWBWBWBW
 * 예제 출력 1
 * 1
 */
public class Q1018 {
	
	public static void main( String[] args ) throws IOException {
		
		// 다시 칠해야하는 정사각형의 개수의 최소값?
		// 규칙에 어긋나는 요소의 개수
		// 규칙에 맞는 답을 먼저 가진다.
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String s = br.readLine();
		StringTokenizer tokenizer = new StringTokenizer( s );
		int N = Integer.parseInt( tokenizer.nextToken() ); // row
		int M = Integer.parseInt( tokenizer.nextToken() ); // col
		
		for( int i = 0; i + 8 <= N; i++ ) {
			for( int j = 0; j + 8 <= M; j++ ) {
				System.out.printf( "%d, %d\n", i, j );
//				int cost = getCost( i,j );
			}
		}
		
		if ( 1==1 ) return;
		
		boolean[][] inputArr = new boolean[N][M];
		
		for ( int i = 0; i < N; i++ ) {
			
			String lineInputStr = br.readLine();
			
			for ( int j = 0; j < M; j++ ) {
				// 흰색 true 검정색 false
				inputArr[i][j] = lineInputStr.charAt( j ) == 'W';
			}
		}
		
		// System.out.println( Arrays.deepToString( inputArr ) );
		
		// 이제 받은 그린 체스판을 검사한다.
		// 기준은 첫번째 칸의 색깔이고 각 칸이 해당 기준에 대한 정답 색깔이 아닌 경우를 검사한다.
		int cnt1 = 0;
		int cnt2 = 0;
		boolean guide1 = inputArr[0][0];
		boolean guide2 = !guide1;
		for ( int i = 0; i < N; i++ ) {
			
			for( int j = 0; j < M; j++ ) {
				System.out.printf( "guide1 / i j => %b, %d %d %b\n", guide1, i, j, inputArr[i][j] != guide1 );
				if ( inputArr[i][j] != guide1 ) {
					cnt1++;
				}
				if ( inputArr[i][j] != guide2 ) {
					cnt2++;
				}
				
				guide1 = !guide1;
				guide2 = !guide2;
				
			}
			guide1 = !guide1;
			guide2 = !guide2;
		}
		System.out.println( cnt1 + "개 바꿔야함" );
		System.out.println( "또는 " + cnt2 + "개 바꿔야함" );
		System.out.println( Math.min( cnt1, cnt2 ) );
	}
}