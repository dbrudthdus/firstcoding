package chapter01;

public class Student {
	
	String memberName;
	int lan;
	int eng;
	int mat;
	
	public Student(String memberName, int lan, int eng, int mat) {
		this.memberName = memberName;
		this.lan = lan;
		this.eng = eng;
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "Student [학생이름=" + memberName + ", 국어점수=" + lan + ", 영어점수=" + eng + ", 수학점수=" + mat + "]";
	}

	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getLan() {
		return lan;
	}

	public void setLan(int lan) {
		this.lan = lan;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	void tell() {
		System.out.println();
	}
	
	

}
