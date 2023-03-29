package chapter01;

public class StudentMain {

	public static void main(String[] args) {
		
		Student[] member = new Student[3];
		
		member[0] = new Student("손흥민", 80, 89, 60);
		member[1] = new Student("박지성", 90, 55, 98);
		member[2] = new Student("이강인", 65, 88, 72);
		
		for(Student score : member) {
			System.out.println(score);
		}
		
		

	}

}
