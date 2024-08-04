package com.vti.kshop;

import com.vti.kshop.Entity.Role;
import com.vti.kshop.Entity.User;
import com.vti.kshop.Repository.RoleRepository;
import com.vti.kshop.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class KshopApplication implements CommandLineRunner {
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	private final RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(KshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var user = new User();
		user.setUsername("khieu.nv05");
		user.setPassword(passwordEncoder.encode("khieu.nv05"));
		var ADMIN = roleRepository.findByType(Role.Type.ADMIN);
		var USER = roleRepository.findByType(Role.Type.USER);
		user.setRoles(Set.of(ADMIN,USER));
		userRepository.save(user);
	}
}
