package br.com.marcelo.swaggerpoc.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelo.swaggerpoc.model.Book;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class BookController {
	
	private List<Book> books = new ArrayList<Book>();
	
    @ApiOperation(value = "Get all books", nickname = "books", notes="Get all books - notes")
    @RequestMapping(method = RequestMethod.GET,value="/books")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = Book.class),
            @ApiResponse(code = 404, message = "Not Found")})  
	public List<Book> getAll(){
		return this.books;
	}
	
    @ApiOperation(value = "Get book by id", nickname = "getBook", notes="Get book by id")
    @RequestMapping(method = RequestMethod.GET,value="/books/{id}")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = Book.class),
            @ApiResponse(code = 404, message = "Not Found")})  
	public Book getBook(@PathVariable("id") Long id){
		return this.books.stream().filter(b -> b.getId() == id).findFirst().get();
	}

    @ApiOperation(value = "Create a new book", nickname = "books", notes="Create a new book")
	@RequestMapping(method = RequestMethod.POST,value="/books")
	public void save(@RequestBody Book book){
		this.books.add(book);
	}
	
}
