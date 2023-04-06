package baekjoon.chap07basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 * 달팽이는 낮에 A미터 올라갈 수 있다. 
 * 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
 * 또, 정상에 올라간 후에는 미끄러지지 않는다.
 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
 * 
 * 출력 : 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
 * 
 * 2 1 5 => 4 
 * 
 * @author admin
 *
 */
public class Q2869 {

	public static void main(String[] args) throws Exception {
		
		// 풀이1();
		
//		풀이2();
		
		풀이3();
		
		
	}

	private static void 풀이1() {

		Scanner sc = new Scanner( System.in );
		
		int upByDay = sc.nextInt();		// 상승 높이
		int downByNight = sc.nextInt();	// 미끄러지는 높이
		int treeHeight = sc.nextInt();	// 나무 막대 높이
		
		int currentHeight = 0; 	// 현재 높이
		int dayCount = 1; 		// 일 카운트

		// 첫째날 A 상승 -> 정상의 높이와 같거나 높은가 ? -> No -> 밤이 되어 B만큼 하강 -> dayCount++
		// 첫째날 A 상승 -> 정상의 높이와 같거나 높은가 ? -> No -> 밤이 되어 B만큼 하강 -> dayCount++
		// 셋째날 A 상승 -> 정상의 높이와 같거나 높은가 ? -> YES -> 미끄러지지않음! -> 며칠걸렸는지? -> 3일
		
		while( true ) {
			// 만약 정상의 높이와 같거나 그 이상이 됨
			if ( currentHeight >= treeHeight ) {
				System.out.println( "dayCount : " + dayCount );
				sc.close();
				return;
			}
			// 아직 정상이 아님.
			else {
				
				// 상승함(낮)
				currentHeight = currentHeight + upByDay;
				// 여기서 한번 더 체크를 함
				if ( currentHeight >= treeHeight ) {
					System.out.println( "dayCount : " + dayCount );
					sc.close();
					return;
				}
				// 아직 정상이 아니면 미끄러짐(밤)
				else {
					currentHeight = currentHeight - downByNight;
					dayCount++;
				}
			}
			
			
		}
	}
	
	
	/**
	 * bufferedReader 를 이용
	 * @throws IOException 
	 */
	private static void 풀이2() throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String delimeter = " ";
		StringTokenizer st = new StringTokenizer( br.readLine(), delimeter );
		
		int upByDay = Integer.parseInt( st.nextToken() );		// 상승 높이
		int downByNight = Integer.parseInt( st.nextToken() );	// 미끄러지는 높이
		int treeHeight = Integer.parseInt( st.nextToken() );	// 나무 막대 높이
		
		int currentHeight = 0; 	// 현재 높이
		int dayCount = 1; 		// 일 카운트

		// 첫째날 A 상승 -> 정상의 높이와 같거나 높은가 ? -> No -> 밤이 되어 B만큼 하강 -> dayCount++
		// 첫째날 A 상승 -> 정상의 높이와 같거나 높은가 ? -> No -> 밤이 되어 B만큼 하강 -> dayCount++
		// 셋째날 A 상승 -> 정상의 높이와 같거나 높은가 ? -> YES -> 미끄러지지않음! -> 며칠걸렸는지? -> 3일
		
		while( true ) {
			// 만약 정상의 높이와 같거나 그 이상이 됨
			if ( currentHeight >= treeHeight ) {
				System.out.println( "dayCount : " + dayCount );
				return;
			}
			// 아직 정상이 아님.
			else {
				
				// 상승함(낮)
				currentHeight = currentHeight + upByDay;
				// 여기서 한번 더 체크를 함
				if ( currentHeight >= treeHeight ) {
					System.out.println( "dayCount : " + dayCount );
					return;
				}
				// 아직 정상이 아니면 미끄러짐(밤)
				else {
					currentHeight = currentHeight - downByNight;
					dayCount++;
				}
			}
			
			
		}
		
	}
	
	
	private static void 풀이3() throws IOException {

		// 정점에 도달한 경우 밤이 되어도 미끄러지지 않는다.
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine(), " " );
		
		int up = Integer.parseInt( st.nextToken() ); // 상승 높이
		int down = Integer.parseInt( st.nextToken() );	// 미끄러지는 높이
		int treeHeight = Integer.parseInt( st.nextToken() );		// 나무 막대 높이
		
		// 낮에 상승한 다음에 현재 높이를 측정해야하는데 만약 높이가 정상인 경우에는 다시 하강하지 않으므로 
		// 그 상승한 직후 시점을 기준으로 얼마나 상승이 필요한지 계산하려면 나무 높이에서 내려가는 1회 하강 높이를 뺀 높이를 계산하면 된다.
		int dayCount = ( treeHeight - down ) / ( up - down );
		
		// 근데 만약 이 때 더 올라가야하는 경우가 있을 수 있다. 이건 위의 dayCount 를 계산할 때 나머지가 발생하는지를 체크하면 된다.
		// ( treeHeight - down ) % ( up - down ) == 0 이면 정상에 딱 올라간 것이고
		// 아니면 조금 더 올라가야하는 것임.
		if ( ( treeHeight - down ) % ( up - down ) != 0 ) {
			dayCount++;
		}
		
		System.out.println( dayCount );

	}
	
	public static void println( Object objects) {
		
		System.out.print("[" + (new Throwable()).getStackTrace()[0].getClassName() + "]" );
		System.out.print(  "(line:" +(new Throwable()).getStackTrace()[0].getLineNumber()  + ") : " );
		System.out.println( objects );
	}

}
