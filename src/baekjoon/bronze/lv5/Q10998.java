package baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10998 {
	
	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String s = br.readLine();
		int s1 = Integer.parseInt( s.split( " " )[ 0 ] );
		int s2 = Integer.parseInt( s.split( " " )[ 1 ] );
		System.out.println(s1*s2);
		
	}
}
