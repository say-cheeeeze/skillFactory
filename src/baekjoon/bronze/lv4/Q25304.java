package baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 영수증
 * 
 * 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 
 * 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
 *  준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
 *  영수증에 적힌,
 *  구매한 각 물건의 가격과 개수
 *  구매한 물건들의 총 금액
 *  을 보고, 
 *  구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
 *  
 *  첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
 *  둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
 *  이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
 *
 *  출력:구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 
 *  일치하지 않는다면 No를 출력한다.
 *  
 *  260000
 *  4
 *  20000 5
 *  30000 2
 *  10000 6
 *  5000 8
 *  => YES
 *  
 *  250000
 *  4
 *  20000 5
 *  30000 2
 *  10000 6
 *  5000 8
 *  => NO
 *  
 * @author cheeeeze
 *
 */
/**
 * @author cheeeeze
 *
 */
public class Q25304 {
	public static void main( String[] args ) throws IOException {
		
//		myCode();
		
		myCode가NullPointer에러가난다고해서다르게();
	}

	private static void myCode() throws IOException {
		
		Scanner sc = new Scanner( System.in );
		// 영수증에 찍힌 총 금액
		int billingAmount = sc.nextInt();
		
		// 구매한 물건 종류 수
		int numberOfGoods = sc.nextInt();
		
		// 각 물건 가격과 갯수 저장할 배열
		int[][] items = new int[numberOfGoods][2];
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		for( int i = 0; i < numberOfGoods; i++ ) {
			StringTokenizer st = new StringTokenizer( br.readLine() );
			items[i][0] = Integer.parseInt( st.nextToken() );
			items[i][1] = Integer.parseInt( st.nextToken() );
		}
		br.close();
		sc.close();
		
		int total = 0;
		for( int i = 0; i < items.length; i++ ) {
			// System.out.println( ( i + 1 ) + "번째 물건 값, 갯수 : " + items[i][0] + ", " + items[i][1] );
			total += items[i][0] * items[i][1];
			// System.out.println( "계산중..: " + total );
		}
		// System.out.println( total == billingAmount );
		if ( total == billingAmount ) {
			System.out.println( "Yes" );
		}
		else {
			System.out.println( "No" );
		}
		
	}
	
	private static void myCode가NullPointer에러가난다고해서다르게() throws IOException {
		//공백을 통해 값을 받기로 해서 BufferedReader 의 readLine() 과 StringTokenizer 를 활용했는데
		// 그 부분에서 계속 NullPointer 가 발생되는 것 같다.
        Scanner sc = new Scanner( System.in );

        int total =  sc.nextInt();
        int count = sc.nextInt();

        for(int i = 0; i< count; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();

            total = total - (price * num);
        }

        if (total == 0) {
        	System.out.println( "Yes" );	
        }
        else {
        	System.out.println( "No" );
        }
        sc.close();
		
	}
}
