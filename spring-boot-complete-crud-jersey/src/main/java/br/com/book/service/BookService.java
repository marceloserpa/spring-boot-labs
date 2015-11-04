package br.com.book.service;

import java.util.List;

import br.com.book.input.BookInput;
import br.com.book.persistence.BookMapper;

public class BookService {

	private BookMapper bookMapper;
	
	public BookService(BookMapper bookMapper){
		this.bookMapper = bookMapper;
	}
	
	public void save(BookInput book){
		this.bookMapper.insert(book);
	}
	
	public List<BookInput> getAll(){
		return this.bookMapper.selectAll();
	}
	
	public BookInput getOne(Long id){
		return this.bookMapper.selectById(id);
	}
	
	public void delete(Long id){
		this.bookMapper.deleteById(id);		
	}
	
	public void update(BookInput book){
		this.bookMapper.update(book);		
	}
	
}
