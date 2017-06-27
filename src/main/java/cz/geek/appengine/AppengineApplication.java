package cz.geek.appengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AppengineApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AppengineApplication.class, args);
	}
}
