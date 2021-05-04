public class PlayerManager extends IdVerification implements PlayerService{

	@Override
	public void registerThePlayer(Player player) { 
		if(checkPlayerInfo(player)) {
			System.out.println("Sisteme kay�t edildiniz Say�n : "+player.getFirstName());
		}
		else
			System.out.println("Kimli�iniz do�rulanamad�. Kay�t i�leminiz ger�ekle�tirilemedi.");
	}

	@Override
	public void updateThePlayer(Player player) {
		if(checkPlayerInfo(player)) {
			System.out.println("Bilgileriniz g�ncellendi Say�n : "+player.getFirstName());
		}
		else
			System.out.println("Kimli�iniz do�rulanamad�. G�ncelleme i�leminiz ger�ekle�tirilemedi.");
	}

	@Override
	public void deleteThePlayer(Player player) {
		if(checkPlayerInfo(player)) {
			System.out.println("Bilgileriniz silindi.");
		}
		else
			System.out.println("Kimli�iniz do�rulanamad�. Silme i�leminiz ger�ekle�tirilemedi.");
	}
	
	

}
