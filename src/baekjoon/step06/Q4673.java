package baekjoon.step06;

/**
 * 셀프 넘버 
 * 
 * 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 
 * 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 
 * 예를 들어, d(75) = 75+7+5 = 87이다.
 * 
 * 양의 정수 n이 주어졌을 때, 
 * 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다. 
 * 예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 
 * 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 
 * 이런식으로 다음과 같은 수열을 만들 수 있다.
 * 
 * 33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
 * 
 * n을 d(n)의 생성자라고 한다. 
 * 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 
 * 생성자가 한 개보다 많은 경우도 있다. 
 * 예를 들어, 101은 생성자가 2개(91과 100) 있다. 
 * 
 * 생성자가 없는 숫자를 셀프 넘버라고 한다. 
 * 100보다 작은 셀프 넘버는 총 13개가 있다. 
 * 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
 * 
 * 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 
 * 
 * @author cheeeeze
 *
 */
public class Q4673 {
	
	public static void main( String[] args ) {
		
		// 1 ~ 10000 까지 정수를 루프 돌면서 셀프넘버인지 아닌지 알아보자.
		// 1 부터 10000 까지 함수를 통해 만들어진 숫자가 있으면 그 인덱스에 true 를 저장한다.
		boolean[] checkSelfNumber = new boolean[ 10000 ];
		for( int i = 1; i < checkSelfNumber.length; i++ ) {
			
			int num = sumDigit( i );
//			System.out.println( i + " => " + num );
			
			if ( num < checkSelfNumber.length ) { // 결과값이 10000 미만의 정수인 경우에만 저장한다.
				checkSelfNumber[ num ] = true;
			}
		}
		
		for( int i = 1; i < checkSelfNumber.length; i++ ) {
			if ( !checkSelfNumber[i] ) {
//				System.out.println( i + "번째 값 => : " + checkSelfNumber[i] );
				System.out.println( i );
			}
		}
		
	}
	
	
	// 각 자리수를 더하는 함수
	public static int sumDigit( int num ) {
		
		// int n 이 주어졌을 때 이 정수에 대한 생성자가 있는지 없는지 확인하자.
		
		// int n = 33 이 주어진다면 다음 수는 33+3+3=39 이고, 
		// 그 다음 수는 39+3+9=51 이고 그 다음수는 57, ... 이다.
		// 33 은 39의 생성자이고, 39 는 51 의 생성자이고, 51 은 57 의 생성자이다...
		// 생성자가 2개 이상인 경우도 있다.
		// 91 => 91 + 9 + 1 = 101
		// 100 => 100 + 1 + 0 + 0 = 101 로, 101은 생성자가 2개이다. (91,100)
		
		// 생성자가 없는 경우를 알려면?
		// 정수 101 이 생성자가 몇개인지 알려면?
		// 10000 보다 작거나 같은 셀프넘버를 한 줄에 하나씩 출력하려면?
		// 1 부터 10000 까지 숫자 중에 셀프넘버인지 아닌지를 알아야한다.
		int sum = 0;
		sum += num;
//		System.out.print( num + " 에 대한 다음 수 : ");
		while( num != 0 ) {
			sum += ( num % 10 );
			
//			System.out.println( " + " + num % 10 );
			
			num /= 10;
			
		}
//		System.out.println( sum );
		return sum;
	}

}
