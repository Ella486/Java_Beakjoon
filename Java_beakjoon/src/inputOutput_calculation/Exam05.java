package inputOutput_calculation;

import java.util.Scanner;

public class Exam05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �� ���� A,B�� �Է� ������� �߱� ������ Scanner ���. 
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A-B);
		
		sc.close(); // ���ҽ� ���� (resource leaks) ������ �ݾ��ִ� ���� ������.
	}
}
