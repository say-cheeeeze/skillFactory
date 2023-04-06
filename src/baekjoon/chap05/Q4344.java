package baekjoon.chap05;

import java.util.Scanner;

/**
 * 
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 
 * 입력 : 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
 * 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 
 * 출력 : 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
 * 
 * 5
 * 5 50 50 70 80 100 => 40.000%
 * 7 100 95 90 80 70 60 50 => 57.143%  
 * 
 * @author cheeeeze
 *
 */
public class Q4344 {

	public static void main( String[] args ) {
		
		// 입력 시작 
		// 1. 먼저 테스트 케이스의 총 개수 C 를 받아야 한다.
		Scanner sc = new Scanner( System.in );
		int caseCount = sc.nextInt();
		
//		System.out.println( " 그래 " + caseCount + "번 테스트 케이스를 한다는거지");
		
		
		// 2. 그 C 만큼 loop
		for( int i = 0; i < caseCount; i++ ) {
			
//			System.out.println("######" + (i+1) + " 번째 케이스 시작 #####");
			
			// 각 index 가 끝날때마다 케이스의 계산 및 출력을 한다.
			int studentCount = sc.nextInt();
			int overAvgCount = 0;
			int[] studentScores = new int[studentCount];
			
			// 각 케이스의 총합
			int totalSum = 0;

			// 3. 각 케이스마다 학생의 숫자와 각 점수를 받는다.( 5 50 50 70 80 100 )
			// 한 케이스가 끝나면 각 케이스안에 있는 N 명의 학생들의 평균을 구한다.
			for ( int j = 0; j < studentCount; j++ ) {
				
				studentScores[j] = sc.nextInt();
//				System.out.println( j + "번째 학생 점수 : " + studentScores[j] );
				
				totalSum += studentScores[j];
//				System.out.println( "현재 토탈 : " + totalSum );
				
			}
			
//			System.out.println( "총합 : " + totalSum );
//			System.out.println( "평균 : " + totalSum/studentScores.length );
			
			for( int k = 0; k < studentScores.length; k++ ) {
			
//				System.out.println( "totalSum/studentScores.length : " + totalSum/studentScores.length );
//				System.out.println( "studentScores : " + studentScores[k] );
				
				if ( studentScores[k] > ( totalSum/studentScores.length ) ) {
					// 현재 학생의 점수가 속한 케이스의 학생들의 점수 평균을 넘은 경우
					overAvgCount++;
//					System.out.println("overAvtCount 늘려달라고 : " + overAvgCount );
					
				}
				
			}
			
//			System.out.println( "##### 현재 케이스에서 학생 평균을 넘은 비율 ####" );
//			System.out.println( "studentCount : " + studentCount );
//			System.out.println( "overAvgCount : " + overAvgCount );
			float ratioOfAvg = (float)overAvgCount/studentCount;
			
//			System.out.println( "float : " + ratioOfAvg );
//			System.out.println( "String format 이용 : " + String.format( "%.3f", ratioOfAvg ) );
			
//			System.out.println( "Math.round 1 : " + Math.round( ratioOfAvg ));
//			System.out.println( "Math.round 2 : " + ( Math.round( ratioOfAvg * 1000 ) / 1000.0 ) + "%");
//			System.out.println( ( Math.round( ratioOfAvg * 1000 ) / 1000.0 ) + "%" );
			System.out.printf( "%.3f%%\n", ratioOfAvg * 100);

		}
		sc.close();
		// 입력 종료

	}
}
