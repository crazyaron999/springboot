package springboot.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("/app")
	public String Helloworld() {

		return "Welcome to RMG MCV-A DevOps Team, DEMO SpringBoot Application 22-02-2024";
	}

}
