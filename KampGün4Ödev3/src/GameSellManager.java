
public class GameSellManager{
	
	public void sellGame( Gamer gamer,Game game, Campaign campaign) {
		System.out.println("Uygulanan kampanya : " + campaign.getDescription());
		System.out.println("Sat�lan oyun ad� : " + game.getName());
		System.out.println("Oyunu alan oyuncu ad� : " + gamer.getFirstName() + " " + gamer.getLastName());
	}
}
