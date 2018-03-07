package ua.forself.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.forself.domain.RegistrationRequest;
import ua.forself.entity.Autorization;
import ua.forself.entity.Registration;
import ua.forself.mapper.RegistrationMapper;
import ua.forself.service.AutoService;
import ua.forself.service.RegService;

@Controller
@RequestMapping("/access")
public class AccessController {
	

	private RegService regService; 
	private AutoService autoService;
	

	
	
	
	
	@Autowired 
	public AccessController(RegService regService, AutoService autoService) {
		this.regService = regService;
		this.autoService = autoService;
	}

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

	return "redirect:/listUser/profile";
	}	

	
	@GetMapping("/error")
	public String showError(Model model) {
		
		
		return "access/error";
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
	@GetMapping("/registration")
	public String showRegistration(Model model) {
		model.addAttribute("registrationModel", new RegistrationRequest());
	model.addAttribute("autorizationModel", new Autorization());
		return "access/registration";
		
	}
	
	@PostMapping("/registration")
	public String addRegistration(@ModelAttribute("registrationModel")   @Valid RegistrationRequest registrationRequest, 
			@ModelAttribute("autorizationModel")@Valid Autorization autorization,
			BindingResult result) {
//
//	if(result.hasErrors()) {
//		return "access/error";
//	}
//	
		Registration registration = RegistrationMapper.toRegistration(registrationRequest);
	regService.saveRegistation(registration);
	autoService.saveAutorization(autorization);
	
	

	return "redirect:/listUser/profile";
	}	
	
//	@PostMapping("registration")
//	public String saveFileToProject(@RequestParam("photo1") MultipartFile file   ) throws IOException {
//		
//	String rootPath = System.getProperty("user.dir");
//	
//	File uploadDir = new File(rootPath + File.separator + "src" +File.separator + "main" + File.separator+ "webapp" + File.separator + "upload");
//	
//	if(!uploadDir.exists()) uploadDir.mkdir();
//	
//	if(!file.isEmpty() && file != null) {
//		BufferedImage image = ImageIO.read(new ByteArrayInputStream(file.getBytes()));
//		File destination = new File(uploadDir.getAbsolutePath() +File.separator + file.getOriginalFilename());
//	ImageIO.write(image, "png", destination);
//	}
//	
//	return "redirect:/listUser/profile";
//	}
	
	
//	@GetMapping("registration")
//	public String saveFileFromDisk(Model model ) throws IOException  {
//		
//	String rootPath = System.getProperty("user.dir");
//	
//	File file = new File(rootPath + File.separator + 
//			"src" +File.separator +
//			"main" + File.separator+ 
//			"webapp" + File.separator +
//			"upload"+ File.separator);
//	byte[] encodeFileToByte = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
//			String  encodeFileBase64 = new String (encodeFileToByte);
//	model.addAttribute("imageSrc", encodeFileBase64);
//
//	
//	return "listUser/profile";
//	}
}
