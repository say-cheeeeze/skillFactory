package baekjoon.silver.lv4.q12789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q12789 {
	
	public static void main( String[] args ) throws IOException {
		
		test1();
	}
	
	public static void test1() throws IOException {
		// 줄서있는 대기 stack
		
		Stack<Integer> waitingStack = new Stack<>();
		// 간식 번호표 ( 처음엔 무조건 1번이므로 1 초기화 )
		
		int orderNumber = 1;
		// 줄이 엉망이라서 잠시 비켜있는 공간에 대기큐
		
		Stack<Integer> sideStack = new Stack<>();
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		// 승환이 앞에 있는 학생들의 수
		int N = Integer.parseInt( br.readLine() );
		
		// 승환 앞의 모든 학생들의 번호표 앞에서부터 순서대로
		// String inputLine = "1 4 6 2 3 5";
		String inputLine = br.readLine();
		String[] strArr = inputLine.split( " " );
		for ( int i = strArr.length - 1; i >= 0; i-- ) {
			waitingStack.add( Integer.parseInt( strArr[ i ] ) );
		}
		
		int topOfWait = -1;
		int topOfSide = -1;
		while ( orderNumber <= N ) {
			
			if ( waitingStack.size() > 0 ) {
				topOfWait = waitingStack.peek();
			}
			if ( sideStack.size() > 0 ) {
				topOfSide = sideStack.peek();
			}
			
			// 줄서있는 곳 또는 옆라인에 맨 앞에 간식 받을 차례의 사람이 있는 경우
			if ( topOfWait == orderNumber || topOfSide == orderNumber ) {
				
				if ( topOfWait == orderNumber ) {
					waitingStack.pop();
					orderNumber++;
					continue;
				}
				sideStack.pop();
				orderNumber++;
			}
			// 지금 각 맨 앞열에 차례인 사람은 없지만 아직 대기줄엔 사람이 남은 경우
			else if ( waitingStack.size() > 0 ) {
				
				// 옆라인으로 비켜서게 한다.
				sideStack.add( waitingStack.pop() );
			}
			else {
				// 아직 옆라인에 사람이 남았는데 줄 사람이 없는 경우
				System.out.println( "아직 옆라인에 사람이 남았는데 줄 사람이 없는 경우" );
				break;
			}
		}
		if ( waitingStack.size() == 0 && sideStack.size() == 0 ) {
			System.out.println( "Nice" );
		}
		else {
			System.out.println( "Sad" );
		}
		
	}
}
