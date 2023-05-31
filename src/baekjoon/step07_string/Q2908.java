package baekjoon.step07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
 * 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
 * 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
 * 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
 * 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 
 * 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
 * 
 * 출력 : 상수의 대답을 출력
 * 
 * ex) 
 * 734 893 -> 437
 * 221 231 -> 132
 * 839 237 -> 938 
 * 
 * @author cheeeeze
 *
 */
public class Q2908 {

	public static void main( String[] args ) throws IOException {
		
		첫번째방법();
		
//		두번째방법();
		
	}
	
	/**
	 * Scanner 와 StringBuilder 를 이용
	 * 메모리 : 17692KB	
	 * 시간 : 204ms
	 * 
	 * @throws IOException
	 */
	private static void 첫번째방법() throws IOException {
		
		Scanner sc = new Scanner( System.in );
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		System.out.println( "처음 입력받은 num1 : " + num1 );
		System.out.println( "처음 입력받은 num2 : " + num2 );
		
		num1 = Integer.parseInt( new StringBuilder().append( num1 ).reverse().toString() );
		num2 = Integer.parseInt( new StringBuilder().append( num2 ).reverse().toString() );
		
		System.out.println( "거꾸로 num1 : " + num1 );
		System.out.println( "거꾸로 num2 : " + num2 );
		
		System.out.println( "더 큰 수는 ? : " + ( num1 > num2 ? num1 : num2 ) );
		
		sc.close();
	}
	
	/**
	 * BufferedReader 와 StringTokenizer, StringBuilder 를 이용
	 * 메모리 14272kb
	 * 속도 120ms
	 * 
	 * @throws IOException
	 */
	private static void 두번째방법() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine(), " " );
		
		int num1 = Integer.parseInt( new StringBuilder( st.nextToken() ).reverse().toString() );
		int num2 = Integer.parseInt( new StringBuilder( st.nextToken() ).reverse().toString() );
		
		br.close();
		System.out.println( num1 > num2 ? num1 : num2 );
		
	}
	
	private static void 세번째방법() throws IOException {
		
		int num1 = 789;
		System.out.println( num1 / 100 );
		String strFromInt = String.valueOf( num1 );
		
		char[] charArr = new char[] {'1','2','3' };
		StringBuilder sb = new StringBuilder();
		sb.append( charArr[0] );
		sb.append( charArr[1] );
		sb.append( charArr[2] );
		
		System.out.println( "string builder sb : " + sb );
		
		System.out.println( num1 % 10 );
		
		System.out.println( strFromInt );
	}
}
