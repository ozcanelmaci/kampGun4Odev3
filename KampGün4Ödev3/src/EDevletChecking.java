
public class EDevletChecking implements Checking{

	@Override
	public void verify(Gamer gamer) {
		System.out.println("E-devlet do�rulamas� ba�ar�l�. �ye ad� : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

}
