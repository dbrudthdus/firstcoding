package chapter01;

public class Student__Main {

	public static void main(String[] args) {
		
		// Student 타입의 배열 생성 : 데이터 10개 저장 가능
		Student__[] students = new Student__[10];
		students[0] = new Student__("son01", 100, 100, 64);
		students[1] = new Student__("son02", 100, 80, 97);
		students[2] = new Student__("son03", 95, 58, 90);
		students[3] = new Student__("son04", 88, 64, 80);
		students[4] = new Student__("son05", 100, 97, 87);
		students[5] = new Student__("son06", 76, 64, 91);
		students[6] = new Student__("son07", 100, 100, 55);
		students[7] = new Student__("son08", 70, 100, 96);
		students[8] = new Student__("son09", 90, 85, 79);
		students[9] = new Student__("son10", 80, 100, 100);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------");
		for(Student__ student : students) {
			System.out.println(student.result());
			
		}

	}

}
