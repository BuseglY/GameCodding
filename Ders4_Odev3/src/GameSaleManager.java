public class GameSaleManager extends CampaignManager implements GameSaleService {
	public void gameSale(Player player) {
		if(campaign(player))
		System.out.println("Sayın "+player.getFirstName()+" %"+campaignProportion+" indirim ile oyun alımınız gerçekleştirilmiştir.");
		else
			System.out.println("Kimliğiniz doğrulanamadığı için oyun alımınız geçersizdir.");
	}

}
