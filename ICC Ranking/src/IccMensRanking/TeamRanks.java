package IccMensRanking;

import java.util.Scanner;

public class TeamRanks {

	Scanner input = new Scanner(System.in);

	public void teamRank() throws Exception {

		RankOptions info = new RankOptions();
		System.out.println("********************************");
		System.out.println("                            ");
		System.out.println("    Select The Options     ");
		System.out.println("-----------------------------");
		System.out.println("                            ");
		System.out.println("Press '1' for ODI Ranking's");
		System.out.println("Press '2' for TEST Ranking");
		System.out.println("Press '3' for T20 Ranking");
		System.out.println("Press '4' for Home Page");
		System.out.println("                             ");
		System.out.println("********************************");
		int n = input.nextInt();
		switch (n) {
		case 1:
			getOdi();
			BackMenu();
			break;

		case 2:
			getTest();
			BackMenu();
			break;

		case 3:
			getT20I();
			BackMenu();
			break;

		case 4:
			info.getInfo();
			break;

		default:
			System.out.println("Enter Valid Input");
			break;
		}
	}

	private int pos;
	String team;
	int match;
	int point;
	int rating;

	public void Details() {
		System.out.println("Position: " + pos);
		System.out.println("Team Name: " + team);
		System.out.println("Mathces played: " + match);
		System.out.println("Points: " + point);
		System.out.println("Rating: " + rating);
	}

	public TeamRanks(int pos, String team, int match, int point, int rating) {
		this.pos = pos;
		this.team = team;
		this.match = match;
		this.point = point;
		this.rating = rating;
	}

	private void getOdi() {
		TeamRanks odi1 = new TeamRanks(1, "New Zealand", 13, 1640, 126);
		TeamRanks odi2 = new TeamRanks(2, "England", 22, 2756, 125);
		TeamRanks odi3 = new TeamRanks(3, "Pakistan", 19, 2005, 106);
		TeamRanks odi4 = new TeamRanks(4, "India", 22, 2304, 105);
		TeamRanks odi5 = new TeamRanks(5, "Australia", 23, 232, 101);
		odi1.Details();
		System.out.println("---------------------------------");
		odi2.Details();
		System.out.println("---------------------------------");
		odi3.Details();
		System.out.println("---------------------------------");
		odi4.Details();
		System.out.println("---------------------------------");
		odi5.Details();
		System.out.println("---------------------------------");

	}

	private void getTest() {
		TeamRanks test1 = new TeamRanks(1, "Australia", 19, 2439, 128);
		TeamRanks test2 = new TeamRanks(2, "India", 29, 3318, 114);
		TeamRanks test3 = new TeamRanks(3, "South Africa", 21, 2306, 110);
		TeamRanks test4 = new TeamRanks(4, "England", 39, 3909, 100);
		TeamRanks test5 = new TeamRanks(5, "New Zealand", 27, 2704, 100);
		test1.Details();
		System.out.println("---------------------------------");
		test2.Details();
		System.out.println("---------------------------------");
		test3.Details();
		System.out.println("---------------------------------");
		test4.Details();
		System.out.println("---------------------------------");
		test5.Details();
		System.out.println("---------------------------------");

	}

	private void getT20I() {
		TeamRanks t201 = new TeamRanks(1, "India", 39, 10514, 270);
		TeamRanks t202 = new TeamRanks(2, "England", 31, 8192, 264);
		TeamRanks t203 = new TeamRanks(3, " Pakistan", 30, 7826, 261);
		TeamRanks t204 = new TeamRanks(4, " South Africa", 29, 7407, 255);
		TeamRanks t205 = new TeamRanks(5, "Australia", 36, 9009, 250);
		t201.Details();
		System.out.println("---------------------------------");
		t202.Details();
		System.out.println("---------------------------------");
		t203.Details();
		System.out.println("---------------------------------");
		t204.Details();
		System.out.println("---------------------------------");
		t205.Details();
		System.out.println("---------------------------------");

	}
	
	public void BackMenu() throws Exception {
		System.out.println("-----------------------------");
		System.out.println("Press Any Number For Back Menu");
		System.out.println("-----------------------------");
		int n = input.nextInt();
		switch (n) {
		default:
			teamRank();
			break;
		}
	}

	public TeamRanks() {
	}
}
