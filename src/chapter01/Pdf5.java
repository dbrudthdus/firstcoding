package chapter01;

public class Pdf5 {

	private String name;
	private String phoneNumber;
	private String major;
	private int grade;
	private String email;
	private String birthday;
	private String address;

	public Pdf5(String name, String phoneNumber, String major, int grade, String email, String birthday,
			String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}
	
	public Pdf5(String name, String phoneNumber, String major, int grade, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}

	public void printData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);

//			if(birthday != null) {
//				System.out.println("생일 : " + birthday);
//			} else {
//				System.out.println("생일 : 미입력" );
//			}

		System.out.println("생일 : " + (birthday != null ? birthday : "미입력"));
//			
//			if(address != null) {
//				System.out.println("주소 : " + address);
//			} else {
//				System.out.println("주소 : 미입력" );
//			}

		System.out.println("주소 : " + (address != null ? address : "미입력"));

	}
	
	public static void main(String[] args) {
		Pdf5 member1 = new Pdf5("손흥민", "010-9999-7777", "축구", 1, "son@gmail", "1990.10.12", "런던");
		member1.printData();

		Pdf5 member2 = new Pdf5("박지성", "010-1111-2222", "체육", 4, "park@gmail");
		member2.printData();
		
	}
}








