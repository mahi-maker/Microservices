package in.dextris.clint;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Welcome-Api")
public interface WelcomeFeignClint {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg();

}
