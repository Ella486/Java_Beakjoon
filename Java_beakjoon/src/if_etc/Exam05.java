package if_etc;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); // ��
		int m = sc.nextInt(); // ��
		
		if(m<45) {
			h--; // �� 1�� ����
			m = 60 - (45-m); // �� ����
			
			if(h<0) {
				h = 23;
			}
			System.out.println(h + " " + m);
			
		}else {
			System.out.println(h + " " + (m-45));
		}
		
		sc.close();
	}
}
