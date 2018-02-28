package ua.forself.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ua.forself.entity.Registration;
import ua.forself.service.RegService;



@Controller
public class BaseController {

	
	@GetMapping("/")
	public String showHome() {
		
		
		return "home";
		
	}


}
