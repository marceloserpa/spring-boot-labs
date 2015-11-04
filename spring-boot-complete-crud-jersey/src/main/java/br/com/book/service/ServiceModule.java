package br.com.book.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.book.persistence.BookMapper;

@Configuration
public class ServiceModule {

	@Bean
	public BookService bookService(BookMapper bookMapper){
		return new BookService(bookMapper);
	}
	
}
