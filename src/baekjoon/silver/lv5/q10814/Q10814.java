package baekjoon.silver.lv5.q10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q10814 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int memberCnt = Integer.parseInt( br.readLine() );
		
		String[] userList = new String[ memberCnt ];
		
		for( int i = 0; i < userList.length; i++ ) {
			
			userList[i] = br.readLine() + " " + i;
		}
		
		Arrays.sort( userList, new Comparator<String>() {

			public int compare(String o1, String o2) {
				
				String[] left = o1.split( " " );
				String[] right = o2.split( " " );
				int ageL = Integer.parseInt( left[0] );
				int ageR = Integer.parseInt( right[0] );
				int indexL = Integer.parseInt( left[2] );
				int indexR = Integer.parseInt( right[2] );
				if ( ageL > ageR ) {
					return 1;
				}
				else if ( ageL == ageR ) {
					return indexL > indexR ? 1 : -1;
				}
				else {
					return -1;
				}
			};
		} );
		
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0; i < userList.length; i++ ) {
			
			String[] userInfo = userList[i].split( " " );
			
			sb.append( userInfo[0] + " " + userInfo[1] + "\n" );
		}
		System.out.println( sb );
		
	}
}
