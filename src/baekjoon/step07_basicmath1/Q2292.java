package baekjoon.step07_basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3(2).png
 * 위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 
 * 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 
 * 1씩 증가하는 번호를 주소로 매길 수 있다. 
 * 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 
 * 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
 * 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
 * 
 * 입력13 출력 3
 * 
 * @author admin
 *
 */
public class Q2292 {

	public static void main(String[] args) throws IOException {
		
		/**
		 * 1번방부터 n 번방까지 가는데 지나는 방의 개수
		 *
		 * 벌집 번호 구간 / 벌집 개수 / 1부터 거기까지 갈 때 지나는 방 개수
		 * 2~7 ( = 6 * 1 + 1 ) / 6 / 2
		 * 8~19 ( = 6 * 3 + 1 ) 12 / 3
		 * 20~37 ( = 6 * 6 + 1 ) 18 / 4
		 * 38~61 ( = 6 * 10 + 1 ) 24 / 5
		 * 
		 * N번방을 갈 때 지나는 방 개수
		 * 
		 */
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		// 방 번호
		int rNo = Integer.parseInt( br.readLine() );
		
		// 몇 개를 거치는가, 최소루트
		int count = 0;
		
		int range = 2;
		
		if ( rNo == 1 ) {
			count = 1;
		}
		else {
			
			while( range <= rNo ) {
				range = range + ( 6 * count );
				count++;
			}
		}
		System.out.println( count );
	}

}
