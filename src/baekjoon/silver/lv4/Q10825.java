package baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * <pre>
 * 국영수
 *
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	256 MB	39624	21527	15709	54.278%
 * 문제
 * 도현이네 반 학생 N명의 이름과 국어, 영어, 수학 점수가 주어진다.
 * 이때, 다음과 같은 조건으로 학생의 성적을 정렬하는 프로그램을 작성하시오.
 *
 * 국어 점수가 감소하는 순서로
 * 국어 점수가 같으면 영어 점수가 증가하는 순서로
 * 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
 * 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로
 * (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
 *
 * 입력
 * 첫째 줄에 도현이네 반의 학생의 수 N (1 ≤ N ≤ 100,000)이 주어진다.
 * 둘째 줄부터 한 줄에 하나씩 각 학생의 이름, 국어, 영어, 수학 점수가 공백으로 구분해 주어진다.
 * 점수는 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
 * 이름은 알파벳 대소문자로 이루어진 문자열이고, 길이는 10자리를 넘지 않는다.
 *
 * 출력
 * 문제에 나와있는 정렬 기준으로 정렬한 후 첫째 줄부터 N개의 줄에 걸쳐 각 학생의 이름을 출력한다.
 *
 * 예제 입력 1
 * 12
 * Junkyu 50 60 100
 * Sangkeun 80 60 50
 * Sunyoung 80 70 100
 * Soong 50 60 90
 * Haebin 50 60 100
 * Kangsoo 60 80 100
 * Donghyuk 80 60 100
 * Sei 70 70 70
 * Wonseob 70 70 90
 * Sanghyun 70 70 80
 * nsj 80 80 80
 * Taewhan 50 60 90
 * 예제 출력 1
 * Donghyuk
 * Sangkeun
 * Sunyoung
 * nsj
 * Wonseob
 * Sanghyun
 * Sei
 * Kangsoo
 * Haebin
 * Junkyu
 * Soong
 * Taewhan
 * </pre>
 */

class Student {
	private String name;
	private int koreaNScore;
	private int mathScore;
	private int englishScore;
	public Student(String name, int koreaNScore, int englishScore, int mathScore) {
		this.name = name;
		this.koreaNScore = koreaNScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKoreaNScore() {
		return koreaNScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	public int getEnglishScore() {
		return englishScore;
	}
	
	@Override public String toString() {
		return "Student{" +
			   "name='" + name + '\'' +
			   ", koreaNScore=" + koreaNScore +
			   ", englishScore=" + englishScore +
			   ", mathScore=" + mathScore +
			   '}' + "\n";
	}
}
public class Q10825 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in) );
//		int N = Integer.parseInt( br.readLine() );
		
		List<Student> students = new ArrayList<Student>();
		StringTokenizer st = null;
		/*
		for( int i = 0; i < N; i++ ) {
			String s = br.readLine();
			st = new StringTokenizer( s );
			String stName = st.nextToken();
			int korScore = Integer.parseInt( st.nextToken() );
			int engScore = Integer.parseInt( st.nextToken() );
			int mathScore = Integer.parseInt( st.nextToken() );
			students.add( new Student( stName, korScore, engScore, mathScore ) );
		}*/
		students.add( new Student( "Junkyu", 50, 60, 100 ) );
		students.add( new Student( "Sangkeun", 80, 60, 50 ) );
		students.add( new Student( "Sunyoung", 80, 70, 100 ) );
		students.add( new Student( "Soong", 50, 60, 90 ) );
		students.add( new Student( "Haebin", 50, 60, 100 ) );
		
		Collections.sort( students, new Comparator<Student>() {
			
			@Override
			public int compare( Student o1, Student o2 ) {
				
				if ( o1.getKoreaNScore() < o2.getKoreaNScore() ) {
					return 1;
				}
				else if ( o1.getKoreaNScore() == o2.getKoreaNScore() ) {
					if ( o1.getEnglishScore() < o2.getEnglishScore() ) {
						return 1;
					}
					else if ( o1.getEnglishScore() == o2.getEnglishScore() ) {
						if ( o1.getMathScore() < o2.getMathScore() ) {
							return 1;
						}
						else if ( o1.getMathScore() == o2.getMathScore() ) {
							if ( o1.getName().compareTo( o2.getName() ) > 0 ) {
								return 1;
							}
							else {
								return -1;
							}
						}
						else {
							return -1;
						}
					}
					else {
						return -1;
					}
				}
				else {
					return -1;
				}
			}
		});
		
		System.out.println( "students = " + students );
	}
}
