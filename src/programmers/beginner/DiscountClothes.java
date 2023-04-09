package programmers.beginner;

/**
 * 옷가게 할인받기
 * 머쓱이네 옷가게는
 * 10만 원 이상 사면 5%,
 * 30만 원 이상 사면 10%,
 * 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때,
 * 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예
 * price	result
 * 150,000	142,500
 * 580,000	464,000
 *
 */
public class DiscountClothes {
	
	public static void main( String[] args ) {
		
		solution( 1000 );
	
	}
	
	public static void solution( int price ) {
		
		System.out.println( " ##### 자 얼마냐면요 ### : " + price );
		System.out.println( " ##### 근데 깎아드릴게요~~ ###" );
		
		int total = 0;
		
		if ( price >= 100000 && price < 300000 ) {
			System.out.println( "5% 깎아드림" );
			total = (int) ( price - ( price * 0.05 ) );
		}
		else if ( price >= 300000 && price < 500000 ) {
			System.out.println( "10% 깎아드림" );
			total = (int) ( price - ( price * 0.1 ) );
		}
		else if ( price >= 500000 ) {
			System.out.println( "20% 깎아드림" );
			total = (int) ( price - ( price * 0.2 ) );
		}
		else {
			total = price;
		}
		System.out.println( total );
	}
}
