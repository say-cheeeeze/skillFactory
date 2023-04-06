package programmers.beginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray2 {
	
	public static void main( String[] args ) {
		
		int[] numList = new int[] { 1, 2, 3, 4, 4 };
		
		List<Integer> intList = Arrays.stream( numList ).boxed().collect( Collectors.toList() );
		System.out.println( intList );
		Collections.reverse( intList );
		System.out.println( intList );
		int[] reversedArr = intList.stream().mapToInt( Integer::intValue ).toArray();
		for ( int i = 0; i < reversedArr.length; i++ ) {
			System.out.print( reversedArr[ i ] );
		}
		
		for ( int i = 0; i < intList.size(); i++ ) {
			int value = intList.get( i ).intValue();
		}
		
		List<Integer> list = Arrays.stream( numList ).boxed().collect( Collectors.toList() );
		
		Collections.reverse( list );
		// return list.stream().mapToInt( Integer::intValue ).toArray();
	}
}
