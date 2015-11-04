package br.com.book.endpoint;


import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.book.input.BookInput;
import br.com.book.service.BookService;

@Component
@Path("/book")
public class RestEndpoint {
	
	@Autowired BookService bookService;

	@POST	
	public Response add(BookInput book){	
		this.bookService.save(book);
		return Response.status(Status.CREATED).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<BookInput> getAll(){
		return this.bookService.getAll();
	}
		
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public BookInput getOne(@PathParam("id") Long id){
		return this.bookService.getOne(id);
	}
	
	@DELETE
	@Path("/{id}")
	public void remove(@PathParam("id") Long id){
		this.bookService.delete(id);		
	}
	
	@PUT	
	@Path("/{id}")
	public void update(@PathParam("id") Long id, BookInput book){
		book.setId(id);
		this.bookService.update(book);
	}
	
}
