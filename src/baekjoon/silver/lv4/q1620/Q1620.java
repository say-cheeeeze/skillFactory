package baekjoon.silver.lv4.q1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Q1620 {

	public static void main( String[] args ) throws IOException {
		
		// test1();
		
		// solution1(); // 시간초과
		
		 test2(); // 맞았습니다!!	60956kb	624ms
	}
	
	/**
	 * 시간 초과
	 * @throws IOException
	 */
	public static void solution1() throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		int pocketCnt = Integer.parseInt( st.nextToken() );
		int questionCnt = Integer.parseInt( st.nextToken() );
		
		Map<String, Integer> PKencyclopedia = new TreeMap<>();
		for( int i = 1; i <= pocketCnt; i++ ) {
			PKencyclopedia.put( br.readLine(), i );
		}
		
		Set<Entry<String, Integer>>pkSet = PKencyclopedia.entrySet();
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0; i < questionCnt; i++ ) {
			
			String input = br.readLine();
			
			try {
				int pkmNum = Integer.parseInt( input );
				for( Entry<String, Integer> entry : pkSet ) {
					if ( entry.getValue() == pkmNum ) {
						sb.append( entry.getKey() + "\n" );
					}
				}
			}
			catch( NumberFormatException e ) {
				sb.append( PKencyclopedia.get( input ) + "\n" );
			}
		}
		
		System.out.println( sb );
	}
	
	/**
	 * 문자열, 숫자를 저장하는 기존 맵을 나중에 2중순회하기보다는
	 * 숫자, 문자열을 초기에 저장하도록 PKencyclopedia2 HashMap 객체를 추가했다.
	 * 그리고 catch 에서 문자열이 숫자가 아닐 경우를 판별하도록 했는데
	 * 그렇지 않고 Character 클래스의 boolean isDigit( char c ) 을 이용해서 판별하도록 수정. 
	 * 
	 * @throws IOException
	 */
	public static void test2() throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		int pocketCnt = Integer.parseInt( st.nextToken() );
		int questionCnt = Integer.parseInt( st.nextToken() );
		
		Map<String, Integer> PKencyclopedia = new HashMap<>();
		Map<Integer, String> PKencyclopedia2 = new HashMap<>();
		
		for( int i = 1; i <= pocketCnt; i++ ) {
			String input = br.readLine();
			PKencyclopedia.put( input, i );
			PKencyclopedia2.put( i, input );
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0; i < questionCnt; i++ ) {
			
			String input = br.readLine();
			
			if ( isNumber( input ) ) {
				sb.append( PKencyclopedia2.get( Integer.parseInt( input ) ) + "\n" );
			}
			else {
				sb.append( PKencyclopedia.get( input ) + "\n" );
			}
		}
		
		System.out.println( sb );
	}
	
	/**
	 * 매개 문자열의 문자마다 검사하여 숫자인 경우 isDigit 은 true 를 반환함.
	 * @param str
	 * @return
	 */
	public static boolean isNumber( String str ) {
		for( int i = 0; i < str.length(); i++ ) {
			
			// 숫자가 아닌게 있다면 return false 
			if ( !Character.isDigit( str.charAt( i ) ) ) {
				return false;
			}
		}
		return true;
	}
	
	public static void test1() throws IOException {

		
		int pocketCnt = 26;
		int questionCnt = 5;
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		Map<String, Integer> PKencyclopedia = new TreeMap<>();
		
		int cnt = 0;
		
		PKencyclopedia.put( "Bulbasaur", ++cnt );
		PKencyclopedia.put( "Ivysaur", ++cnt );
		PKencyclopedia.put( "Venusaur", ++cnt );
		PKencyclopedia.put( "Charmander", ++cnt );
		PKencyclopedia.put( "Charmeleon", ++cnt );
		PKencyclopedia.put( "Charizard", ++cnt );
		PKencyclopedia.put( "Squirtle", ++cnt );
		PKencyclopedia.put( "Wartortle", ++cnt );
		PKencyclopedia.put( "Blastoise", ++cnt );
		PKencyclopedia.put( "Caterpie", ++cnt );
		PKencyclopedia.put( "Metapod", ++cnt );
		PKencyclopedia.put( "Butterfree", ++cnt );
		PKencyclopedia.put( "Weedle", ++cnt );
		PKencyclopedia.put( "Kakuna", ++cnt );
		PKencyclopedia.put( "Beedrill", ++cnt );
		PKencyclopedia.put( "Pidgey", ++cnt );
		PKencyclopedia.put( "Pidgeotto", ++cnt );
		PKencyclopedia.put( "Pidgeot", ++cnt );
		PKencyclopedia.put( "Rattata", ++cnt );
		PKencyclopedia.put( "Raticate", ++cnt );
		PKencyclopedia.put( "Spearow", ++cnt );
		PKencyclopedia.put( "Fearow", ++cnt );
		PKencyclopedia.put( "Ekans", ++cnt );
		PKencyclopedia.put( "Arbok", ++cnt );
		PKencyclopedia.put( "Pikachu", ++cnt );
		PKencyclopedia.put( "Raichu", ++cnt );
		

		System.out.println( "도감######### : " + PKencyclopedia );
		
		Set<Entry<String, Integer>>pkSet = PKencyclopedia.entrySet();
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0; i < questionCnt; i++ ) {
			
			String input = br.readLine();
			
			try {
				int pkmNum = Integer.parseInt( input );
				for( Entry<String, Integer> entry : pkSet ) {
					if ( entry.getValue() == pkmNum ) {
						sb.append( entry.getKey() + "\n" );
					}
				}
			}
			catch( NumberFormatException e ) {
				System.out.println( "숫자가 아닙니당.." );
				sb.append( PKencyclopedia.get( input ) + "\n" );
			}
		}
		
		System.out.println( sb );
	}
}
