package IccMensRanking;

import java.util.Scanner;

public class PlayerRanking {
	Scanner input = new Scanner(System.in);
	PlayersInfo info = new PlayersInfo();

	public void playersRank() throws Exception {
		RankOptions info = new RankOptions();
		System.out.println("********************************");
		System.out.println("                            ");
		System.out.println("    Select The Options     ");
		System.out.println("-----------------------------");
		System.out.println("                            ");
		System.out.println("Press '1' for ODI Players Ranking");
		System.out.println("Press '2' for TEST Players Ranking");
		System.out.println("Press '3' for T20i Players Ranking");
		System.out.println("Press '4' for Home Page");
		System.out.println("                             ");
		System.out.println("********************************");
		int n = input.nextInt();
		switch (n) {
		case 1:
			OdiPlayers();
			BackMenu();
			break;

		case 2:
			TestPlayers();
			BackMenu();
			break;

		case 3:
			T20iPlayers();
			BackMenu();
			break;

		case 4:
			info.getInfo();
			break;

		default:
			System.out.println("Enter Valid Input");
			BackMenu();
			break;

		}

	}

	public void OdiPlayers() throws Exception {
		System.out.println("********************************");
		System.out.println("                            ");
		System.out.println("    Select The Options     ");
		System.out.println("-----------------------------");
		System.out.println("                            ");
		System.out.println("Press '1' for ODI Batting Rankings");
		System.out.println("Press '2' for ODI Bowling Rankings");
		System.out.println("Press '3' for ODI All-Rounder Rankings");
		System.out.println("Press '4' for Home Page");
		System.out.println("                             ");
		System.out.println("********************************");
		int n = input.nextInt();
		switch (n) {
		case 1:
			info.OdiBatting();
			break;

		case 2:
			info.OdiBowling();
			break;

		case 3:
			info.OdiAllRounder();
			break;

		case 4:
			playersRank();
			break;

		default:
			System.out.println("Enter Valid Input");
			BackMenu();
			break;
		}
	}

	public void TestPlayers() throws Exception {
		System.out.println("*******************************");
		System.out.println("                            ");
		System.out.println("    Select The Options     ");
		System.out.println("-----------------------------");
		System.out.println("                            ");
		System.out.println("Press '1' for Test Batting Rankings");
		System.out.println("Press '2' for Test Bowling Rankings");
		System.out.println("Press '3' for Test All-Rounder Rankings");
		System.out.println("Press '4' for Home Page");
		System.out.println("                             ");
		System.out.println("********************************");
		int n = input.nextInt();
		switch (n) {
		case 1:
			info.TestBatting();
			break;

		case 2:
			info.TestBowling();
			break;

		case 3:
			info.TestAllRounder();
			break;

		case 4:
			playersRank();
			break;

		default:
			System.out.println("Enter Valid Input");
			BackMenu();
			break;
		}
	}

	public void T20iPlayers() throws Exception {
		System.out.println("********************************");
		System.out.println("                            ");
		System.out.println("    Select The Options     ");
		System.out.println("-----------------------------");
		System.out.println("                            ");
		System.out.println("Press '1' for T20i Batting Rankings");
		System.out.println("Press '2' for T20i Bowling Rankings");
		System.out.println("Press '3' for T20i All-Rounder Rankings");
		System.out.println("Press '4' for Home Page");
		System.out.println("                             ");
		System.out.println("********************************");
		int n = input.nextInt();
		switch (n) {
		case 1:
			info.T20iBatting();
			break;

		case 2:
			info.T20iBowling();
			break;

		case 3:
			info.T20iAllRounder();
			break;

		case 4:
			playersRank();
			break;

		default:
			System.out.println("Enter Valid Input");
			BackMenu();
			break;

		}
	}

	public void BackMenu() throws Exception {
		System.out.println("-----------------------------");
		System.out.println("Press Any Number For Back Menu");
		System.out.println("-----------------------------");
		int n = input.nextInt();
		switch (n) {
		default:
			playersRank();
			break;
		}
	}

	public PlayerRanking() {

	}
}
