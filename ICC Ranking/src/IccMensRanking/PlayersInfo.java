package IccMensRanking;

public class PlayersInfo {
	public int pos;
	public String playerName;
	public String team;
	public int rating;

	public void Details() throws Exception {
		System.out.println("Rank: " + pos);
		System.out.println("Player Name: " + playerName);
		System.out.println("Team Name: " + team);
		System.out.println("Rating: " + rating);
	}

	public PlayersInfo(int pos, String playerName, String team, int rating) {
		super();
		this.pos = pos;
		this.playerName = playerName;
		this.team = team;
		this.rating = rating;
	}

	public void OdiBatting() throws Exception {
		PlayersInfo odi1 = new PlayersInfo(1, "Baber Azam", "Pakistan", 892);
		PlayersInfo odi2 = new PlayersInfo(2, "Imam-ul-Haq", "Pakistan", 815);
		PlayersInfo odi3 = new PlayersInfo(3, "Virat Kohli", "India", 811);
		PlayersInfo odi4 = new PlayersInfo(4, "Rohit Sharma", "India", 791);
		PlayersInfo odi5 = new PlayersInfo(5, "Quinton de Kock", "South Africa", 789);
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

	public void OdiBowling() throws Exception {
		PlayersInfo odi1 = new PlayersInfo(1, "	Trent Boult", "NZ", 726);
		PlayersInfo odi2 = new PlayersInfo(2, "Matt Henry", "NZ", 683);
		PlayersInfo odi3 = new PlayersInfo(3, "Shaheen Afridi", "PAK", 681);
		PlayersInfo odi4 = new PlayersInfo(4, "Chris Woakes	", "ENG", 680);
		PlayersInfo odi5 = new PlayersInfo(5, "Jasprit Bumrah	 ", "IND", 679);
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

	public void OdiAllRounder() throws Exception {
		PlayersInfo odi1 = new PlayersInfo(1, "Shakib Al Hasan", "BAN", 419);
		PlayersInfo odi2 = new PlayersInfo(2, "Mohammad Nabi", "AFG", 325);
		PlayersInfo odi3 = new PlayersInfo(3, "Rashid Khan", "AFG", 290);
		PlayersInfo odi4 = new PlayersInfo(4, "Chris Woakes", "ENG", 265);
		PlayersInfo odi5 = new PlayersInfo(5, "Colin de Grandhomme", "NZ", 262);
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

	public void TestBatting() throws Exception {

		PlayersInfo t1 = new PlayersInfo(1, "Joe Root", "ENG", 923);
		PlayersInfo t2 = new PlayersInfo(2, "Marnus Labuschagne", "AUS", 879);
		PlayersInfo t3 = new PlayersInfo(3, "Steve Smith", "AUS", 826);
		PlayersInfo t4 = new PlayersInfo(4, "Babar Azam", "PAK", 815);
		PlayersInfo t5 = new PlayersInfo(5, "Rishabh Pant", "IND", 801);
		t1.Details();
		System.out.println("---------------------------------");
		t2.Details();
		System.out.println("---------------------------------");
		t3.Details();
		System.out.println("---------------------------------");
		t4.Details();
		System.out.println("---------------------------------");
		t5.Details();
		System.out.println("---------------------------------");

	}

	public void TestBowling() throws Exception {
		PlayersInfo t1 = new PlayersInfo(1, "Pat Cummins", "AUS", 900);
		PlayersInfo t2 = new PlayersInfo(2, "Ravichandran Ashwin", "IND", 842);
		PlayersInfo t3 = new PlayersInfo(3, "Jasprit Bumrah", "IND", 828);
		PlayersInfo t4 = new PlayersInfo(4, "Shaheen Afridi", "PAK", 827);
		PlayersInfo t5 = new PlayersInfo(5, "Kagiso Rabada", "SA", 818);
		t1.Details();
		System.out.println("---------------------------------");
		t2.Details();
		System.out.println("---------------------------------");
		t3.Details();
		System.out.println("---------------------------------");
		t4.Details();
		System.out.println("---------------------------------");
		t5.Details();
		System.out.println("---------------------------------");
	}

	public void TestAllRounder() throws Exception {
		PlayersInfo t1 = new PlayersInfo(1, "Ravindra Jadeja", "IND", 384);
		PlayersInfo t2 = new PlayersInfo(2, "Ravichandran Ashwin", "IND", 335);
		PlayersInfo t3 = new PlayersInfo(3, "Shakib Al Hasan", "BAN", 328);
		PlayersInfo t4 = new PlayersInfo(4, "Jason Holder", "WI", 323);
		PlayersInfo t5 = new PlayersInfo(5, "Ben Stokes", "ENG", 309);
		t1.Details();
		System.out.println("---------------------------------");
		t2.Details();
		System.out.println("---------------------------------");
		t3.Details();
		System.out.println("---------------------------------");
		t4.Details();
		System.out.println("---------------------------------");
		t5.Details();
		System.out.println("---------------------------------");
	}

	public void T20iBatting() throws Exception {
		PlayersInfo t20i1 = new PlayersInfo(1, "Babar Azam", "PAK", 818);
		PlayersInfo t20i2 = new PlayersInfo(2, "Mohammad Rizwan", "PAK", 794);
		PlayersInfo t20i3 = new PlayersInfo(3, "Aiden Markram", "SA", 757);
		PlayersInfo t20i4 = new PlayersInfo(4, "Dawid Malan", "ENG", 728);
		PlayersInfo t20i5 = new PlayersInfo(5, "Aaron Finch", "AUS", 716);
		t20i1.Details();
		System.out.println("---------------------------------");
		t20i2.Details();
		System.out.println("---------------------------------");
		t20i3.Details();
		System.out.println("---------------------------------");
		t20i4.Details();
		System.out.println("---------------------------------");
		t20i5.Details();
		System.out.println("---------------------------------");
	}

	public void T20iBowling() throws Exception {
		PlayersInfo t20i1 = new PlayersInfo(1, "Josh Hazlewood", "AUS", 792);
		PlayersInfo t20i2 = new PlayersInfo(2, "Adil Rashid", "ENG", 746);
		PlayersInfo t20i3 = new PlayersInfo(3, "Tabraiz Shamsi", "SA", 709);
		PlayersInfo t20i4 = new PlayersInfo(4, "Rashid Khan", "AFG", 709);
		PlayersInfo t20i5 = new PlayersInfo(5, "Adam Zampa", "AUS", 698);
		t20i1.Details();
		System.out.println("---------------------------------");
		t20i2.Details();
		System.out.println("---------------------------------");
		t20i3.Details();
		System.out.println("---------------------------------");
		t20i4.Details();
		System.out.println("---------------------------------");
		t20i5.Details();
		System.out.println("---------------------------------");
	}

	public void T20iAllRounder() throws Exception {
		PlayersInfo t20i1 = new PlayersInfo(1,"	Mohammad Nabi",	"	AFG",		267);
		PlayersInfo t20i2 = new PlayersInfo(2,"	Shakib Al Hasan","	BAN",		248);
		PlayersInfo t20i3 = new PlayersInfo(3,"	Moeen Ali"	 ,"	ENG",		205);
		PlayersInfo t20i4 = new PlayersInfo(4,"	Glenn Maxwell	" ,"	AUS",		183);
		PlayersInfo t20i5 = new PlayersInfo(5,"	Liam Livingstone","	ENG",		171);
		t20i1.Details();
		System.out.println("---------------------------------");
		t20i2.Details();
		System.out.println("---------------------------------");
		t20i3.Details();
		System.out.println("---------------------------------");
		t20i4.Details();
		System.out.println("---------------------------------");
		t20i5.Details();
		System.out.println("---------------------------------");
	}

	public PlayersInfo() {
	}
}
