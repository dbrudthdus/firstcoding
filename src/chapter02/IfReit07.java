package chapter02;

public class IfReit07 {

	public static void main(String[] args) {
		
//		1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성
		
		
		int num = 0;

		while (num < 100) {
			num++;
			System.out.println(num);
		}

		do {
			System.out.println(num);
			num--;
		} while (num > 0);

	}

}
