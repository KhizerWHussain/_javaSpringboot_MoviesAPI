package hussain.khizer.MoviesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController

public class MoviesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}

//	@GetMapping("/root")
//	public String bootstrap () {
//		return "Hello world!";
//	}
}
