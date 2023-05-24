package programmers.beginner;

/**
 * 개미군단
 *
 * 개미 군단이 사냥을 나가려고 합니다.
 * 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
 * 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
 * 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만,
 * 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
 * 사냥감의 체력 hp가 매개변수로 주어질 때,
 * 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면
 * 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
 */
public class AntArmy {
	
	public static void main( String[] args ) {
	
		// 장군개미 5
		// 병정개미 3
		// 일개미 1
		
		// 사냥감 체력 hp
		// 딱 맞게 최소한이 병력 구성 몇마리의 개미가 필요
		
		// 최대공약수?
		solution( 2 );
	}
	
	public static void solution( int hp ) {
		
		System.out.println( "사냥감의 체력 : " + hp );
		int generalStrike = 5;
		int soliderStrike = 3;
		int workerStrike = 1;
		int warriorCnt = 0;
		
		while( hp > 0 ) {
			if ( hp >= generalStrike ) {
				hp -= generalStrike;
				System.out.println( generalStrike );
				warriorCnt++;
			}
			else if ( hp >= soliderStrike ) {
				hp -= soliderStrike;
				System.out.println( soliderStrike );
				warriorCnt++;
			}
			else if ( hp >= workerStrike ) {
				hp -= workerStrike;
				System.out.println( workerStrike );
				warriorCnt++;
			}
		}
		
		System.out.println( "warriorCnt : " + warriorCnt );
		
		
		System.out.println( hp );
	}
}
