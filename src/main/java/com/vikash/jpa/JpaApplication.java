package com.vikash.jpa;

import com.vikash.jpa.models.Author;
import com.vikash.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository){
		return authorRepo -> {
			var author = Author.builder()
					.firstName("Vikash")
					.lastName("Singh")
					.age(222)
					.email("vikash.singh@gmail.com")
					.build();
			authorRepository.save(author);
		};
	}
}
