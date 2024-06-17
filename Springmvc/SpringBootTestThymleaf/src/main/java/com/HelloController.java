package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //http://localhost:7085/hello ->dispatcher servlet/frontcotnroller-> controller
public class HelloController {
	@GetMapping("/hello")
	public String sayHello(Model theModel)
	{
		theModel.addAttribute("theDate", new java.util.Date());
	//	theModel.addAttribute("myempObj",empobj);
		return "helloWorld";
		
	}

}
