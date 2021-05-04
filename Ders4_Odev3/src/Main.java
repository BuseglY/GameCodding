
public class Main {

	public static void main(String[] args) {
		Player realPlayer=new Player("12345678910","Buse","Yýlmaz",1998);
		Player fakePlayer=new Player("12345678910","Tuðçe","Nur",1997);
		
		PlayerManager playerManager=new PlayerManager();
		playerManager.registerThePlayer(realPlayer);
		playerManager.registerThePlayer(fakePlayer);
		
		playerManager.updateThePlayer(realPlayer);
		playerManager.updateThePlayer(fakePlayer);
		
		playerManager.deleteThePlayer(realPlayer);
		playerManager.deleteThePlayer(fakePlayer);
		
		GameSaleManager sale=new GameSaleManager();
		sale.gameSale(realPlayer);
		sale.gameSale(fakePlayer);
		
		CampaignManager campainManager=new CampaignManager();
		campainManager.addCampaign(30);
		campainManager.deleteCampaign(30);
		campainManager.updateCampaign(30, 60);

		
		

	}

}
