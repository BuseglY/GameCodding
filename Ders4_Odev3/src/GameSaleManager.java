public class GameSaleManager extends CampaignManager implements GameSaleService {
	public void gameSale(Player player) {
		if(campaign(player))
		System.out.println("Say�n "+player.getFirstName()+" %"+campaignProportion+" indirim ile oyun al�m�n�z ger�ekle�tirilmi�tir.");
		else
			System.out.println("Kimli�iniz do�rulanamad��� i�in oyun al�m�n�z ge�ersizdir.");
	}

}
