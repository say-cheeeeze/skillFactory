package programmers.beginner;

import java.util.Arrays;

/**
 * 가위바위보
 * 가위는 2 바위는 0 보는 5로 표현합니다.
 * 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
 * rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을
 * return하도록 solution 함수를 완성해보세요.
 * 입출력 예
 * rsp	result
 * "2"	"0"
 * "205"	"052"
 * "2"는 가위이므로 바위를 나타내는 "0"을 return 합니다.
 * "205"는 순서대로 가위, 바위, 보이고 이를 모두 이기려면 바위, 보, 가위를 순서대로 내야하므로 “052”를 return합니다.
 *
 */
public class RockScissorsPaper {
	
	public static void main( String[] args ) {
		
		String rsp = "052";
		
		String answer = solution( rsp );
		System.out.println( answer );
	}
	
	public static String solution( String rsp ) {
		
		StringBuilder sb = new StringBuilder();
		
		String[] rspArr = rsp.split( "" );
		System.out.println( Arrays.toString( rspArr ) );
		for( int i = 0; i < rspArr.length; i++ ) {
			if( "0".equals( rspArr[i] ) ) {
				sb.append( "5" );
			}
			else if ( "2".equals( rspArr[i] ) ) {
				sb.append( "0" );
			}
			else if ( "5".equals( rspArr[i] ) ) {
				sb.append( "2" );
			}
		}
		
		return sb.toString();
	}
}
