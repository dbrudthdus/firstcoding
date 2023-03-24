package chapter02;

public class IfReit03 {

	public static void main(String[] args) {
		
		
//		int num1=50, num2=100;
//        int big, diff;
//        big = (num1>num2)? num1:num2;
//        System.out.println(big);
		
//        diff = (num1>num2)? num1-num2: num2-num1;
//        System.out.println(diff);
		
		// if~else로 변경
		
		// 두 수의 큰 수를 찾아 출력하고 두 수의 차를 출력하자
		
		// 큰 수 -> 두 수를 비교해서 판별
		// 두 수의 차 -> 두 수의 큰 수와 작은 수를 구해서 큰 수에서 작은 수를 빼준다.
		
		
		
		int num1=50, num2=100;
		int big, diff;
		
		if(num1>num2) {
			big = num1;
		}
		else {
			big = num2;
		}
		System.out.println(big);
		
		
		
		
		if(num1>num2) {
			diff = num1-num2;
		}
		else {
			diff = num2-num1;
		}
		
		System.out.println(diff);
		
		
		
		
		
		
		

	}

}
