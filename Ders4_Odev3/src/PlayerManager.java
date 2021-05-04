public class PlayerManager extends IdVerification implements PlayerService{

	@Override
	public void registerThePlayer(Player player) { 
		if(checkPlayerInfo(player)) {
			System.out.println("Sisteme kayýt edildiniz Sayýn : "+player.getFirstName());
		}
		else
			System.out.println("Kimliðiniz doðrulanamadý. Kayýt iþleminiz gerçekleþtirilemedi.");
	}

	@Override
	public void updateThePlayer(Player player) {
		if(checkPlayerInfo(player)) {
			System.out.println("Bilgileriniz güncellendi Sayýn : "+player.getFirstName());
		}
		else
			System.out.println("Kimliðiniz doðrulanamadý. Güncelleme iþleminiz gerçekleþtirilemedi.");
	}

	@Override
	public void deleteThePlayer(Player player) {
		if(checkPlayerInfo(player)) {
			System.out.println("Bilgileriniz silindi.");
		}
		else
			System.out.println("Kimliðiniz doðrulanamadý. Silme iþleminiz gerçekleþtirilemedi.");
	}
	
	

}
