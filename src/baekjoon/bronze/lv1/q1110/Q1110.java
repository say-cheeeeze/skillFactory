package baekjoon.bronze.lv1.q1110;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110{
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int n=Integer.parseInt(br.readLine());
    	int m=n;
    	int cycleCount=0;
    	while(true) {
    		n=((n%10)*10)+(((n/10)+(n%10))%10);
    		//26이면=(6*10)+ (2+0의 2)
    		
    		cycleCount++;
    		System.out.println("=== while문 === n : "+n+" 이고, cycle횟수는 : "+cycleCount);
    		if(n==m) {
    			break;
    		}
    	}
    	System.out.println("=====또 다른 방법====");
    	int o=Integer.parseInt(br.readLine());
    	int p=o;
    	int cycleCount2=0;
    	do {
    		o=((o % 10) * 10) + (((o / 10) + (o % 10)) % 10);
    		cycleCount2++;
    		System.out.println("=== Do- while문 === n : "+o+" 이고, cycle횟수는 : "+cycleCount2);
			System.out.println("프로그램 종료==");
    	}while(o!=p);	
    	
    }
}