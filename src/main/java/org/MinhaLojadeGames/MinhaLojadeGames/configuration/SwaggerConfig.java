package org.MinhaLojadeGames.MinhaLojadeGames.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI springLojaeGamesOpenAPI () {
		return new OpenAPI()
					.info(new Info()
						.title ("Loja de Games")
						.description ("Loja de Games - Generation Brasil")
						.version ("v0.0.1")
						.license(new License()
								.name("Generation Brasil")
								.url("http://brazil,genaeration,org/"))
						.contact (new Contact()
								.name("GitHub Pedro Borelli")
								.url("https://github.com/pedro-borelli/")
								.email("pedroborelli@gmail.com")))
					.externalDocs (new ExternalDocumentation()
							.description("GitHub")
							.url("https://github.com/pedro-borelli/LojaDeGames"));
	}
}
