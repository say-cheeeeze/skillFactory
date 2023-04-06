package baekjoon.chap03;import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2741{
    public static void main(String[] args){
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	try {
    		int n=Integer.parseInt(br.readLine());
    		for(int i=1; i<=n;i++) {
    			bw.write(i+"\n");
    		}
    		bw.flush();
    	}catch(IOException e) {
    		e.printStackTrace();
    	} finally {
    		if(bw !=null) {
    			try {
    				bw.close();
    			}catch(IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    }
}