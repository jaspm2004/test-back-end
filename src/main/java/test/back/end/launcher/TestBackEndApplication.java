package test.back.end.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"test.back.end.service", "test.back.end.api, test.back.end.model, test.back.end.swagger"})
public class TestBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestBackEndApplication.class, args);
	}
}