package com.example.care_management_system;

//import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.care_management_system.entity")
//@EnableJpaRepositories("com.example.care_management_system.repository")
public class CareManagementSystemApplication {

	public static void main(String[] args) {
//        Dotenv dotenv = Dotenv.load();
        SpringApplication.run(CareManagementSystemApplication.class, args);
	}

}
