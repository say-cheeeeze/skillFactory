package baekjoon.bronze.lv3;

import java.util.Scanner;

/**
 * KOI 전자에서는 
 * 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 
 * 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 
 * 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
 * 또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 
 * 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
 * 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 
 * 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에는 현재 시각이 나온다. 
 * 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 
 * 빈칸을 사이에 두고 순서대로 주어진다. 
 * 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
 * 14 30
 * 20
 * 
 * 17 40
 * 80 
 * 
 * 23 48
 * 25
 * 
 *  출력 : 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. 
 *  (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 
 *  디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
 *  14 50
 *  
 *  19 0
 *  
 *  0 13
 *  
 * @author cheeeeze
 *
 */
public class Q2525 {
	
	public static void main( String[] args ) {
		
		// 내가한풀이();
		
		다른풀이1();
		
	}
	private static void 내가한풀이() {
		
		// 입력 1. 현재 시각 hh시 mm분 => hh mm (사이에 공백)
		// 입력 2. 요리에 걸리는 분 p
		
		// 출력 1. 종료시각 hh시 mm분 => hh mm (사이에 공백)
		// 단 23시59분에서 1분이 지나면 0시0분이다.
		Scanner sc = new Scanner( System.in );
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cookTime = sc.nextInt();
		System.out.println( "몇시 몇분 : " + hour + "시 " + min + "분" );
		System.out.println( "얼마나 걸려 : " + cookTime + "분");
		
		if ( ( min + cookTime ) / 60  >= 1 ) {
			int plusHour = ( min + cookTime ) / 60;
			hour = hour + plusHour;
			if ( hour >= 24 ) {
				hour = hour - 24;
			}
			
			// 종료시각이 80분이면 20분으로 변환
			// 종료시각이 120분이면 0분으로 변환
			// 60 으로 나눈 나머지 !!
			min = ( min + cookTime ) % 60;
		}
		else {
			min = min + cookTime;
		}
		System.out.println( "언제 끝나냐 : " + hour + "시 " + min + "분" );
		sc.close();
	}
	
	/**
	 * https://yermi.tistory.com/entry/백준BOJ-2525번-오븐-시계-JAVA-자바
	 * 
	 * 백준에서 입력을 한줄로 받으라고 했는데 
	 * 위의 나의 풀이에서는 Scanner 의 System.in 입력으로 한 줄씩 입력받아서 진행해도
	 * 인정해주었다.
	 * 
	 * 이 풀이에서는 백준의 입력 요구 사항대로 첫 입력에 시,분을 공백 하나로 문자열로 받고 
	 * 그것을 정수로 뽑아내어 진행했다.
	 */
	private static void 다른풀이1() {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();

		int spaceIdx = input.indexOf(" ");
		System.out.println( "공백의 index 는 : " + spaceIdx );

		int hour = Integer.parseInt(input.substring(0, spaceIdx));
		int min = Integer.parseInt(input.substring(spaceIdx + 1));
		int cookTime = Integer.parseInt(sc.nextLine());
		
		// 왜 while 로 했을까	
		while ( min + cookTime > 59 ) {
			System.out.println( "60분을 넘겨서 다시 계산합니다......" );
			// hour 처리
			if ( hour == 23 ) {
				hour = 0;
			}
			else {
				hour++;
			}
			
			// 이게 핵심이네.. 60 단위로 잘라주고 while 문 기준이 됨.
			cookTime = cookTime - 60;
		}
		
		System.out.println( hour + " " + ( min + cookTime ) );
		sc.close();
	}
}
