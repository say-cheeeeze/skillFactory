package baekjoon.step06_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 단어의 개수 N이 들어온다. 
 * N은 100보다 작거나 같은 자연수이다. 
 * 둘째 줄부터 N개의 줄에 단어가 들어온다. 
 * 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 * 
 * 출력 : 첫째 줄에 그룹 단어의 개수를 출력한다.
 * 
 * 3
 * happy
 * new
 * year
 * => 3
 * 
 * 4
 * aba
 * abab
 * abcabc
 * a
 * => 1
 * 
 * @author admin
 *
 */
public class Q1316 {

	public static void main(String[] args) throws IOException {
		
		첫번째방법();
		
	}
	
	private static void 첫번째방법() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		int caseCount = Integer.parseInt( st.nextToken() );
		int groupWordCnt = 0;
		System.out.println ( "caseCount : " + caseCount );
		
		String[] inputStrArr = new String[ caseCount ];
		for( int i = 0; i < caseCount; i++ ) {
			inputStrArr[i] = br.readLine();
			if ( isGroupWord( inputStrArr[i] ) ) {
				groupWordCnt++;
			}
		}
		
		
		// 그룹단어인가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
		System.out.println( groupWordCnt );
		br.close();
	}
	
	/**
	 * 문자열 String 이 그룹단어이면 true 를 반환
	 * @param inputStr
	 * @return
	 */
	private static boolean isGroupWord( String inputStr ) {
		
		System.out.println( "########### inputStr 은 groupWord 인가 : " + inputStr );
		// aabbcc 는 그룹단어이다
		// a 도 그룹단어
		// aabbaa 는 떨어져서 a 가 또 나오기 때문에 그룹단어가 아니다.
		// 각 문자가 연속해서 나타나는 경우에만 그룹단어이다.
		// 이미 나온 문자가 다른 문자가 나온 이후에 또 등장하면 false 이다.
		
		// 문자가 1개인 경우는 그룹단어임.
		if ( inputStr.length() == 1 ) {
			return true;
		}
		String checkStr = "";
		for( int i = 0; i < inputStr.length(); i++ ) {
			
			char c1 = inputStr.toCharArray()[i];
			System.out.print( c1 + ", " );
			// 현재 index 의 문자가 앞문자와 같은 문자라면 다음을 진행한다.
			// 현재 index 의 문자가 앞문자와 다르다면  배열에 현재 문자가 있는지
			// 확인하고 있으면 false 반환 / 없으면 배열에 담고 true
			// (이전에 등장한 문자가 띄어서 또 등장한것으로 판단)
			if ( !checkStr.contains( String.valueOf( c1 ) ) ) {
				System.out.println( "처음등장한 단어입니다." + c1  );
				System.out.println( "checkStr : " + checkStr );
				checkStr += String.valueOf( c1 );
			}
			else {
				System.out.println( "checkStr : " + checkStr );
				System.out.println( "앞에서 나왔던 단어에요" + c1  );
				// 하지만 직전 단어와 다른 경우만 false
				if ( c1 != inputStr.toCharArray()[i-1]) {
					System.out.println( "직전 단어와 다른 경우만 false" );
					return false;
				}

				System.out.println( "하지만 직전 단어와 같으니까 false 를 반환하지 않는다." + c1  );
				
			}
			
			
		}
		return true;
	}

}
