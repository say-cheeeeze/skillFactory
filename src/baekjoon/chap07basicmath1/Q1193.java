package baekjoon.chap07basicmath1;

import java.util.Scanner;

/**
 * 분수 찾기
 * 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
		
		1/1	1/2	1/3	1/4	1/5	…
		2/1	2/2	2/3	2/4	…	…
		3/1	3/2	3/3	…	…	…
		4/1	4/2	…	…	…	…
		5/1	…	…	…	…	…
		…	…	…	…	…	…
		
이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 
차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

[1][2,3][4,5,6][7,8,9,10]
 * 입력 : 출력
 * 1 : 1/1
 * 2 : 1/2
 * 3 : 2/1
 * 4 : 3/1
 * 5 : 2/2
 * 6 : 1/3
 * 7 : 1/4
 * 8 : 2/3
 * 9 : 3/2
 * 10 : 4/1
 * 11 : 5/1
 * 14 : 2/4
 * 
 * 
 * @author admin
 *
 */
public class Q1193 {

	public static void main(String[] args) {
		/**
		 * 1. 지그재그 그룹 n번째의 분수 개수는 n 개이다.
		 * 2. 지그재그 그룹 n번째의 분수 규칙은
		 * n이 홀수이면 위에서 아래로, 즉 분모가 1에서 증가하고, 분자는 감소한다.
		 * n이 짝수이면 아래에서 위로, 즉 분모는 감소하고, 분자는 1부터 증가한다.
		 * 3. 지그재그 그룹 n번째 내의 분모+분자의 합은 n+1 이다.
		 */
 
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
 
		// 대각선 개수
		int cross_count = 1;
		// 직전 대각선 누적합
		int	prev_count_sum = 0;
 
		while (true) {
        
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// 대각선상의 블럭의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
		
		in.close();
	}
	
}
