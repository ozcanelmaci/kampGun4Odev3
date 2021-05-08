
public class GameSellManager{
	
	public void sellGame( Gamer gamer,Game game, Campaign campaign) {
		System.out.println("Uygulanan kampanya : " + campaign.getDescription());
		System.out.println("Satýlan oyun adý : " + game.getName());
		System.out.println("Oyunu alan oyuncu adý : " + gamer.getFirstName() + " " + gamer.getLastName());
	}
}
