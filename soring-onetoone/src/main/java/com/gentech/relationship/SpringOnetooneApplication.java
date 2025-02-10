package com.gentech.relationship;

import com.gentech.relationship.entity.User;
import com.gentech.relationship.entity.UserProfile;
import com.gentech.relationship.repository.UserProfileRepository;
import com.gentech.relationship.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOnetooneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringOnetooneApplication.class, args);
	}

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private UserProfileRepository userProfileRepo;

	@Override
	public void run(String... args) throws Exception {

		// Creaet User
		User oUser=new User();
		oUser.setUserName("Santosh");
		oUser.setJobName("Sales VP");

		UserProfile oProfile=new UserProfile();
		oProfile.setEmailId("santosh@gss.com");
		oProfile.setPhoneNumber(9010203456L);
		oProfile.setCityName("Bangalore");
		oProfile.setAddress("7th Main, 1st F cross Road Attiguppe");

		oUser.setUserProfile(oProfile);
		oProfile.setUser(oUser);

		userRepo.save(oUser);
		

	}
}
