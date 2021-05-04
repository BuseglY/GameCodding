public class CampaignManager extends IdVerification implements CampaignService {

	int campaignProportion=10;//kampanya y�zdesi
	public boolean campaign(Player player) {
		if(checkPlayerInfo(player))
			return true;
		else
			return false;
	
	}
	@Override
	public void addCampaign(int campaign) {
			this.campaignProportion=campaign;
			System.out.println("%"+campaign+" kampanyas� eklendi.");
		
	}

	@Override
	public void deleteCampaign(int campaign) {
		this.campaignProportion=0;
		System.out.println("Kampanya silindi.");
	}

	@Override
	public void updateCampaign(int oldCampaign,int newCampaign) {
		this.campaignProportion=newCampaign;
		System.out.println("Yeni kampanya g�ncellendi: %"+campaignProportion);
	}
	
	

}
