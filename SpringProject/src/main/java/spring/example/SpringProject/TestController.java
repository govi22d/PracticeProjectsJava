package spring.example.SpringProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/welcome")
	public String welcomepage() {
		return "Welcome to springboot page";
	}

	@RequestMapping("/")
	public String first() {
		return "Welcome to first load";
	}
}
