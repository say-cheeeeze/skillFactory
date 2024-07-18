package baekjoon.silver.lv4.q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 맞았습니다!!	19776KB	196ms
 */
public class Q10828 {
	
	static int[] stackArr;
	static int size = 0;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int cmdCnt = Integer.parseInt( br.readLine() );
		
		stackArr = new int[ cmdCnt ];
		
		for ( int i = 0; i < cmdCnt; i++ ) {
			
			String input = br.readLine();
			
			solution( input );
		}
		
		System.out.println( sb );
	}
	
	/**
	 push X: 정수 X를 스택에 넣는 연산이다.
	 pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.
	 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 size: 스택에 들어있는 정수의 개수를 출력한다.
	 empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	 top: 스택의 가장 위에 있는 정수를 출력한다.
	 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * @param input
	 */
	public static void solution( String input ) {
		
		st = new StringTokenizer( input );
		String command = st.nextToken();
		System.out.println( "command => " + command );
		
		if ( "push".equals( command ) ) {
			int param = Integer.parseInt( st.nextToken() );
			stackArr[ size ] = param;
			size++;
		}
		else if ( "pop".equals( command ) ) {
			int num;
			if ( size < 1 ) {
				num = -1;
			}
			else {
				num = stackArr[ size - 1 ];
				stackArr[ size - 1 ] = 0;
			}
			System.out.println( "num : " + num );
			sb.append( num ).append( "\n" );
			
			if ( size > 0 ) {
				size--;
			}
		}
		else if ( "size".equals( command ) ) {
			sb.append( size ).append( "\n" );
			System.out.println( "size : " + size );
		}
		else if ( "empty".equals( command ) ) {
			int empty = size == 0 ? 1 : 0;
			System.out.println( "empty : " + empty );
			sb.append( empty ).append( "\n" );
		}
		else if ( "top".equals( command ) ) {
			int num;
			if ( size < 1 ) {
				num = -1;
			}
			else {
				num = stackArr[ size - 1 ];
			}
			sb.append( num ).append( "\n" );
			System.out.println( "top : " + num );
		}
		
		System.out.println( "##### size : " + size );
	}
}
