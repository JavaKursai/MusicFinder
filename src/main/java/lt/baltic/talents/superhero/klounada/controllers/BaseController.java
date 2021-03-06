package lt.baltic.talents.superhero.klounada.controllers;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		return "hello/base";
	}
	
	@RequestMapping(value = "/sersas", method = RequestMethod.POST)
	public String start(@ModelAttribute("filtras") Filtras filtras, Model model) {
		userService.searchByInput(filtras.getInputText());
//		System.out.println(filtras.getInputText());
//		System.out.println(filtras.getInputInt());
		if(filtras.getInputInt().equals("1")) {
			List<User> list = userService.getBySongName(filtras.getInputText());
			model.addAttribute("musuDainos", list);
		}
		
		if(filtras.getInputInt().equals("2")) {
			List<User> list = userService.getByAuthor(filtras.getInputText());
			model.addAttribute("musuDainos", list);
		}
		
		if(filtras.getInputInt().equals("0")) {
			List<User> listOne = userService.getBySongName(filtras.getInputText());
			List<User> listTwo = userService.getByAuthor(filtras.getInputText());
			Set<User> fooSet = new LinkedHashSet<>(listOne);
			fooSet.addAll(listTwo);
			List<User> list = new ArrayList<>(fooSet);
			model.addAttribute("musuDainos", list);
		}
		
		return "hello/base";
	}
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException  {

			     String id = req.getParameter("sersas");
			     System.out.println(id);
			}

}
