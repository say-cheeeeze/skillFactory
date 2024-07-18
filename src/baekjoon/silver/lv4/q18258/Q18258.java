package baekjoon.silver.lv4.q18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18258 {
	
	public static void main( String[] args ) throws IOException {
		
		//		test1(); // 시간초과
		
		//		asdfasdf();
		
		두번째();
		
	}
	
	private static void 두번째() throws IOException {
		
		Queue<Integer> q = new LinkedList<>();
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt( br.readLine() );
		int last = -1;
		
		while ( N-- > 0 ) {
			StringTokenizer st = new StringTokenizer( br.readLine(), " " );
			String command = st.nextToken();
			
			if ( command.equals( "push" ) ) {
				last = Integer.parseInt( st.nextToken() );
				q.offer( last );
			}
			else if ( command.equals( "pop" ) ) {
				if ( q.size() == 0 ) {
					sb.append( "-1" ).append( "\n" );
				}
				else {
					sb.append( q.poll() ).append( "\n" );
				}
			}
			else if ( command.equals( "size" ) ) {
				sb.append( q.size() ).append( "\n" );
			}
			else if ( command.equals( "empty" ) ) {
				if ( q.size() == 0 ) {
					sb.append( "1" ).append( "\n" );
				}
				else {
					sb.append( "0" ).append( "\n" );
				}
			}
			else if ( command.equals( "front" ) ) {
				if ( q.size() == 0 ) {
					sb.append( "-1" ).append( "\n" );
				}
				else {
					sb.append( q.peek() ).append( "\n" );
				}
			}
			else if ( command.equals( "back" ) ) {
				if ( q.size() == 0 ) {
					sb.append( "-1" ).append( "\n" );
				}
				else {
					sb.append( last ).append( "\n" );
				}
			}
		}
		System.out.println( sb );
	}
	
	public static void asdfasdf() {
		
		Queue<Integer> q = new LinkedList<>();
		q.add( 5 );
		Integer element = q.peek();
		System.out.println( "element = " + element );
		System.out.println( element == null );
		
	}
	
	public static void test1() throws IOException {
		
		Queue<Integer> q = new LinkedList<>();
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int N = Integer.parseInt( br.readLine() );
		int last = -1;
		for ( int i = 0; i < N; i++ ) {
			
			String inputStr = br.readLine();
			String[] arrStr = inputStr.split( " " );
			String command = arrStr[ 0 ];
			
			switch ( command ) {
				case "push":
					last = Integer.parseInt( arrStr[ 1 ] );
					q.offer( last );
					break;
				case "pop":
					Integer poll = q.poll();
					if ( q.size() == 0 ) {
						last = -1;
					}
					if ( poll == null ) {
						System.out.println( "-1" );
					}
					else {
						System.out.println( poll );
					}
					break;
				case "size":
					System.out.println( q.size() );
					break;
				case "empty":
					if ( q.size() == 0 ) {
						System.out.println( "1" );
					}
					else {
						System.out.println( "0" );
					}
					break;
				case "front":
					Integer peek = q.peek();
					if ( peek == null ) {
						System.out.println( "-1" );
					}
					else {
						System.out.println( peek );
					}
					break;
				case "back":
					if ( last == -1 ) {
						System.out.println( "-1" );
					}
					else {
						System.out.println( last );
					}
					break;
				default:
					break;
			}
		}
	}
	
}
