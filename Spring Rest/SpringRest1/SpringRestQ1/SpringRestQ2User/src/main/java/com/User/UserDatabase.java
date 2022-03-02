package com.User;

import java.util.ArrayList;

public class UserDatabase {
	public ArrayList<NewUser>l = new ArrayList<NewUser>();
	public ArrayList setDatabase() {
	NewUser user1 = new NewUser();
	NewUser user2 = new NewUser(); 
	user1.setUser("adam");
	user1.setPassword("adam");
	user2.setUser("max");
	user2.setPassword("max");
	l.add(user1);
	l.add(user2);
	return l;
}}
