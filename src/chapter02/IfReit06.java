package chapter02;

public class IfReit06 {

	public static void main(String[] args) {
		
		// 1~99까지의 합을 구해

		int num = 1;
		int sum = 0;

		while (num < 100) {
			sum = sum + num;
			// sum += num; 둘 다 가능

			num++;
		}

		sum = 0;
		
		for(int i=1; i<100; i++) {
			sum += i;
		}
		
		System.out.println("합 : " + sum);
		}

	}

