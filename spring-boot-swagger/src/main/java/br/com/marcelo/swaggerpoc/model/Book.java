package br.com.marcelo.swaggerpoc.model;

import io.swagger.annotations.ApiModelProperty;

public class Book {

	@ApiModelProperty(notes = "The id of the book", required = true)
	private Long id;
	
    @ApiModelProperty(notes = "The title of the book", required = true)
	private String title;
    
    @ApiModelProperty(notes = "The author of the book", required = true)
	private String author;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
