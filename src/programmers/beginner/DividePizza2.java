package programmers.beginner;

public class DividePizza2 {
	
	/**
	 * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
	 * 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
	 * n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를
	 * return 하도록 solution 함수를 완성해보세요.
	 * 입출력 예
	 * slice	n	result
	 * 7	   10	  2
	 * 4	   12	  3
	 */
	public static void main( String[] args ) {
		
		solution( 3, 8 );
	
	}
	public static int solution(int slice, int n) {
		
		// 피자를 slice 3조각으로 나눈다.
		// 사람은 5명이다.
		
		// 각자 최소 1조각씩 먹으려면 피자가 몇판있어야 하는가
		int pizzaCnt = 1;
		while ( ( pizzaCnt * slice ) / n <= 0 ) {
			System.out.println( "지금 " + pizzaCnt + "판인데 모자라요.." );
			pizzaCnt++;
			System.out.println( "pizza 하나 추가 >>" + pizzaCnt );
		}
		
		System.out.println( "피자는 지금 몇판이야 : " + pizzaCnt );
		System.out.println( "각자 " + (pizzaCnt * slice) / n + "이만큼 먹을 수 있어요.");
		return pizzaCnt;
	}
}
