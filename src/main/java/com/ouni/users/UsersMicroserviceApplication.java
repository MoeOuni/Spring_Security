package com.ouni.users;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ouni.users.entities.Role;
import com.ouni.users.entities.User;
import com.ouni.users.service.UserService;

@SpringBootApplication
public class UsersMicroserviceApplication {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}

	/*@PostConstruct
	void init_users() {
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "USER"));

		userService.saveUser(new User(null, "admin", "admin", true, null));
		userService.saveUser(new User(null, "ouni", "ouni", true, null));
		userService.saveUser(new User(null, "user", "user", true, null));

		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		userService.addRoleToUser("ouni", "USER");
		userService.addRoleToUser("user", "USER");
	}*/
	
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
		
	}

}
