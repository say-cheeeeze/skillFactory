package baekjoon.bronze.lv2.q2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2745 {
    public static void main( String[] args ) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputStr = br.readLine();
        StringTokenizer st = new StringTokenizer( inputStr );
        String number = st.nextToken();
        int radix = Integer.parseInt( st.nextToken() );
//        System.out.println( "number : " + number );
//        System.out.println( "radix : " + radix );
        System.out.println( Integer.parseInt( number, radix ) );

    }
}
