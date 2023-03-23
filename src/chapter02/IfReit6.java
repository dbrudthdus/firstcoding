package chapter02;

public class IfReit6 {

	public static void main(String[] args) {
		
		// 1~99까지의 합을 구해
		
		int num = 1;
		int sum = 0;
		
		while(num<100) {
			sum = sum + num;
			
			num++;
		}
		
		System.out.println("합 : " + sum);
		
		


	}

}
