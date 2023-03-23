package chapter02;

public class IfReit3 {

	public static void main(String[] args) {
		
		
//		int num1=50, num2=100;
//        int big, diff;
//        big = (num1>num2)? num1:num2;
//        System.out.println(big);
//        diff = (num1>num2)? num1-num2: num2-num1;
//        System.out.println(diff);
		// if~else로 변경
		
		
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
