package baekjoon.basic;
public class HelloworldApp {
	public static void main(String[] args) {
		System.out.println("Hello World ! ");
		System.out.println("자바 학습중입니다.");
		System.out.print("이건 띄어쓰기가 안됩니다.");
		System.out.println("한줄에 쓰고 싶을때는 printl 말고 print");
		float a;
		a=(float) 1.2;
		System.out.println("a의 값 : "+a);
		
		final int b=2;
		System.out.println("b의 값 : "+b);
		
		int varInt=42;
		long varLong=987654444;
		short varShort=32767;
		System.out.println("varInt값 : "+varInt+", \n varLong값 : "+varLong+", short의 데이터의 최대값 : "+varShort);
		
		float varFloat=32.891f;
		double varDouble=98.76543;
		System.out.println("float형 : "+varFloat+", double형 : "+varDouble);
		
		boolean varTrue=true;
		boolean varFalse=false;
		System.out.println("varTrue값 : "+varTrue);
		System.out.println("varFalse값 : "+varFalse);
		
		char varChar='A';
		System.out.println("Char형은 한 개의 문자만 저장 가능하고 ' '로 묶는다!!! :" +varChar);
		
		double varDouble1 = 98.76;
		int varInteger1=(int)varDouble1;
		System.out.println("double 을 int 로 : " + varInteger1);
		
		
		
	}
}