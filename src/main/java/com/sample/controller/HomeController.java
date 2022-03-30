package com.sample.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sample.domain.BoardVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//	private BoardService boardservice;
	
	@Autowired
	private test.TestService testservice;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception{
	
		HashMap<String, Object> tempMap = new HashMap<String, Object>();
		model.addAttribute("tempMap", tempMap);
		
		System.out.println(testservice);
		model.addAttribute("list", testservice.listAll());
		System.out.println(testservice.listAll());
	}
	
	
	@RequestMapping(value="/regist", method=RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception{
		
	}
	
	@RequestMapping(value = "/regist", method=RequestMethod.POST)
	public String registerPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		testservice.regist(board);
		return "redirect:/listAll";
	}
	
	@RequestMapping(value = "/read", method=RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		System.out.println(bno);
		model.addAttribute(testservice.read(bno));
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public void modifyGET(int bno, Model model) throws Exception{
		model.addAttribute(testservice.read(bno));
	}
	
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		testservice.modify(board);
		return "redirect:/listAll";
	}
	
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String removePOST(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		testservice.remove(bno);
		return "redirect:/listAll";
	}
	
	
}
