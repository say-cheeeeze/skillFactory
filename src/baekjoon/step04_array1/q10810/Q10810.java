package baekjoon.step04_array1.q10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q10810 {
	
	
	public static void main( String[] args ) throws IOException {
		
		// solution1();
		
		solution2();
	
	}
	
	// 14384KB	140ms
	public static void solution1() throws IOException {
		
		int N; // 바구니 개수
		int M; // 공 넣는 횟수
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String inputStr = br.readLine();
		N = Integer.parseInt( inputStr.split(" " )[0] );
		M = Integer.parseInt( inputStr.split(" " )[1] );
		
		Map<Integer, Integer> basketMap = new HashMap<>();
		for( int basketCnt = 0; basketCnt < N; basketCnt++ ) {
			basketMap.put( basketCnt+1, 0 );
		}
		System.out.println( "바구니 : " + basketMap );
		System.out.println( "공 넣는 횟수 : " + M );
		
		for( int game = 0; game < M; game++ ) {
			
			int i; // 바구니 from
			int j; // 바구니 to
			int k; // 몇번 공을 넣는지
			String rule = br.readLine();
			i = Integer.parseInt( rule.split( " " )[0] );
			j = Integer.parseInt( rule.split( " " )[1] );
			k = Integer.parseInt( rule.split( " " )[2] );
			System.out.println( i + "바구니부터 " + j + "바구니까지 " + k + "번 넣음" );
			
			for( int input = i; input <= j; input++ ) {
				basketMap.put( input, k );
			}
			// 바구니 N 10개 1,2,3,4,5,6,7,8,9,10
			// 공 넣는 횟수 M 3번
			// 2번바구니부터 5번바구니까지 2번 공 넣음
			// 바구니1 : 공 = 0 (없음)
			// 바구니2 : 6
			// 바구니3 : 6
			
			System.out.println( game + 1 + "회차 게임 종료 ########" );
			System.out.println( "바구니 상태 : " + basketMap );
		}
		
		System.out.println( "################# End of Game" );
		System.out.println( "최종 바구니 상태 : " + basketMap );
		
		for( int cnt = 0; cnt < N; cnt++ ) {
			System.out.print( basketMap.get( cnt+1 ) + " " );
		}
		
		br.close();
	}
	
	// 14288KB 128ms
	public static void solution2() throws IOException {
	
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int N; // 바구니 개수
		int M; // 공 넣는 횟수
		String inputStr = br.readLine();
		StringTokenizer st = new StringTokenizer( inputStr );
		N = Integer.parseInt( st.nextToken() );
		M = Integer.parseInt( st.nextToken() );
		System.out.println( "바구니 개수 : " + N );
		int[] basketArr = new int[ N ];
		
		for( int cnt = 0; cnt < M; cnt++ ) {
			
			int i; // 바구니 from
			int j; // 바구니 to
			int k; // 몇번 공을 넣는지
			String rule = br.readLine();
			st = new StringTokenizer( rule );
			i = Integer.parseInt( st.nextToken() );
			j = Integer.parseInt( st.nextToken() );
			k = Integer.parseInt( st.nextToken() );
			System.out.println( i + "바구니부터 " + j + "바구니까지 " + k + "번 공을 넣음" );
			
			for( int basket = i; basket <= j; basket++ ) {
				System.out.println( basket );
				basketArr[basket-1] = k;
			}
		}
		
		System.out.println( Arrays.toString( basketArr ) );
		StringBuilder sb = new StringBuilder();
		for( int ball = 0; ball < basketArr.length; ball++ ) {
			sb.append( basketArr[ball] );
			if ( ball != basketArr.length -1 ) {
				sb.append( " " );
			}
		}
		
		System.out.println( sb );
		br.close();
	}
	
	/**
	 * 참고할만한 다른 사람의 해결
	 *	11572KB	76ms
	 */
	public static void solution3() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] answer = new int[n];
		
		Stack<String[]> stack = new Stack<>();
		for(int i=0;i<m;i++) {
			stack.add(br.readLine().split(" "));
		}
		
		while(!stack.isEmpty()) {
			String[] cmd = stack.pop();
			int s = Integer.parseInt(cmd[0]) -1; //시작점 (0 부터 시작함으로 -1 로 보정)
			int e = Integer.parseInt(cmd[1]) -1; //끝점 (0 부터 시작함으로 -1 로 보정)
			int ball = Integer.parseInt(cmd[2]); //번호
			for(int i=s;i<=e;i++) {
				if(answer[i]==0) answer[i]=ball;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int ball:answer) {
			sb.append(ball+" ");
		}
		System.out.println(sb.toString().trim()); //출력
	}
}
