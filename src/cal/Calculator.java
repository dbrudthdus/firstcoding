package cal;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요. >>");
		long num1 = in.nextLong();
		
		System.out.println("두 번째 숫자를 입력하세요. >>");
		long num2 = in.nextLong();
		
		System.out.println(" 연산의 결과 ===========");
		
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		
		System.out.println();
		
		System.out.println("반지름의 길이를 입력하세요 >>");
		double r = in.nextDouble();
		
		
		System.out.println("원의 둘레 : " + cal1(r));
		System.out.println("원의 넓이 : " + cal2(r));
	
	}
		
	
		// 더하기
		static void add(long num1, long num2) {
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}

		// 빼기
		static void sub(long num1, long num2) {
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		}

		// 곱하기
		static void mul(long num1, long num2) {
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		}

		// 나누기
		static void div(float num1, float num2) {
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		}
		
		// 원의 둘레
		static double cal1(double r) {
			return 2*Math.PI * r;
		}
		
		// 원의 넓이
		static double cal2(double r) {
			return Math.PI * r * r;
		}
		
}
