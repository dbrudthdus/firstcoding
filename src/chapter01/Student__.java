package chapter01;

public class Student__ {
	
	private String sName;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Student__(String sName, int korScore, int engScore, int mathScore) {
		super();
		this.sName = sName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	public Student__() {

	}
	public String getsNme() {
		return sName;
	}
	public void setsNme(String sNme) {
		this.sName = sNme;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	
	// 총점 계산해서 반환하는 메소드
	private int sum() {
		return korScore + engScore + mathScore;
	}
	
	private float avg() {
		return sum()/3f;
	}
	
	public String result() {
		return sName + "\t" + korScore + "\t" + engScore + "\t" + mathScore + "\t" + sum() + "\t" + avg();
	}
	
	@Override
	public String toString() {
//		return "Student__ [sNme=" + sNme + ", korScore=" + korScore + ", engScore=" + engScore + ", mathScore="
//				+ mathScore + "]";
		
		return result();
	}
	
	
	
	
	


}
