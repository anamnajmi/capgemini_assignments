package com.SecurityConfig;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.mysql.cj.protocol.AuthenticationProvider;

public class SecurityConfiguration {
	@Autowired
	private UserDetailsService userDeatilsService;


	//@Bean
//protected UserDetailsService userDetailsServive() {
//	ArrayList<UserDetails> users = new ArrayList();
//	users.add(User.withDefaultPasswordEncoder().username("nikhil").password("1234").roles("User").build());
//	return new InMemoryUserDetailsManager(users);
//	
//}
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDeatilsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return (AuthenticationProvider) provider;
	}
 protected void configure(HttpSecurity http) throws Exception{
	 http.csrf().disable().authorizeRequests().antMatchers("/login").permitAll().
	 anyRequest().authenticated().
	 and().formLogin().loginPage("/login").
      permitAll().and().
      logout().invalidateHttpSession(true).
      clearAuthentication(true).
      logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
 }
	
	
}
