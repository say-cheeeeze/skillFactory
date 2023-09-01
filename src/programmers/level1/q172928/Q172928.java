package programmers.level1.q172928;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q172928 {
	
	static Map<String, String> parkMap = new HashMap<>();
	static StringTokenizer st = null;
	
	public static void main( String[] args ) {
//		String[] park = { "OSO", "OOO", "OXO", "OOO" };
//		String[] routes = { "E 2", "S 3", "W 1" };
		// result[0,0]
		
//		String[] routes = { "E 2", "S 2", "W 1" };
//		String[] park = { "SOO", "OXX", "OOO" };
		// result[0,1]
		
//		String[] routes = { "E 2","S 2","W 1" };
//		String[] park = { "SOO","OOO","OOO" };
//		result[2,1]
		
//		String[] park = { "SOOO", "OOOO", "OOOO" };
//		String[] routes = { "E 3", "S 3", "S 2" };
//		[2, 3]

//		String[] park = { "OOO", "OSO", "OOO", "OOO" };
//		String[] routes = { "N 2", "S 2" };
		// [3, 1]
		
//		String[] park = { "OOOOO", "OOOOO", "OOSOO", "OOOOO", "OOOOO" };
//		String[] routes = { "E 3", "W 3", "S 3", "N 3", "E 2", "E 1", "W 4", "W 1", "S 2", "S 1", "N 4", "N 1"};
		//[0, 0]
		
//		String[] park = { "OXXO", "XSXO", "XXXX" };
//		String[] routes = { "E 1", "S 1"};
		// [1, 1]
		
		String[] park = { "OXO", "XSX", "OXO" };
		String[] routes = { "S 1", "E 1", "W 1", "N 1" };
		// [1, 1]
		
		int[] solution = solution( park, routes );
		
		System.out.println( "종료...........########## solution = " + Arrays.toString( solution ) );
	}
	
	public static int[] solution( String[] park, String[] routes ) {
		
		int[] answer = {};
		
		// 먼저 park 의 이동가능 여부를 빠르게 조회할 수 있도록 map 에 저장
		// Key(String) : 좌표를 저장 "x,y"
		// Value(String) : "true" / "false"
		parkMap.put( "H", String.valueOf( park.length - 1 ) );
		parkMap.put( "W", String.valueOf( park[ 0 ].length() - 1 ) );
		
		for ( int i = 0; i < park.length; i++ ) {
			
			String parkInfo = park[ i ];
			//			System.out.println( "parkInfo = " + parkInfo );
			StringBuilder sb = new StringBuilder();
			sb.append( i );
			
			String[] eachPath = parkInfo.split( "" );
			//			System.out.println( "eachPath = " + Arrays.deepToString( eachPath ) );
			for ( int j = 0; j < eachPath.length; j++ ) {
				
				sb.append( "," ).append( j );
				String pathXY = sb.toString();
				//				System.out.println( "pathString = " + pathString );
				
				if ( eachPath[ j ].equals( "S" ) ) {
					System.out.println( "시작점 ### pathXY" + pathXY 	);
					parkMap.put( "S", pathXY );
					parkMap.put( pathXY, "true" );
				}
				else if ( eachPath[ j ].equals( "O" ) ) {
					parkMap.put( pathXY, "true" );
				}
				else {
					parkMap.put( pathXY, "false" );
				}
				
				int sep = sb.indexOf( "," );
				sb.delete( sep, sb.length() );
			}
		}
//		System.out.println( "parkMap = " + parkMap );
		
		// 처음 시작 좌표를 먼저 알아야한다.
		String startPoint = parkMap.get( "S" );
//		System.out.println( "startPoint = " + startPoint );
		
		// 현재 경로
		String current = startPoint;
		
		// 경로 명령을 순회하며 수행한다.
		for ( int i = 0; i < routes.length; i++ ) {
			
			// order 가 이동가능한지 판별한다.
			String order = routes[ i ];
//			System.out.println( "현재 위치 >>>>>>>>>> " + current );
//			System.out.println( (i+1) + "번째 명령 >>>>>>>>>> " + order );
			
			// 다음 지점이 될 좌표 x,y
			String targetXY = getNextPosition( current, order );
			
			// 만약 이동해야할 지점이 공원의 범위를 벗어나거나 장애물이 있는 경우에는 다음 명령으로 넘어간다.
			
			// 1. 범위를 벗어나는 경우를 판단
			if ( outOfPark( targetXY ) ) {
				System.out.println( "범위를 벗어나는 경우. 다음으로" );
				continue;
			}
			
			// 2. 장애물이 있는 경우를 판단
			// 해당 목표를 포함하여 중간에(직선으로 이동하므로) 장애물이 있는지를 판단해야한다.
			if ( hasObstacle( current, targetXY, order ) ) {
				System.out.println( "장애물 발견. 다음으로" );
				continue;
			}
			
			// 이동한다.
			current = targetXY;
			System.out.println( "##### 다음 단계로 이동한다.######################" );
		}
		
		// 마지막 위치의 좌표를 반환한다.
		// "3,1" 이거를 [3,1] 배열로
		String[] split = current.split( "," );
		answer = Arrays.stream( split ).mapToInt( Integer::parseInt ).toArray();
		
		return answer;
	}
	
	// 가는 길 중간에 장애물이 있는 경우 true
	private static boolean hasObstacle( String current, String targetXY, String order ) {
		
		System.out.println( "hasObstacle ##########################" );
		System.out.println( "현재 경로 = " + current + " / 목표 " + targetXY );
		System.out.println( "order = " + order );
		
		st = new StringTokenizer( order );
		String direction = st.nextToken();
		
		int start = 0;
		int end = 0;
		// 방향을 알면 증감식을 구성할 수 있다.
		// x축 이동인 경우
		if ( direction.equals( "E" ) || direction.equals( "W" ) ) {
			
			String[] curPath = current.split( "," );
			String[] targetPath = targetXY.split( "," );
			
			int currX = Integer.parseInt( curPath[ 1 ] );
			int targetX = Integer.parseInt( targetPath[ 1 ] );
			start = ( currX > targetX ) ? targetX : currX;
			end = ( start == currX ) ? targetX : currX;
			
			System.out.println( "start = " + start );
			System.out.println( "end = " + end );
			
			// y축 고정
			String pathH = curPath[ 0 ];
			
			// 현재 경로와 target 경로까지 W 를 증감하며 검사하면 된다.
			for( int i = start; i <= end; i++ ) {
				
				String checkValue = pathH + "," + i;
				String value = parkMap.get( checkValue );
				System.out.println( checkValue + "를 검사합니다........value = " + value );
				
				if ( value.equals( "false" ) ) {
					System.out.println( checkValue + "에서 장애물이 발견" );
					return true;
				}
			}
		}
		else {
			
			String[] curPath = current.split( "," );
			String[] targetPath = targetXY.split( "," );
			
			int currY = Integer.parseInt( curPath[ 0 ] );
			int targetY = Integer.parseInt( targetPath[ 0 ] );
			start = ( currY > targetY ) ? targetY : currY;
			end = ( start == currY ) ? targetY : currY;
			
			System.out.println( "start = " + start );
			System.out.println( "end = " + end );
			
			// x축 고정
			String pathW = curPath[ 1 ];
			
			// 현재 경로와 target 경로까지 W 를 증감하며 검사하면 된다.
			for( int i = start; i <= end; i++ ) {
				
				String checkValue = i + "," + pathW;
				String value = parkMap.get( checkValue );
				System.out.println( checkValue + "를 검사합니다........value = " + value );
				
				if ( value.equals( "false" ) ) {
					System.out.println( checkValue + "에서 장애물이 발견" );
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 다음 목표지점을 확인합니다.
	 * @param current
	 * @param order
	 * @return
	 */
	public static String getNextPosition( String current, String order ) {
		
		st = new StringTokenizer( order );
		String direction = st.nextToken();
		String distance = st.nextToken();
		
		st = new StringTokenizer( current, "," );
		int currY = Integer.parseInt( st.nextToken() );
		int currX = Integer.parseInt( st.nextToken() );
		
//		System.out.println( "currX = " + currX );
//		System.out.println( "currY = " + currY );
		
		int targetY = currY;
		int targetX = currX;
		
		if ( direction.equals( "N" ) ) {
			targetY -= Integer.parseInt( distance );
		}
		else if ( direction.equals( "S" ) ) {
			targetY += Integer.parseInt( distance );
		}
		if ( direction.equals( "W" ) ) {
			targetX -= Integer.parseInt( distance );
		}
		else if ( direction.equals( "E" ) ) {
			targetX += Integer.parseInt( distance );
		}
		
		return targetY + "," + targetX;
	}
	
	/**
	 * 목표 지점이 공원을 벗어나는 경우 true 반환
	 * @param targetXY
	 * @return
	 */
	public static boolean outOfPark( String targetXY ) {
		
		System.out.println( "이동할 목표 : " + targetXY );
		
		int maxWidth = Integer.parseInt( parkMap.get( "W" ) );
		int maxHeigth = Integer.parseInt( parkMap.get( "H" ) );
		System.out.println( "maxX 좌표 = " + maxWidth );
		System.out.println( "maxY 좌표 = " + maxHeigth );
		
		st = new StringTokenizer( targetXY, "," );
		int targetY = Integer.parseInt( st.nextToken() );
		int targetX = Integer.parseInt( st.nextToken() );
//		System.out.println( "targetX = " + targetX );
//		System.out.println( "targetY = " + targetY );
		
		if ( targetX < 0 || targetX > maxWidth ) {
			System.out.println( "X 좌표가 공원을 벗어나게 됩니다." );
			return true;
		}
		if ( targetY < 0 || targetY > maxHeigth ) {
			System.out.println( "Y 좌표가 공원을 벗어나게 됩니다." );
			return true;
		}
		
		return false;
	}
}
