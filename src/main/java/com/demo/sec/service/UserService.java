package com.demo.sec.service;

import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.demo.sec.bean.User;
import com.demo.sec.bean.UserRole;

public class UserService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("pavan".equals(username)) {
			User user = new User();
			user.setUsername("pavan");
			user.setPassword("password");
			user.setAuthorities(Collections.singleton(UserRole.USER));
			return user;
		}
		throw new UsernameNotFoundException(username);
	}

}
