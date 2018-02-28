package ua.forself.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.forself.entity.Autorization;
import ua.forself.entity.Registration;
import ua.forself.service.AutoService;
import ua.forself.service.RegService;

@Controller
@RequestMapping("/access")
public class AccessController {
	
	@Autowired 
	private RegService regService;
	@Autowired 
	private AutoService autoService;
	
	@GetMapping("/access1")
	public String showAccess(Model model) {
		model.addAttribute("accessModel", new Autorization());
		
		return "access/access1";
		
	}
	
	@PostMapping("/access1")
	public String addAccess(@ModelAttribute("accessModel") @Valid Autorization autorization,
		BindingResult result) {

//if(result.hasErrors()) {
//	return "access/error";
//}
		autoService.findAllAutorization();
	return "redirect:/";
	}	

	
	@GetMapping("/error")
	public String showError(Model model) {
		
		
		return "access/error";
		
	}
	
	@GetMapping("/registration")
	public String showRegistration(Model model) {
		model.addAttribute("registrationModel", new Registration());
	model.addAttribute("autorizationModel", new Autorization());
		return "access/registration";
		
	}
	
	@PostMapping("/registration")
	public String addRegistration(@ModelAttribute("registrationModel")   @Valid Registration registration, 
			@ModelAttribute("autorizationModel")@Valid Autorization autorization,
			BindingResult result) {

//	if(result.hasErrors()) {
//		return "access/error";
//	}
	
	regService.saveRegistation(registration);
	autoService.saveAutorization(autorization);
	return "redirect:/";
	}	
}
