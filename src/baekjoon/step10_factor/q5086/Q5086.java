package baekjoon.step10_factor.q5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5086 {

    public static void main( String[] args ) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        StringTokenizer st;

        while( true ) {

            st = new StringTokenizer( br.readLine() );

            int num1 = Integer.parseInt( st.nextToken() );
            int num2 = Integer.parseInt( st.nextToken() );

            if ( num1 == 0 && num2 == 0 ) {
                System.out.println( "break" );
                break;
            }

            if ( num2 % num1 == 0 ) {
                System.out.println( "factor" );
            }
            else if ( num1 % num2 == 0 ) {
                System.out.println( "multiple" );
            }
            else {
                System.out.println( "neither" );
            }
        }
    }
}
