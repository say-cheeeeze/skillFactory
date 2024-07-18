package baekjoon.bronze.lv3;

/**
 * ACM 호텔 문제
 * 
 * @author admin
 *
 */
public class Q10250 {

	public static void main( String[] args ) {
		
		// 각 층마다 W개의 방이 있는 H 층 건물
		// int W = 12;
		// int H = 5;
		
		// H x W 형태 호텔 ( 층 x 방수 )
		
		// 엘리베이터에서로부터 방은 각 1 씩의 거리가 있다.
		// 엘리베이터로부터 걷는 거리가 짧은 방부터 배정하는 프로그램.
		
		// 손님은 같은 거리라면 아래층을 선호한다.
		// 따라서 아래층부터 채워지는 구조.
		
		// N 번째로 도착한 손님에게 배정될 방 번호를 계산하는 프로그램.
		
		// 입력 : T 개의 테스트 데이터를 먼저 입력받고,
		// H (호텔 층 수), W (각 층의 방 수) , N (몇번째 손님인지 )
		// 를 입력받고 
		
		// 출력 : N 번째 손님이 배정되는 방 번호를 출력. 을 각 테스트 데이터마다 한 행에 출력
		
		// 5층, 각층은 12개방, 1번째 손님의 배정 호수는?
		
		// 각 방의 거리가 기준이다.
		// 10번째 손님까지 배정 호수의 거리는 각각
		int distance = 1; // 점점 증가할 거리
		int hotelW = 12; // 각 호텔 층마다 호수
		int hotelH = 5;
		int wCount = 1; // 호수 카운팅
		
		for( int i = 0; i < 20; i++ ) {
			if ( i == hotelH ) {
				System.out.println( ( i + 1 ) + "호실은 다 찼어요. " );
				wCount = 1;
				distance++;
			}
			int roomNo = ( wCount * 100 ) + distance; 
			System.out.println( ( i + 1 ) + "번째 손님 : " + "( 거리 : " + distance + " ), 호수 : " + roomNo  );

			wCount++;
		}
		
		
		
		
	}
}
