package baekjoon.bronze.lv5;
import java.util.Scanner;

public class Q10950{
    public static void main(String[] args){

    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	
    	for(int i=0;i<t;i++) {
    		int a=sc.nextInt();
        	int b=sc.nextInt();
        	System.out.println(a+b);
    	}
    	sc.close();
    }
}