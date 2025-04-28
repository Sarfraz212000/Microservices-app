package in.saffu.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.saffu.feignclientdemo.WelcomeFeginClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeFeginClient welcomeFeginClient;
	
	@GetMapping("/greet")
	public String greetMsg() {
		
		String welcomeresponse = welcomeFeginClient.invokeWelcomeApi();
		String greetResponse = "good morning";
		
		return greetResponse+welcomeresponse;
	}

}
