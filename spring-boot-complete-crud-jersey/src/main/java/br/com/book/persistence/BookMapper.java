package br.com.book.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.com.book.input.BookInput;

public interface BookMapper {

	@Insert("insert into book (name, description) values (#{name}, #{description})")
	public void insert(BookInput book);
		
	@Results({
		@Result (property = "name", column = "name"),
		@Result (property = "description", column = "description"),
		@Result (property = "id", column = "id")
	})
	@Select("select * from book")
	public List<BookInput> selectAll();
	
	@Results({
		@Result (property = "name", column = "name"),
		@Result (property = "description", column = "description"),
		@Result (property = "id", column = "id")
	})
	@Select("select * from book where id = #{id}")
	public BookInput selectById(Long id);	
	
	
	@Delete("delete from book where id = #{id}")
	public void deleteById(Long id);
	
	@Update("update book set name = #{name}, description = #{description} where id = #{id}")
	public void update(BookInput book);
	
}
