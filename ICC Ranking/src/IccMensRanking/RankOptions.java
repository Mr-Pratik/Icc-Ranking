package IccMensRanking;

import java.util.Scanner;

public class RankOptions extends PlayersInfo {

	Scanner input = new Scanner(System.in);

	public void getInfo() throws Exception {
		TeamRanks info = new TeamRanks();
		PlayerRanking info1 = new PlayerRanking();
		int x = 1;
		do {
			try {
				System.out.println("********************************");
				System.out.println("                            ");
				System.out.println("  Select The Above Options  ");
				System.out.println("-----------------------------");
				System.out.println("                            ");
				System.out.println("Press '1' For Team Ranking's");
				System.out.println("Press '2' For Players Ranking");
				System.out.println("Press '3' For Exit");
				System.out.println("                             ");
				System.out.println("********************************");
				int n = input.nextInt();
				switch (n) {
				case 1:
					info.teamRank();
					break;

				case 2:
					info1.playersRank();
					break;
					
				case 3:
					ThankU();
					break;

				default:
					System.out.println("Entr Valid Input");
					BackMenu();
					break;
				}

			} catch (Exception e) {
				System.out.println("Enter Valid Nubmber");
			}

		} while (x == 2);
			
	}
	
	public void ThankU() throws Exception{
		  System.out.println("Thank You Fot Visit");
	}
	
	public void BackMenu() throws Exception {
		System.out.println("-----------------------------");
		System.out.println("Press Any Number For Options");
		System.out.println("-----------------------------");
		int n = input.nextInt();
		switch (n) {
		default:
			getInfo();
			break;
		}
	}
}