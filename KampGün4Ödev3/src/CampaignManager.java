
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi");
		
	}

}
