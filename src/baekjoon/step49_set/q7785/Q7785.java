package baekjoon.step49_set.q7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Q7785 {

	public static void main( String[] args ) throws IOException {
		
		solution1(); // 49160kb	608ms
	}
	
	public static void solution1() throws IOException {

		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
//		int cnt = Integer.parseInt( br.readLine() );
		int cnt = 4;
		StringTokenizer st;
		
		// 문제에서 마지막 출력에 사람들 이름을 사전 순의 역순으로 출력해야한다고 해서 
		// HashMap 대신 TreeMap 으로 변경
		// Map<String, String> workerMap = new HashMap<>(); 
		TreeMap<String, String> workerMap = new TreeMap<>();
		
//		for( int i = 0; i < cnt; i++ ) {
//			
//			st = new StringTokenizer( br.readLine() );
//			String name = st.nextToken();
//			String status = st.nextToken();
//			workerMap.put( name, status );
//		}
		workerMap.put( "Baha", "enter" );
		workerMap.put( "Askar", "enter" );
		workerMap.put( "Carterl", "enter" );
		workerMap.put( "Jordan", "enter" );
		workerMap.put( "Mike", "enter" );
		workerMap.put( "Shaq", "enter" );
		
		NavigableMap<String, String> reversedMap = workerMap.descendingMap();
		
		StringBuilder sb = new StringBuilder();
		// enter 인 사람만 보여주면 된다.
		Set<Entry<String,String>> workerEntry = reversedMap.entrySet();
		
		System.out.println( workerEntry );
		
		for( Entry<String, String> entry : workerEntry ) {
			String status = entry.getValue();
			if ( status.equals( "enter" ) ) {
				sb.append( entry.getKey() + "\n" );
			}
		}
		
		System.out.println( sb );
	}
}
