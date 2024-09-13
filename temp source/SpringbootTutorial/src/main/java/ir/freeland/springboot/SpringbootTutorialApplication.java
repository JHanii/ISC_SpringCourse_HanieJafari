package ir.freeland.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("ir.freeland.springboot.persistence.repo")
@EntityScan("ir.freeland.springboot.persistence.model")
public class SpringbootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutorialApplication.class, args);
	}

}
