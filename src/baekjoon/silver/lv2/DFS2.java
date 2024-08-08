package baekjoon.silver.lv2;

import java.util.Arrays;

/**
 * 재귀함수 이해 - 피보나치 수열
 *
 * 자연수 n 이 주어질 때
 * n 개까지의 자연수의 합을 나타내는 피보나치 수열을 출력하기
 * 첫째항과 둘째항은 1이다.
 * n = 10
 * sum = 1,1,2,3,5,8,13,21,34,55
 */
public class DFS2 {
	static int numCnt = 10;
	static int[] arr = new int[numCnt];
	public static int DFS(int n) {
		System.out.println( n );
		if (arr[n] > 0) {
			return arr[n];
		}
		if (n == 0) {
			return arr[0] = 1;
		} else if (n == 1) {
			return arr[1] = 1;
		} else {
			return arr[n] = DFS(n - 1) + DFS(n - 2);
		}
	}
	public static void main(String[] args) {
		DFS(numCnt-1);
		System.out.println( Arrays.toString( arr ) );
	}
}
