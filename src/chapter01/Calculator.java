package chapter01;

public class Calculator {

	public static void main(String[] args) {
		
		
		System.out.println(add(5, 3));
		System.out.println(sub(5, 3));
		System.out.println(mul(5, 3));
		System.out.println(div(5, 3));
	}

	// 더하기
	static int add(int num1, int num2) {
		int result = num1 + num2;

		return result;
	}

	// 빼기
	static int sub(int num1, int num2) {
		int result = num1 - num2;

		return result;
	}

	// 곱하기
	static int mul(int num1, int num2) {
		int result = num1 * num2;

		return result;
	}

	// 나누기
	static int div(int num1, int num2) {
		int result = num1 / num2;

		return result;
	}

}
