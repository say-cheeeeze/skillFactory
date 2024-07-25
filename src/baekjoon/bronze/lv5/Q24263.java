package baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알고리즘 수업 - 알고리즘의 수행 시간 2
 *
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	512 MB	17208	13588	13026	79.616%
 * 문제
 * 오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
 *
 * 입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
 *
 * MenOfPassion 알고리즘은 다음과 같다.
 *
 * MenOfPassion(A[], n) {
 *     sum <- 0;
 *     for i <- 1 to n
 *         sum <- sum + A[i]; # 코드1
 *     return sum;
 * }
 * 입력
 * 첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.
 *
 * 출력
 * 첫째 줄에 코드1 의 수행 횟수를 출력한다.
 *
 * 둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
 */
public class Q24263 {

	public static void main( String[] args ) throws IOException {
		
		/**
		 * menOfPassion메서드는
		 * sum = 0;
		 * for( int i = 1; i <= n; n++ ) {
		 * 	sum = sum + A[i]; # 코드1
		 * }
		 * return sum;
		 * 즉 1부터 n까지 합.
		 * 위 #코드1 의 수행횟수는 n이다.
		 */
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		System.out.println(n);
		System.out.println(0);
		
	}
}