package baekjoon.basic;

public class Gugudan {

	public static void main(String[] args) {
//		for(int i = 1; i < 10; i++) {
//			// 1 단 = 1 * n (1 ~ 9)
//			System.out.println("===" + i + "단===");
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//		}
//	
		for(int i = 1; i < 10 ; i++) {
			System.out.println(i+ " 단==");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
}
