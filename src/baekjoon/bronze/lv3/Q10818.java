package baekjoon.bronze.lv3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(array);
		System.out.println(array[0]+" "+array[n-1]);
	}
}
