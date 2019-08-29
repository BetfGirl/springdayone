package Dao_Service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pojo.Book;
import service.Book_Service;
@Service
public class Book_Service_Impl implements Book_Service {
	@Autowired
	Book_Service bs;
	
	public List<Book> selectByname(String name) {
		return bs.selectByname(name);
	}
	
}
