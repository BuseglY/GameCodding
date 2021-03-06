public class PlayerManager extends IdVerification implements PlayerService{

	@Override
	public void registerThePlayer(Player player) { 
		if(checkPlayerInfo(player)) {
			System.out.println("Sisteme kayıt edildiniz Sayın : "+player.getFirstName());
		}
		else
			System.out.println("Kimliğiniz doğrulanamadı. Kayıt işleminiz gerçekleştirilemedi.");
	}

	@Override
	public void updateThePlayer(Player player) {
		if(checkPlayerInfo(player)) {
			System.out.println("Bilgileriniz güncellendi Sayın : "+player.getFirstName());
		}
		else
			System.out.println("Kimliğiniz doğrulanamadı. Güncelleme işleminiz gerçekleştirilemedi.");
	}

	@Override
	public void deleteThePlayer(Player player) {
		if(checkPlayerInfo(player)) {
			System.out.println("Bilgileriniz silindi.");
		}
		else
			System.out.println("Kimliğiniz doğrulanamadı. Silme işleminiz gerçekleştirilemedi.");
	}
	
	

}
