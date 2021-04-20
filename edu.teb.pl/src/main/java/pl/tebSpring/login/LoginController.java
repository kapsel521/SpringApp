package pl.tebSpring.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	//Auto wiring za pomocą Springa:
	@Autowired
	UserValidationService service;
	

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handleRequestLogin(@RequestParam String name, 
			@RequestParam String password, ModelMap model) {
		
		if(service.validateUser(name, password)){
		model.put("name", name);
		model.put("password", password);
		return "welcome";
		}else {
			model.put("errorMessage", "Złe dane logowania!");
			return "login";
		}
	}
}
