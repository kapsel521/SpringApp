package pl.teb;

public class UserValidationService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("TEB") && password.equals("edukacja");
	}

}