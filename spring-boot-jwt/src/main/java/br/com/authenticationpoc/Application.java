package br.com.authenticationpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean(){
		FilterRegistrationBean filter = new FilterRegistrationBean();
		filter.addUrlPatterns("/outher/*");
		filter.setFilter(new AuthFilter());
		return filter;
	}
}
