package programmers.singleton;

public class Ex1 {
	
	public static void main( String[] args ) {
		
		SingleTon singleTon2 = SingleTon.getInstance();
		SingleTon singleTon1 = SingleTon.getInstance();
		System.out.println( "singleTon1 = " + singleTon1 );
		System.out.println( "singleTon2 = " + singleTon2 );
		
	}
}
