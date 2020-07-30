package com.saurabh.userdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserDatabaseApplication implements CommandLineRunner {
	
	@Autowired
	UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(UserDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepo.deleteAll();
		
		userRepo.save(new User("Tarun", 22));
		userRepo.save(new User("Varun", 26));
		userRepo.save(new User("Divya", 22));
		userRepo.save(new User("Anand", 23));
		
		userRepo.findAll().forEach(user -> System.out.println(user.toString()));
		
	}

}
