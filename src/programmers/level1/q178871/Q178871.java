package programmers.level1.q178871;

import java.util.HashMap;
import java.util.Map;

public class Q178871 {
	
	public static void main( String[] args ) {
		
		String[] players = { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = { "kai", "kai", "mine", "mine" };
		
		String[] solution = solution( players, callings );
		
	}
	
	public static String[] solution( String[] players, String[] callings ) {
		String[] answer = {};
		Map<String, Integer> mapByPlayerName = new HashMap<>();
		Map<Integer, String> mapByRank = new HashMap<>();
		
		for ( int i = 0; i < players.length; i++ ) {
			mapByRank.put( i, players[i] );
			mapByPlayerName.put( players[i], i );
		}
		
		System.out.println( "mapByRank = " + mapByRank );
		System.out.println( "mapByPlayerName = " + mapByPlayerName );
		
		for( int i = 0; i < callings.length; i++ ) {
			System.out.println( "##########################################");
			String overTaker = callings[i];
			System.out.println( overTaker + "선수가 추월합니다!");
			
			// 추월한 선수 처리
			int rank = mapByPlayerName.get( overTaker );
			System.out.println( "기존 등수 : " + rank + "(-1) =>" + ( rank - 1 ) );
			mapByPlayerName.put( overTaker, rank - 1 );
			
			// 추월당한 선수 처리
			String overTakenPlayer = mapByRank.get( rank );
			System.out.println( "추월당한 선수  = " + overTakenPlayer );
			mapByRank.put( rank, overTaker );
			mapByPlayerName.put( overTakenPlayer, rank );
			mapByRank.put( rank-1, overTaker );
		}
		
		
		return answer;
	}
}
