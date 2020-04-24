package kr.co.rental_phone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RentalPhoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentalPhoneApplication.class, args);
	}

}
