package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello Java Bootcamp";
	}
}
