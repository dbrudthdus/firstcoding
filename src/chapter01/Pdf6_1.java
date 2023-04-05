package chapter01;

public class Pdf6_1 {

	public static void main(String[] args) {
		
		// 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력
		
		int[] korScore = {100, 80, 60, 40, 80, 50, 60, 90, 40, 88};
		int[] engScore = {70, 40, 80, 90, 90, 60, 80, 60, 90, 70};
		int[] mathScore = {60, 80, 68, 100, 88, 51, 97, 66, 40, 100};
		
		System.out.println("국어 \t 영어 \t 수학 \t 총점 \t 평균");
//		for(int i=0; i<10; i++) {
//			int sum = korScore[i] + engScore[i] + mathScore[i];
//			Float avg = sum/3f; 
//			System.out.println(korScore[i] + "\t" + engScore[i] + "\t" + mathScore[i] + "\t" + sum + "\t" + avg);
//		}

		
		int[][] scores = { 
				{ 100, 90, 50 }, 
				{ 87, 90, 50 }, 
				{ 64, 82, 94 }, 
				{ 50, 90, 50 }, 
				{ 100, 90, 68 },
				{ 100, 88, 50 }, 
				{ 79, 90, 81 }, 
				{ 90, 98, 59 }, 
				{ 89, 90, 50 }, 
				{ 100, 90, 50 }, 
				};

		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				sum += scores[i][j];
			}
			System.out.print(sum + "\t");
			System.out.print(sum /(float)scores[i].length);
			System.out.println();
		}

	}
}