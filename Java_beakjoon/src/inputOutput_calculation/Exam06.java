package inputOutput_calculation;

import java.io.IOException;

public class Exam06 {
	
	public static void main(String[] args) throws IOException{
		
		int A = System.in.read() - '0'; // System.in.read()-48 or '0'; == ¼ýÀÚ
		System.in.read();
		int B = System.in.read() - '0';
		System.in.read();
		
		System.out.println(A-B);
		
		
	}
}
