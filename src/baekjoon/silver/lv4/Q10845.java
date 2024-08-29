package baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 큐
 *
 * 시간 제한              메모리 제한    제출   정답    맞힌 사람 정답 비율
 * 0.5 초 (추가 시간 없음)	256 MB	136602	64330	50651	49.093%
 *
 * 문제
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *
 * 명령은 총 여섯 가지이다.
 *
 * push X: 정수 X를 큐에 넣는 연산이다.
 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다.
 * 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 큐에 들어있는 정수의 개수를 출력한다.
 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
 * front: 큐의 가장 앞에 있는 정수를 출력한다.
 * 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 큐의 가장 뒤에 있는 정수를 출력한다.
 * 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *
 * 입력
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
 * 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
 * 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
 * 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 *
 * 출력
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 *
 * 예제 입력 1
 * 15
 * push 1
 * push 2
 * front
 * back
 * size
 * empty
 * pop
 * pop
 * pop
 * size
 * empty
 * pop
 * push 3
 * empty
 * front
 * 예제 출력 1
 * 1
 * 2
 * 2
 * 0
 * 1
 * 2
 * -1
 * 0
 * 1
 * -1
 * 0
 * 3
 *
 *
 *
 front 시 큐의 첫번째를 확인하면 안되고 현재 포인터의 위치를 확인해야 할 것 같습니다
 input:
 4
 push 3
 push 4
 pop
 front
 output:
 3
 -1
 answer:
 3
 4
 *
 *
 */
public class Q10845 {

	public static void main( String[] args ) throws IOException {
	
//		int[] queue = new int[10000];
		int[] queue = new int[15];
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int cmdCnt = Integer.parseInt( br.readLine() );
		int pointer = 0;
		int floorPointer = 0; // 맨 앞 pointer
		for( int i = 0; i < cmdCnt; i++ ) {
			String cmd = br.readLine();
			if ( cmd.contains( "push" ) ) {
				// push X : 정수 X 를 Queue 에 넣는다.
				int num = Integer.parseInt( cmd.split( " " )[1] );
				queue[pointer++] = num;
				log( queue, pointer );
			}
			else if ( cmd.equals( "pop" ) ) {
				// 가장 앞에 있는 정수를 빼고, 그 수를 출력한다.
				// 만약 큐에 들어있는 정수가 없으면 -1 을 출력한다.
				
				// 가장 앞 index = floorPointer
				int frontValue = queue[floorPointer];
				if ( frontValue == 0 ) {
					System.out.println( -1 );
				}
				else {
					System.out.println( frontValue );
					queue[floorPointer] = 0;
					floorPointer++;
				}
				
				log( queue, pointer );
			}
			else if ( cmd.equals( "size" ) ) {
				// 큐에 들어있는 정수의 개수 출력한다.
				System.out.println( pointer - floorPointer );
				log( queue, pointer );
			}
			else if ( cmd.equals( "empty" ) ) {
				if ( queue[floorPointer] == 0 ) {
					System.out.println( 1 );
				}
				else {
					System.out.println( 0 );
				}
				log( queue, pointer );
			}
			else if ( cmd.equals( "front" ) ) {
				if ( queue[floorPointer] == 0 ) {
					System.out.println( -1 );
				}
				else {
					System.out.println( queue[floorPointer] );
				}
				log( queue, pointer );
			}
			else if ( cmd.equals( "back" ) ) {
				int popPointer = 0;
				if ( pointer > 0 ) {
					popPointer = pointer - 1;
				}
				if ( queue[popPointer] == 0 ) {
					System.out.println( -1 );
				}
				else {
					System.out.println( queue[popPointer] );
				}
				log( queue, pointer );
			}
		}
	}
	
	private static void log( int[] queue, int pointer ) {
		System.out.printf( "%s #### pointer : %d\n", Arrays.toString(queue), pointer );
	}
}
