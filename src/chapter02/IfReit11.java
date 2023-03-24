package chapter02;

public class IfReit11 {

	public static void main(String[] args) {
		
//        int num=0;
//        int count=0;
//        while((num++)<100){
//            if(num%5!=0 || num%7!=0)
//            continue;
//            count++;
//            System.out.println(num);
//        }
//        System.out.println("count: " + count);

		int count = 0;

		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
				count++;
			}
		}

		System.out.println("count : " + count);

	}

}
