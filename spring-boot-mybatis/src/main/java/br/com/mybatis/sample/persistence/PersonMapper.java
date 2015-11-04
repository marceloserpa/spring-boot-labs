package br.com.mybatis.sample.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import br.com.mybatis.sample.model.Person;

public interface PersonMapper {
	
	@Insert("insert into person (name, age) values(#{name}, #{age})")
	@Options(useGeneratedKeys=true, keyColumn="id", keyProperty="id")
    public Long save(Person person);
	
	@Results({
		@Result (property = "name", column = "name"),
		@Result (property = "id", column = "id"),
		@Result (property = "age", column = "age")
	})	
	@Select("select * from person")	
	public List<Person> getAll();
	
}
