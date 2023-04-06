package baekjoon.chap05;

import java.util.Scanner;

/**
 * X대학 M교수님은 프로그래밍 수업을 맡고 있다. 
 * 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
 * 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
 * 
 * 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
 * 
 * @author admin
 *
 */
public class Q5597 {

	public static void main( String[] args ) {
		
		// try1();
		
		
		try2();
	}
	
	public static void try2() {
		
		Scanner sc = new Scanner( System.in );
		
		int[] student = new int[31];
		
		for( int i = 1; i < 29; i++ ) {
			
			int submitted = sc.nextInt();
			student[submitted] = 1;
		}
		
		for( int i = 1; i < student.length; i++ ) {
			
			if ( student[i] == 1 ) {
				System.out.println( i + " : 제출함" );
			}
			else {
				System.out.println( i + " : 제출안함!!!" );
			}
		}
		
		sc.close();
		
	}
	
	public static void try1() {

		
		Scanner sc = new Scanner(System.in);
		
		// 학생 수는 총 30명이다.
		int[] student = new int[31];
		
		for(int i=1; i<29; i++) {
			int success = sc.nextInt();
			student[success] = 1;
		}
		for(int i=1; i<student.length; i++) {
			if(student[i]!=1)
				System.out.println(i);
		}
		
		
		sc.close();
	}
}
