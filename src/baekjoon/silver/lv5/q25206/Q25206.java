package baekjoon.silver.lv5.q25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25206 {
	
	public static void main( String[] args ) throws IOException {
	
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	
		String[] classArr = new String[20];
		
		for( int i = 0; i < classArr.length; i++ ) {
			classArr[i] = br.readLine();
		}
		
		double totalSubject = 0; //과목별 취득점수
		int totalCredit = 0;  // 학점 총합
		
		for( int i = 0; i < classArr.length; i++ ) {
			
			String[] record = classArr[i].split(" ");
			
			if ( "P".equals( record[2] ) ) {
				// P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외한다.
				continue;
			}
			
			// 학점 이름
			String className = record[0];
			
			// 학점
			int credit = (int)Double.parseDouble( record[1] );
			totalCredit += credit;
			
			// 과목등급에 따른 과목평점
			double GPA = getGPA( record[2] );
			totalSubject += ( GPA * credit );
			
			System.out.println( className + "(" + credit + "학점),  과목평점 : " + GPA + " ## 누적 취득 점수 : " + totalSubject );
		}
		// 전공평점을 계산하자.
		// 전공평점 = 전공과목별 ( 학점 x 과목평점 ) 의 합을 학점의 총합으로 나눈 값.
		System.out.println( "학점 총합 : : " + totalCredit );
		System.out.println( "누적 총 평점 : " + totalSubject );
		
		System.out.println( totalSubject / totalCredit);
	}
	
	/**
	 *
	 * 과목평점 Grade Point Average
	 A+	4.5
	 A0	4.0
	 B+	3.5
	 B0	3.0
	 C+	2.5
	 C0	2.0
	 D+	1.5
	 D0	1.0
	 F	0.0
	 * @param grade
	 * @return
	 */
	private static double getGPA( String grade ) {
		double GPA = 0;
		switch ( grade ) {
		case "A+" :
			GPA = 4.5;
			break;
		case "A0" :
			GPA = 4.0;
			break;
		case "B+" :
			GPA = 3.5;
			break;
		case "B0" :
			GPA = 3.0;
			break;
		case "C+" :
			GPA = 2.5;
			break;
		case "C0" :
			GPA = 2.0;
			break;
		case "D+" :
			GPA = 1.5;
			break;
		case "D0" :
			GPA = 1.0;
			break;
		case "F" :
			GPA = 0.0;
			break;
		default :
			break;
		}
		return GPA;
	}
}
