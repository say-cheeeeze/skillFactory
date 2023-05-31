package baekjoon.step07_basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 손익분기점
 * 
 * 월드전자는 노트북을 제조하고 판매하는 회사이다. 
 * 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 
 * 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
 * 예를 들어 A=1,000, B=70이라고 하자. 
 * 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 
 * 열 대 생산하는 데는 총 1,700만원이 든다.
 * 
 * 노트북 가격이 C만원으로 책정되었다고 한다. 
 * 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 
 * 총 비용(=고정비용+가변비용)보다 많아지게 된다. 
 * 
 * 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 
 * 손익분기점(BREAK-EVEN POINT)이라고 한다.
 * 
 * A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다.
 * A, B, C는 21억 이하의 자연수이다.
 * 
 * 출력 : 첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 
 * 손익분기점이 존재하지 않으면 -1을 출력한다.
 * 
 * 1000 70 170 => 11
 * 3 2 1  => -1
 * 2100000000 9 10 => 2100000001
 * 
 * @author admin
 *
 */
public class Q1712 {

	// 생산비용 = 고정비용A + ( 부품1개 생산비 * 개수, 가변비용B )
	// 노트북 가격 C만원
	// 총 수입 = C * 판매 수량
	// 손익분기점 = 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점, 판매량을 지표로 함.
	
	// 고정비용 1000만원 / 가변비용 70만원 / 노트북 170만원 판매 책정가
	// 170만원 * 판매량x < 생산비용(고정비용 1000만원 + (생산비70만 * x대))
	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		
		int fixedCostA = Integer.parseInt( st.nextToken() );
		int variableCostB = Integer.parseInt( st.nextToken() );
		int priceC = Integer.parseInt( st.nextToken() );
		
//		int BREAK_EVEN_POINT = 0;
//		
//		// 10대를 팔았다고 치면 총 수입은? 0
//		int salesRevenue10 = ( priceC * 10 ) - ( fixedCostA + ( variableCostB * 10 ) );
//		
//		// 11대를 팔았다고 치면 총 수입은? 100
//		int salesRevenue11 = ( priceC * 11 ) - ( fixedCostA + ( variableCostB * 11 ) );
//		
//		// 15대를 팔았다고 치면 총 수입은? 500
//		int salesRevenue15 = ( priceC * 15 ) - ( fixedCostA + ( variableCostB * 15 ) );
		

		
		int bep = getBreakEvenPoint( fixedCostA, variableCostB, priceC );
		System.out.println( bep );
		br.close();
	}

	/**
	 * 손익이 0 인 때를 정의하면 손익분기를 만들어낼 판매량(자연수)값을 얻을 수 있다.
	 * price * x = fixedCost + ( variableCost * x );
	 * ( price * x ) - (variableCost * x) = fixedCost;
	 * x ( price - variableCost ) = fixedCost;
	 * x = fixedCost / ( price - variableCost );
	 */
	private static int getBreakEvenPoint( int fixedCostA, int variableCostB, int priceC ) {
		
		try {
			int result = fixedCostA / ( priceC - variableCostB );
			
			System.out.println( " fixedCostA : " + fixedCostA );
			System.out.println( " ( priceC - variableCostB ) : " + ( priceC - variableCostB ) );
			if ( result < 0 ) {
				return -1;
			}
			return ++result;
		}
		catch( ArithmeticException e ) {
			return -1;
		}
	}
}
