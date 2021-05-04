public class GameSaleManager extends CampaignManager implements GameSaleService {
	public void gameSale(Player player) {
		if(campaign(player))
		System.out.println("Sayýn "+player.getFirstName()+" %"+campaignProportion+" indirim ile oyun alýmýnýz gerçekleþtirilmiþtir.");
		else
			System.out.println("Kimliðiniz doðrulanamadýðý için oyun alýmýnýz geçersizdir.");
	}

}
