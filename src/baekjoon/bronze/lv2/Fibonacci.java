package baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	256 MB	113261	68897	58087	61.250%
 *
 * 문제
 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
 * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
 *
 * 출력
 * 첫째 줄에 n번째 피보나치 수를 출력한다.
 *
 * 예제 입력 1
 * 10
 * 예제 출력 1
 * 55
 */
public class Fibonacci {
	
	public static void main( String[] args ) throws IOException {
		// F(n) = F(n-1) + F(n-2)
		// F(0) 은 0 이다.
		// F(1) 은 1 이다.
		// F(2) = F(0) + F(1) = 0 + 1 = 1 이다.
		// F(3) = F(1) + F(2) = 1 + 1 = 2 이다.
		// 주어지는 수는 n 이고 F(n) 의 값을 구하시오
//		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
//		String s = br.readLine();
		int n = 5;
		
	}
}
