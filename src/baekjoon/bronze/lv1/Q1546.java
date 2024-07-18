package baekjoon.bronze.lv1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
 * 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 
 * 이 값을 M이라고 한다. 
 * 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
 * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
 * 둘째 줄에 세준이의 현재 성적이 주어진다. 
 * 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
 * 
 * 출력
 * 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
 * 
 * @author cheeeeze
 *
 */
public class Q1546 {
	
	public static void main( String[] args ) {

		// 새로운 평균을 구하는 메소드 만들기
		// 첫째줄에는 시험 본 과목갯수 n
		// 둘째줄에는 세준이의 현재 과목 성적
		Scanner sc = new Scanner( System.in );
		int exams = sc.nextInt();
		
		if ( exams == 0 ) {
			sc.close();
			return;
		}
		
		double []scores = new double[exams];
		
		for( int i = 0; i < exams; i++ ) {
			scores[i] = sc.nextDouble();
		}
		
		sc.close();
		
//		System.out.println( exams );
		
		// 최고 성적은 Arrays class 의 sort 를 통해 오름차순 정렬을 시킨다.
		Arrays.sort( scores );
		for( int i = 0; i < scores.length; i++ ) {
//			System.out.println( "성적들 (정렬된) : " + scores[i] );		
		}
		double maxScore = scores[scores.length-1];
//		System.out.println( "최대값 : " + maxScore );
		
		// 각 성적은 세준이에 의해 조작된다.
		// 각 조작된 성적을 합계를 구한다. 새로운 평균을 내야함.
		double sum = 0;
		for( int i = 0; i < scores.length; i++ ) {
			sum += (( scores[i] / maxScore ) * 100 );
//			System.out.println("조작된 값 : " + (( scores[i] / maxScore ) * 100) );
		}
//		System.out.println( "합계 : " + sum );
		System.out.println( sum/exams );
		
	}
}
