package com.jwtsecurity;

import com.jwtsecurity.model.Role;
import com.jwtsecurity.model.User;
import com.jwtsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User normalUser = userRepository.findByRole(Role.USER);

		if(normalUser == null){
			User user = new User();

			user.setEmail("soham@gmail.com");
			user.setFirstname("Soham");
			user.setLastname("Adhyapak");
			user.setPassword(new BCryptPasswordEncoder().encode("soham"));
			user.setRole(Role.USER);

			userRepository.save(user);
		}
	}
}
