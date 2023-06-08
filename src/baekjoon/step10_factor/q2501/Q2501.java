package baekjoon.step10_factor.q2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2501 {

    public static void main( String[] args ) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        StringTokenizer st = new StringTokenizer( br.readLine() );

        int N = Integer.parseInt( st.nextToken() );
        int K = Integer.parseInt( st.nextToken() );
        int F = -1;     // K 번째 작은 약수

        // N 의 약수 중 K 번째로 작은 수
        // 자연수 N 의 약수 모두 확인하기.

        int cnt = 0; // 몇번째 작은 수인지 체크하기 위해.

        for( int i = 1; i <= N; i++ ) {
            System.out.print( i + " 로 나눈 나머지 : " + N % i );

            if ( N % i == 0 ) {
                cnt++;
                System.out.print( " => 약수, 몇번째 수냐면 : " + cnt );

                if ( cnt == K ) {
                    F = i;
                }
            }

            System.out.println();
        }

        if ( F == -1 ) {
            F = 0;
        }
        System.out.println( K + " 번째로 작은 약수 : " + F );

    }
}
