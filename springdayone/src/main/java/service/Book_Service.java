package service;

import java.util.List;

import Pojo.Book;

public interface Book_Service{
	public List<Book> selectByname(String name);
}
