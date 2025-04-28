package in.saffu.feignclientdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "WELCOME-API")
public interface WelcomeFeginClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeApi();

}
