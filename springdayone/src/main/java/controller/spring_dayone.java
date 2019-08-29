package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import Pojo.Book;
import dao.Book_Dao;
import service.Book_Service;

@Controller
@RequestMapping("Book")
public class spring_dayone {
	@Autowired
	Book_Service dao;
	
	@RequestMapping("index")
	public void jumpjsp(String txt,ModelMap m) {
		m.put("a",txt);
	}
	
	
	@RequestMapping("select")
	public List<Book> select(String txt){
		return dao.selectByname(txt);
	}
	

}
