package inputOutput_calculation;

import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total[] = {1,1,2,2,2,8};
		int cnt[] = new int [6];
		
		for(int i=0; i<cnt.length; i++) {
			cnt[i] = sc.nextInt();
			System.out.print(total[i] - cnt[i] + " ");
		}
		
		sc.close();
	}
}
