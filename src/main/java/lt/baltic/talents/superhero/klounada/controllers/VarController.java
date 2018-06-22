package lt.baltic.talents.superhero.klounada.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lt.baltic.talents.superhero.klounada.models.User;
import lt.baltic.talents.superhero.klounada.models.Vartotojas;
import lt.baltic.talents.superhero.klounada.services.UserService;
import lt.baltic.talents.superhero.klounada.services.VarService;

@Controller
@RequestMapping("/login")
public class VarController {
	
	@Autowired
    private VarService varService;
	
	@RequestMapping(value = "testCreate", method = RequestMethod.GET)
	public String login(Model model) {
		varService.create(new Vartotojas("OOOOO", "xzxzcxzcxzc".toCharArray()));
		
		return "login/failure";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model, 
			@RequestParam(value = "user", required = false) String userParam,
			@RequestParam(value = "pwd", required = false) String pwd, RedirectAttributes redirectAttributes) {
		
		if (userParam == null || pwd == null) { 
			return "login/failure"; 
		}
		
		Vartotojas var = new Vartotojas(userParam, pwd.toCharArray());
		
		boolean login = varService.login(var);
		
		if (login) {
			redirectAttributes.addFlashAttribute("user", var);
			return "redirect:/";
		}
		
		return "login/failure";
	}

}
