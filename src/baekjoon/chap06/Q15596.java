package baekjoon.chap06;

/**
 * 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 * Java: long sum(int[] a); (클래스 이름: Test)

 * 
 * @author cheeeeze
 *
 */
public class Q15596 {
	
	long sum( int[] a ) {
		
		long result = 0;
		for( int i = 0; i < a.length; i++ ) {
			
			result += a[i];
		}
		return result;
	}
	
}
