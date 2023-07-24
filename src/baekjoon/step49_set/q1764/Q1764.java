package baekjoon.step49_set.q1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1764 {
	
	public static void main( String[] args ) throws IOException {
		
		// test1();
		
		// test2(); // 맞았습니다!!	25848kb 348ms
		
		// 듣보잡 자료형을 TreeSet 말고 ArrayList 로 바꿔봤는데 큰 차이 없다.
		test3(); // 맞았습니다!!	25704kb	352ms
		
	}
	
	/**
	 *
	 * @throws IOException
	 */
	public static void test3() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		String input1 = br.readLine();
		StringTokenizer st = new StringTokenizer( input1 );
		int N = Integer.parseInt( st.nextToken() );
		int M = Integer.parseInt( st.nextToken() );
		
		// 듣도 못한 사람 set
		TreeSet<String> setUnheard = new TreeSet<>();
		
		// 듣도보도 못한 사람
		List<String> setUnheardSeen = new ArrayList<>();
		
		for ( int i = 0; i < N; i++ ) {
			String username = br.readLine();
			setUnheard.add( username );
		}
		
		for ( int i = 0; i < M; i++ ) {
			
			String username = br.readLine();
			
			if ( setUnheard.contains( username ) ) {
				setUnheardSeen.add( username );
			}
		}
		Collections.sort( setUnheardSeen );
		
		for ( String name : setUnheardSeen ) {
			sb.append( name ).append( "\n" );
		}
		
		System.out.println( setUnheardSeen.size() );
		System.out.println( sb );
	}
	
	public static void test2() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		String input1 = br.readLine();
		StringTokenizer st = new StringTokenizer( input1 );
		int N = Integer.parseInt( st.nextToken() );
		int M = Integer.parseInt( st.nextToken() );
		
		// 듣도 못한 사람 set
		TreeSet<String> setUnheard = new TreeSet<>();
		
		// 듣도보도 못한 사람 set
		TreeSet<String> setUnheardSeen = new TreeSet<>();
		
		for ( int i = 0; i < N; i++ ) {
			String username = br.readLine();
			setUnheard.add( username );
		}
		
		for ( int i = 0; i < M; i++ ) {
			
			String username = br.readLine();
			
			if ( setUnheard.contains( username ) ) {
				setUnheardSeen.add( username );
			}
		}
		
		for ( String name : setUnheardSeen ) {
			sb.append( name ).append( "\n" );
		}
		
		System.out.println( setUnheardSeen.size() );
		System.out.println( sb );
	}
	public static void test1() throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		/*
		String input1 = br.readLine();
		StringTokenizer st = new StringTokenizer( input1 );
		int N = Integer.parseInt( st.nextToken() );
		int M = Integer.parseInt( st.nextToken() );
		*/
		
		int N = 3;
		int M = 4;
		
		// 듣도 못한 사람 set
		TreeSet<String> setUnheard = new TreeSet<>();
		
		// 듣도보도 못한 사람 set
		TreeSet<String> setUnheardSeen = new TreeSet<>();
		
		/*
		for ( int i = 0; i < N; i++ ) {
			String username = br.readLine();
			arrUnheard[ i ] = username;
			
			setUnheard.add( username );
		}
		*/
		setUnheard.add( "ohhenrie" );
		setUnheard.add( "charlie" );
		setUnheard.add( "baesangwook" );
		
		StringBuilder sb = new StringBuilder();
		
		for ( int i = 0; i < M; i++ ) {
			
			String username = br.readLine();
			
			if ( setUnheard.contains( username ) ) {
				setUnheardSeen.add( username );
			}
		}
		
		System.out.println( setUnheardSeen.size() );
		for ( String name : setUnheardSeen ) {
			sb.append( name ).append( "\n" );
		}
		System.out.println( sb );
	}
}
