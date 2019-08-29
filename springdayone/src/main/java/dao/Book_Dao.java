package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import Pojo.Book;
@Repository
public interface Book_Dao{
	@Select("select * from book where book.name=${BookName}")
	public List<Book> selectByname(@Param("name") String BookName);
}
