package baekjoon.step11_stack.q9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q9012 {
	
	public static void main( String[] args ) throws IOException {
		
		// 맞긴한데 어차피 괄호는 한 종류이고 잔여 요소 유무만 확인하면 되는데
		// 수정해보자!!!!!!
		//맞았습니다!!	14908	148
		test1();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void test1() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		//		int T = Integer.parseInt( br.readLine() );
		int T = 6;
		StringTokenizer st;
		for( int i = 0; i < T; i++ ) {
			
			// 입력받으면 바로 출력한다.
			//			String strPS = br.readLine();
			String strPS = "";
			if ( i == 0 ) {
				strPS = "(())())";
			}
			else if ( i == 1 ) {
				strPS = "(((()())()";
			}
			else if ( i == 2 ) {
				strPS = "(()())((()))";
			}
			else if ( i == 3 ) {
				strPS = "((()()(()))(((())))()";
			}
			else if ( i == 4 ) {
				strPS = "()()()()(()()())()";
			}
			else if ( i == 5 ) {
				strPS = "(()((())()(";
			}
			
			String[] psArr = strPS.split( "" );
			
			boolean isVPS = checkVPS( psArr );
			
			if ( isVPS ) {
				System.out.println( "YES" );
			}
			else {
				System.out.println( "NO" );
			}
		}
	}
	
	public static boolean checkVPS( String[] psArr ) {
		
		int stackSize = 0;
		int leftPS = 0; // "(" 의 개수
		int rightPS = 0; // ")" 의 개수
		//(())()) => fail
		
		for ( String str : psArr ) {
//			System.out.println( "########=> " + str );
			if ( str.equals( "(" ) ) {
				stackSize++;
				leftPS++;
			}
			else {
				// stack 에 지워질 쌍 "(" 이게 있는지 확인
				if ( leftPS > 0 ) {
					leftPS--;
					stackSize--;
				}
				else {
					rightPS++;
				}
			}
		}
		if( Arrays.toString( psArr ).equals( "[(, (, ), ), (, ), )]" ) ) {
			
			System.out.println( "leftPS : " + leftPS );
			System.out.println( "stackSize : " + stackSize );
		}
		return stackSize == 0 && leftPS == 0 && rightPS == 0;
	}
}
