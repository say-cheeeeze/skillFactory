package baekjoon.chap03;import java.util.Scanner;

public class Q8393{
    public static void main(String[] args){

    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int sum=0;
    	for (int i=1;i<=n;i++) {
    		sum+=i;
    	}
    	sc.close();
    	System.out.println(sum);
    }
}