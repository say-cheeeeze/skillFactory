package baekjoon.bronze.lv4;import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15552{
    public static void main(String[] args) throws Exception{
    	
    	//BufferedReader와 BufferedWriter 둘 다 IOException 처리를 별도로 해줘야한다.
    	//try catch 로 해도 되고 함수의 throws Exception 처리로 해도 된다 
    	
    	//입력값을 바이트스트림에서 문자스트림으로 변환해주는 InputStreamReader
    	//출력은 그에 반대로 작동하는 OutputStreamWriter와 system.out 을 사용
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	try {
    		int n=Integer.parseInt(br.readLine());
    		for(int i=0;i<n;i++) {
    			String [] numbers=br.readLine().split(" ");
    			bw.write(Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1])+"\n");
    		}
    		bw.flush();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	//stream을 다 쓰고 완전 닫을때 close()
    	bw.close();
    	
    	//write한다고 해서 바로 출력되지 않는다.
    	//직접 출력stream에 반영되기 전에 성능을 위해 buffer에 저장해두었다가
    	//bufferedwriter가 flush 되거나 close 되었을때 한번에 출력 stream 에 반영되기 때문
    	
    	//출력내용에 줄바꿈이 필요할때 newLine() 함수 사용
    	//bw.newLine();

    	//bw.write("new Line을 통해 한줄을 띄우거나 \\n을 통해 띄운다");
    	 
    	//계속 출력하고자 한다면 flush()
    	//bw.close();
    }
}