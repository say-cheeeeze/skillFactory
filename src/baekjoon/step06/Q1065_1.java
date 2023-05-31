package baekjoon.step06;

import java.util.Scanner;

/**
 * 다른 풀이
 * @author cheeeeze
 *
 */
public class Q1065_1 {

	public static void main( String[] args ) {
		
		Scanner sc = new Scanner( System.in );
		
		int n = sc.nextInt();
		int result = 0;
		
		for( int i = 0; i < n; i++ ) {
			
			if ( solution( i+1 ) ) {
				result++;
			}
		}
		
		sc.close();
	}
	
	private static boolean solution( int num ) {
		
		// num = 789
		int[] arr = new int[ String.valueOf( num ).length() ];
		// new int[3]
		
		if ( arr.length < 3 ) {
			// 두자리 수 까지는 모두 등차수열
			return true;
		}
		
		int i = 0;
		while( num > 0 ) {
			arr[i] = num % 10;
			System.out.print( "\nnum : " + num + " arr[i] : " + arr[i] );
			num /= 10;
			i++;
		}
		
		return false;
	}
}
