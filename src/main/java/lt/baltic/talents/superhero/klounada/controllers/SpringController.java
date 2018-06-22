package lt.baltic.talents.superhero.klounada.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lt.baltic.talents.superhero.klounada.models.User;
import lt.baltic.talents.superhero.klounada.services.UserService;

@Controller
@RequestMapping("/loginas")
public class SpringController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "testas", method = RequestMethod.GET)
	public String start(Model model) {
		
		List<User> list = userService.getList();
		
		model.addAttribute("musuDainos", list);
		return "hello/base";
	}
}
