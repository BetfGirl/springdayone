package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class spring_dayone {

	@RequestMapping("index")
	public void jumpjsp(String txt,ModelMap m) {
		m.put("a",txt);
	}

	

}
