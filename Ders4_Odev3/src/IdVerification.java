public class IdVerification implements CheckPlayerService {

	@Override
	public boolean checkPlayerInfo(Player player) {
			if(player.getId()=="12345678910" && player.getFirstName()=="Buse" && player.getLastName()=="Yýlmaz" &&
					player.getDateOfBirth()==1998) {
			return true;
		}
		
		else
			return false;
		
	}

}
