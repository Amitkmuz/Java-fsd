package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.user.UserAuthentication;

class UserAuthenticationTest {

private UserAuthentication au;
	
	@BeforeEach
	public void setup() {
		au= new UserAuthentication();
		System.out.println("Authentication User main class inititated");
	}
	
	@AfterEach
	public void tearDown() {
		au=null;
		System.out.println("Class Closed");
	}
	
	@Test
	public void checkUser() {
		assertEquals("amit@gmail.com", au.username());
	}
	@Test
	public void checkUserNull()
	{
		assertNotNull(au.username());
	}
	
	@Test
	public void checkPass() {
		assertEquals("123", au.paswd());
	}
	
	@Test
	public void checkPassNull()
	{
		assertNotNull(au.paswd());
	}
	
	@Test
	public void checkUserRegx()
	{
		String email = au.username();
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		
		assertEquals(true, matcher.matches());
	}

	

}
