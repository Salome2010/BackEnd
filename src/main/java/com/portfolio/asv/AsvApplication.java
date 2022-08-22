package com.portfolio.asv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class AsvApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsvApplication.class, args);
	}
        
        @Bean
   public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*").allowedOrigins("https://frontendasvv.web.app/").allowedHeaders("*").allowedMethods("*");
			}
		};
	}
}
