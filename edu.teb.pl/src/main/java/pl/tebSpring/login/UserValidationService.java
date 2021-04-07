package pl.tebSpring.login;

import org.springframework.stereotype.Service;

//chcemy żeby po wywołaniu tej klasy nasz Spring tworzył od razu: new UserValidationService()
@Service
public class UserValidationService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("TEB") && password.equals("edukacja");
	}

}