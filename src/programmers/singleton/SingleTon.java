package programmers.singleton;

public class SingleTon {
	
	private static final SingleTon singleton = new SingleTon();
	
	public static SingleTon getInstance() {
		return singleton;
	}
	
	private SingleTon() {}
	
	
}
