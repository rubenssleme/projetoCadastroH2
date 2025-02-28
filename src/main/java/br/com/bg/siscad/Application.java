package br.com.bg.siscad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//Ajuste
@SpringBootApplication
public class Application {



	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class)
				.headless(false)
				.run(args);

	}
}
