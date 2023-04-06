package baekjoon.chap03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11021{
    public static void main(String[] args) {
    	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	try {
    		int n=Integer.parseInt(br.readLine());
    		for(int i=0;i<n;i++) {
    			String [] numbers=br.readLine().split(" ");
    			bw.write("Case #"+(i+1)+": "+(Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]))+"\n");
    		}
    		bw.flush();
    	}catch(Exception e) {
    		e.printStackTrace();
    	} finally {
    		if(bw!=null) {
    			try {
        			bw.close();
        		}catch(IOException e){
        			e.printStackTrace();
        		}		
    		}
    		
    	}
    	
    }
}