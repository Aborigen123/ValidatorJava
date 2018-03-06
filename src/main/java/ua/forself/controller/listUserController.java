package ua.forself.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.forself.entity.Profile;
import ua.forself.service.ProfileService;

@Controller
@RequestMapping("/listUser")
public class listUserController {

	ProfileService profileService;
	
	@Autowired 
	public listUserController(ProfileService profileService) {
		this.profileService = profileService;
	}
	
	
	
	
	
	
	@GetMapping("/profile")
	public String showProfile(Model model) {
		Profile file = profileService.findProfileById(1);
		String encodeFile = new String(Base64.encodeBase64(file.getPhoto()));
		model.addAttribute("imageSrc", encodeFile);
		
		return "listUser/profile";
		
	}
	
	
	
	





	///////////////////////////////////////////////////////////////////////////////
	
	@GetMapping("profile/setting")
	public String showSettings() {

		
		return "listUser/profile/setting";
		
	}
	
	@PostMapping("profile/setting")
	public String saveSettings(@RequestParam("photo1")MultipartFile file) throws IOException {

		if(!file.isEmpty() && file != null) {
			Profile profile = new Profile();
			profile.setNamePhoto(file.getOriginalFilename());//поверне  імя загруженого файлу
			profile.setPhoto(file.getBytes());
			profileService.saveProfile(profile);
		}
		
		return "redirect:/listUser/profile";
		
	}
	@PostMapping("/profile/setting/to-project")
	public String saveFileToProject(@RequestParam("photo1") MultipartFile file   ) throws IOException {
		
	String rootPath = System.getProperty("user.dir");
	
	File uploadDir = new File(rootPath + File.separator + "src" +File.separator + "main" + File.separator+ "webapp" + File.separator + "upload");
	
	if(!uploadDir.exists()) uploadDir.mkdir();
	
	if(!file.isEmpty() && file != null) {
		BufferedImage image = ImageIO.read(new ByteArrayInputStream(file.getBytes()));
		File destination = new File(uploadDir.getAbsolutePath() +File.separator + file.getOriginalFilename());
	ImageIO.write(image, "png", destination);
	}
	
	return "redirect:/listUser/profile";
	}
	
	//////////////
	@GetMapping("/profile/setting/from-disk")
	public String saveFileFromDisk(Model model ) throws IOException  {
		
	String rootPath = System.getProperty("user.dir");
	
	File file = new File(rootPath + File.separator + 
			"src" +File.separator +
			"main" + File.separator+ 
			"webapp" + File.separator +
			"upload"+ File.separator);
	byte[] encodeFileToByte = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
			String  encodeFileBase64 = new String (encodeFileToByte);
	model.addAttribute("imageSrc", encodeFileBase64);

	
	return "listUser/profile";
	}
}
