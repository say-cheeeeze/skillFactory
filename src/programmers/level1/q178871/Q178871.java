package programmers.level1.q178871;

import java.util.*;
import java.util.stream.Collectors;

public class Q178871 {
	
	public static void main( String[] args ) {
		
//		mapToArray();
//		mapToList();
//		mapToSet();

		String[] players = new String[] { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = new String[] { "kai", "kai", "mine", "mine" };
		String[] test = solution( players, callings );
		
		
		// 제출 // 출력크기 초과
		String[] result = submitSolution( players, callings );
		
		
	}
	public static String[] submitSolution( String[] players, String[] callings ) {
		
		// 마지막에 map 이 정리된 후 값을 채워 반환함
		String[] answer = new String[ players.length ];
		
		// 전체 선수의 정보를 map 으로 가지고 있자.
		// 선수 A 가 추월하면 A 의 인덱스는 -1 되고 추월당한 선수는 +1 된다.
		Map<String, Integer> mapByName = new HashMap<>();
		Map<Integer, String> mapByRank = new HashMap<>();
		
		for ( int i = 0; i < players.length; i++ ) {
			mapByName.put( players[ i ], i );
			mapByRank.put( i, players[ i ] );
		}
		
		// 추월이 이루어진다.
		for ( int i = 0; i < callings.length; i++ ) {
			
			// 1. mapByName
			// 이름,등수 -> 추월한 사람 등수를 -1 하고, 추월당한 사람의 등수를 +1
			String outRunner = callings[ i ]; // 추월한 선수
			int originRank = mapByName.get( outRunner );
			String overTakenRunner = mapByRank.get( originRank - 1 ); // 추월당한 선수
			
			mapByName.put( outRunner, originRank - 1 ); // 추월한 선수의 등수 재조정
			mapByName.put( overTakenRunner, originRank ); // 추월당한 선수 등수 재조정
			
			// 2. mapByRank
			// 등수,이름 -> 등수에 대해 이름을 매핑하고 있는데, 추월한 사람의 등수가 추월당한 사람의 등수가 된다.
			// 등수 -1 인 key 의 value 를 추월한 선수가 되고
			mapByRank.put( originRank - 1, outRunner );
			// 추월당한 선수는 곧 추월한 선수의 기존 등수가 된다.
			mapByRank.put( originRank, overTakenRunner );
			
			
		}
		System.out.println( "mapByRank = " + mapByRank );
		
		answer = mapByRank.values().toArray( new String[ 0 ] );
		System.out.println( "answer = " + Arrays.toString( answer ) );
		
		return answer;
	}
	
	public static String[] solution( String[] players, String[] callings ) {
		
		// 마지막에 map 이 정리된 후 값을 채워 반환함
		String[] answer = new String[ players.length ];
		
		// 전체 선수의 정보를 map 으로 가지고 있자.
		// 선수 A 가 추월하면 A 의 인덱스는 -1 되고 추월당한 선수는 +1 된다.
		Map<String, Integer> mapByName = new HashMap<>();
		Map<Integer, String> mapByRank = new HashMap<>();
		
		for ( int i = 0; i < players.length; i++ ) {
			mapByName.put( players[ i ], i );
			mapByRank.put( i, players[ i ] );
		}
		System.out.println( "players = " + Arrays.deepToString( players ) );
		
		
		// player : "mumu", "soe", "poe", "kai", "mine"
		// cal : "kai", "kai", "mine", "mine"
		
		// 추월이 이루어진다.
		for ( int i = 0; i < callings.length; i++ ) {
			// 1. kai 가 불린다.
			
			// 2. mapByName : 이름,등수 -> kai 의 등수를 -1 하고,
			// kai 앞 사람의 등수를 +1 한다.
			String outRunner = callings[ i ]; // 추월한 선수
			int originRank = mapByName.get( outRunner );
			System.out.println( originRank + "번째였던 " + outRunner + "선수가 추월했습니다!!!!!!!!!!" );
			
			String overTakenRunner = mapByRank.get( originRank - 1 ); // 추월당한 선수
			
			mapByName.put( outRunner, originRank - 1 ); // 추월한 선수의 등수 재조정
			mapByName.put( overTakenRunner, originRank ); // 추월당한 선수 등수 재조정
			System.out.println( "추월당한 선수 ==> " + overTakenRunner + " 등수 : " + originRank );
			
			// 3. mapByRank : 등수,이름 -> 기존 kai 등수에 맞는 value 를 kai 앞사람으로 변경한다.
			// kai 기존 등수 -1 인 key 의 value 를 kai 로 한다.
			mapByRank.put( originRank - 1, outRunner );
			mapByRank.put( originRank, overTakenRunner );
			
			
		}
		System.out.println( "mapByRank = " + mapByRank );
		
		String[] array1 = mapByRank.values().toArray( new String[ 0 ] );
		System.out.println( "array1 = " + Arrays.toString( array1 ) );
		
		return answer;
	}
	
	public static void mapToArray() {
		
		Map<String, String> map = new HashMap<>();
		map.put( "key1", "value1" );
		map.put( "key2", "value2" );
		map.put( "key3", "value3" );
		Collection<String> collection = map.values();
		String[] array = collection.toArray( new String[ 0 ] );
		
		System.out.println( "array = " + Arrays.deepToString( array ) );
		
	}
	
	public static void mapToList() {
		
		Map<String, String> map = new HashMap<>();
		map.put( "key1", "value1" );
		map.put( "key2", "value2" );
		map.put( "key3", "value3" );
		Collection<String> collection = map.values();
		
		// 1. new ArrayList<>() 생성자 이용
		List<String> strList = new ArrayList<>( collection );
		
		System.out.println( "strList = " + strList );
		
		// 2. Collection.stream().toList()
		List<String> strList2 = collection.stream().toList();
		System.out.println( "strList2 = " + strList2 );
	}
	
	public static void mapToSet() {
		
		Map<String, String> map = new HashMap<>();
		map.put( "key1", "value1" );
		map.put( "key2", "value2" );
		map.put( "key3", "value3" );
		
		Collection<String> values = map.values();
		
		Set<String> set = new HashSet<>( values );
		
		// Output : set = [value2, value1, value3]
		System.out.println( "set = " + set );
		
	}
}
