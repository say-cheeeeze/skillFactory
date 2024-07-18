package baekjoon.silver.lv5.q2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2563 {
	public static void main( String[] args ) throws IOException {
		
		//14152KB	128ms
		solution();
	}
	
	private static void solution() throws IOException {
		
		
		// 도화지의 크기는 생각하지말자.
		
		// n : 색종이의 왼쪽아래모서리 x 좌표
		// m : 색종이의 왼쪽아래모서리 y 좌표
		
		// 색종이의 크기는 가로세로 10 이다.
		// 색종이가 붙여질때
		// x 좌표부터 x + 10 좌표까지
		// y 좌표부터 y + 10 좌표만큼 색칠한다. 체크한다.
		// 최소 x 좌표, 최대 x 좌표, 최소 y 좌표와 최대 y 좌표를 체크한다.
		// 다 붙이면
		// 모든 색종이의 최소 x 좌표부터 최대 x좌표,
		// 최소 y 좌표부터 최대 y 좌표 범위를 체크하여
		// 체크된 것의 범위를 센다.
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int paperCnt = Integer.parseInt( br.readLine() );
		StringTokenizer st;
		int minX = 0;
		int minY = 0;
		boolean[][] attachedArea = new boolean[100][100];
		for( int paper = 0; paper < paperCnt; paper++ ) {
			st = new StringTokenizer( br.readLine() );
			int xStart = Integer.parseInt( st.nextToken() );
			int yStart = Integer.parseInt( st.nextToken() );
			if ( xStart > minX ) {
				minX = xStart;
			}
			if ( yStart > minY ) {
				minY = yStart;
			}
			for( int attachX = xStart; attachX < xStart + 10; attachX++ ) {
				for( int attachY = yStart; attachY < yStart + 10; attachY++ ) {
					attachedArea[attachX][attachY] = true;
				}
			}
		}
		int attachCnt = 0;
		for( int i = 0; i < attachedArea.length; i++ ) {
			for( int j = 0; j < attachedArea[i].length; j++ ) {
				if ( attachedArea[i][j] ) {
					attachCnt++;
				}
			}
		}
		System.out.println( attachCnt );
	}
}
