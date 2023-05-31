package baekjoon.step02;import java.util.Scanner;
public class Q2884{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int M=sc.nextInt();
        if(M<45) {
        	H--;
        	M+=60;
        	if(H<0) {
        		H=23;
        	}
        } 
        sc.close();
        System.out.print(H+" ");
    	System.out.print(M-45);
    }
    
}