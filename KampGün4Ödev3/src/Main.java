
public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1,"�zcan", "Elmac�","11111111111");
		Gamer gamer2 = new Gamer(2,"Sadulah", "Cihan","22222222222");
		Gamer gamer3 = new Gamer(3,"Halil �brahim", "Sapmaz","33333333333");
		
		Campaign campaign1 = new Campaign(1,"%50 indirim kampanyas�");
		Campaign campaign2 = new Campaign(2,"Yeni kat�lan kampanyas�");
		Campaign campaign3 = new Campaign(3,"Bahar kampanyas�");
		
		GamerManager gamerManager = new GamerManager(new EDevletChecking());
		
		GameSellManager gameSellManager = new GameSellManager();
		
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		gamerManager.add(gamer3);

		gameSellManager.sellGame(gamer1, new Game(1, "FIFA 20"), campaign3);
		gameSellManager.sellGame(gamer2, new Game(3, "GTA V"), campaign2);
		gameSellManager.sellGame(gamer3, new Game(2, "PES 20"), campaign1);
	}

}
