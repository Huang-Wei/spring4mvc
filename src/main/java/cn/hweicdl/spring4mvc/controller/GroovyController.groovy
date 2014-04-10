package cn.hweicdl.spring4mvc.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class GroovyController {
	@RequestMapping("/groovy")
	public String groovy(
			@RequestParam(value = "name", required = false, defaultValue = "Groovy") String name,
			Model model) {
		model.addAttribute("name", name);
		return "groovy"; // return to ${prefix}/groovy${suffix}
	}
}
