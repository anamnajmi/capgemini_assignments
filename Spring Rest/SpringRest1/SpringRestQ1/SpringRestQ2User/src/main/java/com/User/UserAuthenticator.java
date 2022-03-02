package com.User;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserAuthenticator {
@RequestMapping("/match")
public ModelAndView checkAuthentication(@RequestParam("username") String u,@RequestParam("password") String p) {
	ArrayList<NewUser>l = new ArrayList<NewUser>();
	ModelAndView mv = new ModelAndView();
	NewUser user1 = new NewUser();
	NewUser user2 = new NewUser(); 
	user1.setUser("adam");
	user1.setPassword("adam");
	user2.setUser("max");
	user2.setPassword("max");
	l.add(user1);
	l.add(user2);
	for(NewUser t: l) {
		if(u.equals(t.getUser()) && p.equals(t.getPassword())) {
			mv.setViewName("success.jsp");
		}
		else
			mv.setViewName("error.jsp");
	}
	return mv;
}
}
