package com.indexial;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String userName;
	private String password;
	static {
		System.out.println("User ClassLoaded");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "\n[userName=" + userName + ", password=" + password + "]";
	}

	public User() {
		super();
	}

}
