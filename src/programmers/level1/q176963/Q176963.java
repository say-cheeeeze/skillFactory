package programmers.level1.q176963;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q176963 {
	
	public static void main( String[] args ) {
		
		// 그리워하는 사람의 이름
		String[] name = { "may", "kein", "kain", "radi" };
		
		// 각 사람별 그리움 점수
		int[] yearning = { 5, 10, 1, 3 };
		
		// 각 사진에 찍힌 인물의 이름
		String[][] photo = {
					{ "may", "kein", "kain", "radi" },
					{ "may", "kein", "brin", "deny" },
					{ "kon", "kain", "may", "coni" }
		};
		
		// 위 경우 19, 15, 6
		int[] solution = solution( name, yearning, photo );
		System.out.println( "solution = " + Arrays.toString( solution ) );
	}
	
	public static int[] solution( String[] name, int[] yearning, String[][] photo ) {
		
		// 그리움 map
		Map<String, Integer> yearningMap = new HashMap<>();
		for ( int i = 0; i < name.length; i++ ) {
			yearningMap.put( name[ i ], yearning[ i ] );
		}
		
		System.out.println( "그리움 Map ( yearningMap ) = " + yearningMap );
		
		// photo 에는 각 사진이 있다.
		int[] answer = new int[ photo.length ];
		
		for ( int picture = 0; picture < photo.length; picture++ ) {
			
			int yearningScore = 0;
			
			System.out.println( "각 photo = " + Arrays.deepToString( photo[ picture ] ) );
			for ( int personIdx = 0; personIdx < photo[ picture ].length; personIdx++ ) {
				
				// 사진속 사람
				String personName = photo[ picture ][ personIdx ];
				if ( yearningMap.containsKey( personName ) ) {
					yearningScore += yearningMap.get( personName );
				}
			}
			
			answer[ picture ] = yearningScore;
		}
		
		return answer;
	}
}
