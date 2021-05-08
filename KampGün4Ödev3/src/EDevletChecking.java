
public class EDevletChecking implements Checking{

	@Override
	public void verify(Gamer gamer) {
		System.out.println("E-devlet doðrulamasý baþarýlý. Üye adý : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

}
