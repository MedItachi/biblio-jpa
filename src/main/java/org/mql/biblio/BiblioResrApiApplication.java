package org.mql.biblio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class BiblioResrApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiblioResrApiApplication.class, args);
	}

}
