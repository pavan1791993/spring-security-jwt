package com.demo.sec.bean;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
	USER;

	@Override
	public String getAuthority() {
		return name();
	}
}
