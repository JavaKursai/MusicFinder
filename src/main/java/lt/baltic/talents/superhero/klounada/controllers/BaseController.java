package lt.baltic.talents.superhero.klounada.controllers;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lt.baltic.talents.superhero.klounada.helpers.MessageHelper;
import lt.baltic.talents.superhero.klounada.models.Filtras;
import lt.baltic.talents.superhero.klounada.models.User;
import lt.baltic.talents.superhero.klounada.services.UserService;

@Controller
public class BaseController {
	
	@Autowired
	private MessageHelper helper;
	
	@Autowired
	private UserService userService;
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String start(@ModelAttribute("filtras") String filtras, Model model) {
		model.addAttribute("filtras", new Filtras());
		System.out.println("Naujas");
		return "hello/base";
	}
	
	@RequestMapping(value = "/sersas", method = RequestMethod.POST)
	public String start(@ModelAttribute("filtras") Filtras filtras, Model model) {
		userService.searchByInput(filtras.getInputText());
		System.out.println(filtras.getInputText());
		return "hello/base";
	}
<<<<<<< HEAD
=======
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException  {

			     String id = req.getParameter("sersas");
			     System.out.println(id);
			}
>>>>>>> master

}
