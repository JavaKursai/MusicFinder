package lt.baltic.talents.superhero.klounada.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lt.baltic.talents.superhero.klounada.models.User;
import lt.baltic.talents.superhero.klounada.services.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "testCreate", method = RequestMethod.GET)
	public String login(Model model) {
		//userService.create(new User("OOOOO", "xzxzcxzcxzc".toCharArray(), 456));
		boolean login = userService.login();
		return "login/failure";
		//nigalima
	}

	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model, @RequestParam(value = "author", required = false) String authorParam,
			@RequestParam(value = "songName", required = false) String songParam, RedirectAttributes redirectAttributes,
			@RequestParam(value = "popularity", required = false) int popularityParam) {

//		if (songParam == null || songParam == null) {
//			return "Can't find your request or nothing was typed in";
//		}

	//	User user = new User(authorParam, songParam.toCharArray(), popularityParam);

		boolean login = userService.login();

//		if (login) {
//			redirectAttributes.addFlashAttribute("user", user);
//			return "redirect:/";
//		}
//		return "Can't find your request or nothing was typed in";
		
		return "";
	}
}
