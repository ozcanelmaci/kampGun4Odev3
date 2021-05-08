

public class GamerManager implements GamerService{
	
   private Checking checker;
	
	public GamerManager(Checking checker) {
		this.checker = checker;
	}

	@Override
	public void add(Gamer gamer) {
		checker.verify(gamer);
		System.out.println("Üye eklendi : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Üye güncellendi : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Üye silindi : " + gamer.getFirstName() + " " + gamer.getLastName());
	}

}
