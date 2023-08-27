package com.fenago.spring.security.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

import com.fenago.spring.security.login.models.ERole;
import com.fenago.spring.security.login.models.Role;
import com.fenago.spring.security.login.repository.RoleRepository;

@SpringBootApplication
public class SpringBootSecurityLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityLoginApplication.class, args);
	}

	@Bean
    CommandLineRunner init(RoleRepository roleRepository) {
        return args -> {
            Stream.of("ROLE_USER", "ROLE_MODERATOR", "ROLE_ADMIN").forEach(name -> {
				ERole nameEnum = ERole.valueOf(name);
                Role role = new Role(nameEnum);
                roleRepository.save(role);
            });
            roleRepository.findAll().forEach(System.out::println);
        };
    }

}
