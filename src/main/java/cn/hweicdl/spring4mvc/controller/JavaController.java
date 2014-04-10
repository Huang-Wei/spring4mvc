package cn.hweicdl.spring4mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JavaController {
	@RequestMapping("/java")
	public String java(
			@RequestParam(value = "name", required = false, defaultValue = "Java") String name,
			Model model) {
		model.addAttribute("name", name);
		return "java"; // return to ${prefix}/java${suffix}
	}
}
