package programmers.beginner;

public class DividePizza {
	
	public static void main( String[] args ) {
		
		
		/**
		 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를
		 * 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
		 */
		int n = 15;
		int pizzaCnt = 1;
		// 한사람이 먹을 수 있는 조각 수는 피자 개수 * 7 한 것 나누기 n 명
		int pizzaAllocated = 0;
		
		while ( true ) {
			pizzaAllocated = ( pizzaCnt * 7 ) / n;
			System.out.println( "야 우리  " + n + " 명인데 피자 몇개왔냐 ?? : 어.. " + pizzaCnt + "개.. 그럼 몇개씩 먹을수있냐" );
			System.out.println( pizzaAllocated + "개 먹을수있음ㅋ" );
			
			if ( pizzaAllocated >= 1 ) {
				break;
			}
			System.out.println( "안되겠다 하나 더 시켜봐" );
			pizzaCnt++;
		}
		System.out.println( "그래서 결국 피자 몇개가 왔냐 : " + pizzaCnt );
		
//		return pizzaCnt;
	}
}
