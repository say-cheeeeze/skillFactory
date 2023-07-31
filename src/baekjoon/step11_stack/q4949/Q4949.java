package baekjoon.step11_stack.q4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import org.w3c.dom.ls.LSOutput;

public class Q4949 {
	
	static String[] strArr;
	static String[] stack;
	static int stackSize = 0;
	
	public static void main( String[] args ) throws IOException {
		
		//		test1();
		
		// 틀렸다. 문제를 잘못이해한 부분이 있음.
		// ( 와 [ 도 순서가 엉키면 안된다.
		//		test2();
		
		
		test3(); //맞았습니다!!	44748KB	536ms
		//메모리와 시간이 크게 소요되었다..44MB, 0.5s
		//20MB, 200ms 이하로 줄여보자
		
		
	}
	
	/**
	 * ( [ ) ] -> 안됨
	 */
	public static void test3() throws IOException {
		
		// 소괄호가 열렸으면 그 다음엔 소괄호가 닫혀야한다.
		// 처음에 괄호의 종류를 달리해서 스택을 관리했는데 그 방법이 잘못됐다.
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		//		String inputStr = br.readLine();
		String inputStr = "";
//		inputStr = "( [ ) ]";
//		inputStr = "So when I die (the [first] I will see in (heaven) is a score list).";
//		inputStr = "[ first in ] ( first out ).";
//		inputStr = "Half Moon tonight (At least it is better than no Moon at all].";
//		inputStr = "A rope may form )( a trail in a maze.";
//		inputStr = "Help( I[m being held prisoner in a fortune cookie factory)].";
//		inputStr = "([ (([( [ ] ) ( ) (( ))] )) ]).";
//		inputStr = ".";
		inputStr = "((((";
		
		int test = 0;
		while ( test < 1 ) {
			
			boolean isHarmonized = checkBracket2( inputStr );

			if ( isHarmonized ) {
				System.out.println( "yes" );
			}
			else {
				System.out.println( "no" );
			}
			test++;
		}
	}
	
	public static boolean checkBracket2( String inputStr ) {
		
		strArr = inputStr.split( "" );
		stack = new String[ strArr.length ];
		stackSize = 0;
		
		for( int i = 0; i < strArr.length; i++ ) {
			
			String str = strArr[ i ];
			if ( str.equals( "(" ) ) {
				stack[ stackSize ] = str;
				stackSize++;
			}
			
			if ( str.equals( "[" ) ) {
				stack[ stackSize ] = str;
				stackSize++;
			}
			
			if ( str.equals( ")" ) ) {
				// stack 이 빈 경우 fail
				if ( stackSize < 1 ) {
					return false;
				}
				// 마지막 요소가 "("가 아니라면 fail
				if ( !stack[ stackSize - 1 ].equals( "(" ) ) {
					return false;
				}
				
				// 그것도 아니라면 이제 뺴면 된다.
				stack[ stackSize - 1 ] = "";
				stackSize--;
			}
			
			if ( str.equals( "]" ) ) {
				// stack 이 빈 경우 fail
				if ( stackSize < 1 ) {
					return false;
				}
				// 마지막 요소가 "["가 아니라면 fail
				if ( !stack[ stackSize - 1 ].equals( "[" ) ) {
					return false;
				}
				
				// 그것도 아니라면 이제 뺴면 된다.
				stack[ stackSize - 1 ] = "";
				stackSize--;
			}
		}
		
		System.out.println( "일단 true 를 다 반환하기는 하는데" +
							"\n열린 괄호가 남아있다면??" );
		System.out.println( Arrays.toString( stack ) );
		
		System.out.println( stackSize );
		if ( stackSize == 0 ) {
			return true;
		}
		return false;
	}
	
	public static void test2() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		String inputStr = "";
		
		while ( true ) {
			
			inputStr = br.readLine();
			
			// 프로그램 종료
			if ( inputStr.equals( "." ) ) {
				break;
			}
			boolean isBalanced = checkBalance( inputStr );
			
			if ( isBalanced ) {
				System.out.println( "yes" );
			}
			else {
				System.out.println( "no" );
			}
		}
		
		//		String str = "";
		//		str = "[ first in ] ( first out ).";
		//		str = "([ (([( [ ] ) ( ) (( ))] )) ]).";
		//		str = "So when I die (the [first] I will see in (heaven) is a score list).";
		//		str = "Half Moon tonight (At least it is better than no Moon at all].";
		//		str = "A rope may form )( a trail in a maze.";
		//		str = "Help( I[m being held prisoner in a fortune cookie factory)].";
	}
	
	/**
	 * 매개변수 str 문자열의 괄호 순서쌍의 균형을 검사한다.
	 * () 와 [] 괄호가 순서쌍이 제대로 이루어졌는지 확인하고 균형이 있는 문자열이면
	 * true 를 반환한다.
	 *
	 * 괄호가 하나도 없는 경우 true 를 반환한다.
	 * @param str
	 * @return
	 */
	public static boolean checkBalance( String str ) {
		
		// 문자열에 괄호가 하나도 없는 경우 true 를 반환한다.
		String[] arrStr = str.split( "" );
		int stackMSize = 0;
		String[] stackM = new String[ arrStr.length ];
		int stackLSize = 0;
		String[] stackL = new String[ arrStr.length ];
		
		for ( int i = 0; i < arrStr.length; i++ ) {
			
			String innerStr = arrStr[ i ];
			
			if ( innerStr.trim().equals( "" ) ) {
				continue;
			}
			System.out.print( ">>> " + innerStr );
			
			if ( innerStr.equals( "(" ) ) {
				System.out.print( "\t\t push" );
				// ( 를 push 한다
				stackM[ stackMSize ] = innerStr;
				stackMSize++;
			}
			
			if ( innerStr.equals( "[" ) ) {
				System.out.print( "\t\t push" );
				stackL[ stackLSize ] = innerStr;
				stackLSize++;
			}
			
			if ( innerStr.equals( ")" ) ) {
				System.out.print( "\t\t pop" );
				if ( stackMSize < 1 ) {
					return false;
				}
				if ( stackMSize > 0 ) {
					stackM[ stackMSize - 1 ] = null;
					stackMSize--;
				}
			}
			
			if ( innerStr.equals( "]" ) ) {
				System.out.print( "\t\t pop" );
				if ( stackLSize < 1 ) {
					return false;
				}
				if ( stackLSize > 0 ) {
					stackL[ stackLSize - 1 ] = null;
					stackLSize--;
				}
			}
			
			System.out.println();
		}
		
		System.out.println( "자 검사 끝났습니다. stack 검사할게요" );
		System.out.println( "소괄호 스택 사이즈 : " + stackMSize );
		System.out.println( Arrays.toString( stackM ) );
		
		System.out.println( "대괄호 스택 사이즈 : " + stackLSize );
		System.out.println( Arrays.toString( stackL ) );
		if ( stackMSize == 0 && stackLSize == 0 ) {
			return true;
		}
		return false;
	}
	
	public static void test1() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		String inputStr = "";
		
		while ( true ) {
			
			inputStr = br.readLine();
			
			// 프로그램 종료
			if ( inputStr.equals( "." ) ) {
				break;
			}
			
			// 괄호가 하나도 없는 경우
			if ( !inputStr.contains( "(" ) && !inputStr.contains( ")" )
				 && !inputStr.contains( "[" ) && !inputStr.contains( "]" ) ) {
				System.out.println( "yes" );
				continue;
			}
			
			// 스택 처리 검증
			if ( validStr( inputStr ) ) {
				System.out.println( "yes" );
			}
			else {
				System.out.println( "no" );
			}
		}
	}
	
	public static boolean validStr( String inputStr ) {
		
		System.out.println( "입력 문자 : " + inputStr );
		
		String[] strArr = inputStr.split( "" );
		
		int middleBraceCnt = 0;
		int largBraceCnt = 0;
		for ( int i = 0; i < strArr.length; i++ ) {
			String str = strArr[ i ];
			
			if ( str.equals( "(" ) || str.equals( ")" ) ) {
				middleBraceCnt++;
			}
			
			if ( str.equals( "[" ) || str.equals( "]" ) ) {
				largBraceCnt++;
			}
		}
		System.out.println( middleBraceCnt + "소괄호가 이만큼 있으여!" );
		System.out.println( largBraceCnt + "대괄호가 이만큼 있으여!" );
		
		// 소괄호 관리할 스택
		String[] middleBraceStack = new String[ middleBraceCnt ];
		int sizeM = 0;
		String[] largeBraceStack = new String[ largBraceCnt ];
		int sizeL = 0;
		
		for ( int i = 0; i < strArr.length; i++ ) {
			String brace = strArr[ i ];
			
			if ( !brace.equals( "(" ) && !brace.equals( ")" )
				 && !brace.equals( "[" ) && !brace.equals( "]" ) ) {
				continue;
			}
			
			System.out.println( "무슨 문자야 ::::::: " + brace );
			// 문자열 중 (, ), [, ] 가 들어올 경우마다 체크하는데,
			// ( ) 를 관리할 스택 자료형이 하나 필요.
			// [ ] 를 관리할 스택 자료형이 하나 필요.
			
			if ( brace.equals( "(" ) ) {
				
				// ( 이 들어왔으면 스택에 ( 를 넣는다.
				// 이 전에 뭐가 들어왔는지는 상관없다 일단 넣는다.
				middleBraceStack[ sizeM ] = brace;
				
				sizeM++;
				
				System.out.print( "push >>> stack 의 현재 크기(=다음 index) : " + sizeM );
				System.out.println( "\t\t stack >> " + Arrays.toString( middleBraceStack ) );
			}
			if ( brace.equals( "[" ) ) {
				largeBraceStack[ sizeL ] = brace;
				sizeL++;
				
				System.out.print( "push >>> stack 의 현재 크기(=다음 index) : " + sizeM );
				System.out.println( "\t\t stack >> " + Arrays.toString( largeBraceStack ) );
			}
			
			if ( brace.equals( ")" ) ) {
				if ( sizeM < 1 ) {
					sizeM--;
				}
				// ) 이 온 경우에는, 현재 스택의 마지막 포인터에 ( 가 있어야 한다.
				// 있으면. 그걸 빼고, size 를 줄인다.
				if ( "(".equals( middleBraceStack[ sizeM - 1 ] ) ) {
					middleBraceStack[ sizeM - 1 ] = "";
					
					System.out.print( "pop >>> stack 의 현재 크기(=다음 index) : " + sizeM );
					System.out.println( "\t\t stack >> " + Arrays.toString( middleBraceStack ) );
				}
				// size 는 스택에서 올바르게 쌍이 제거되었지 않아도 -1 연산한다.
				sizeM--;
			}
			
			if ( brace.equals( "]" ) ) {
				if ( "(".equals( largeBraceStack[ sizeL - 1 ] ) ) {
					largeBraceStack[ sizeL - 1 ] = "";
					
					System.out.print( "pop >>> stack 의 현재 크기(=다음 index) : " + sizeL );
					System.out.println( "\t\t stack >> " + Arrays.toString( largeBraceStack ) );
				}
				// size 는 스택에서 올바르게 쌍이 제거되었지 않아도 -1 연산한다.
				sizeL--;
			}
		}
		
		System.out.printf( "##### 종료 , 남은 스택 %d, %d: ", sizeM, sizeL );
		return false;
	}
}
