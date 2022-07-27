package inputOutput_calculation;

import java.util.Scanner;

public class Exam05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 두 정수 A,B를 입력 받으라고 했기 때문에 Scanner 사용. 
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A-B);
		
		sc.close(); // 리소스 누수 (resource leaks) 때문에 닫아주는 것을 권장함.
	}
}
