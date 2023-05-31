package baekjoon.step05;

import java.util.Scanner;

public class Q2562 {

	// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최대값을 찾고
	// 그 최대값이 몇번째 수인지 구하기
	public static void main(String[] args ) {
    	Scanner sc = new Scanner( System.in );
    	int[] arr1 = new int[9];
    	//최대값
    	int maxNum = 0;
    	//인덱스
    	int index = 0;
    	
    	for ( int i = 0; i < 9; i++ ) {
    	
    		arr1[i] = sc.nextInt();
    		if ( maxNum < arr1[i] ) {
    			maxNum = arr1[i];
    			index = i+1;
    		}
    
    	}
    	
    	System.out.println("최대값 :" + maxNum);
    	System.out.println("index : " + index );
		sc.close();
	}
	
}
