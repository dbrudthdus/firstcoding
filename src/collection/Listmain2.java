package collection;

import java.util.HashSet;

public class Listmain2 {

	public static void main(String[] args) {
		
		// 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록

		HashSet<FootballPlayer> set = new HashSet<>();

		set.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		set.add(new FootballPlayer("이강인", 18, "마요르카", 20));
		set.add(new FootballPlayer("박지성", 7, "맨유", 40));
		set.add(new FootballPlayer("이강인", 18, "마요르카", 20));
		set.add(new FootballPlayer("손흥민", 7, "토트넘", 30));

		for (FootballPlayer Fp : set) {
			System.out.println(Fp);
		}

	}
}