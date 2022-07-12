package fanfic.sharing.jpmg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "fanfic.sharing.jpmg.controller")
public class JpmgApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpmgApplication.class, args);
	}

}
