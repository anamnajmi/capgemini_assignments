package com.newRest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	@RequestMapping("/show")
	@ResponseBody
public List<String> showData(@RequestParam("zipcode") int z) {
	List<Person> l = new ArrayList();
	Person p = new Person();
	p.setCity("Vizag");
	p.setState("A.P");
	p.setCountry("India");
	p.setZipcode(530046);
	Person p1 = new Person();
	p1.setCity("Jalandhar");
	p1.setState("Punjab");
	p1.setCountry("India");
	p1.setZipcode(144411);
	l.add(p1);
	l.add(p);
	List<String>sub =  new ArrayList();
	for(Person q : l) {
		if(q.getZipcode()==z) {
			sub.add(q.getCity());
			sub.add(q.getState());
			sub.add(q.getCountry());
		}
	}
	return sub;
}
}
