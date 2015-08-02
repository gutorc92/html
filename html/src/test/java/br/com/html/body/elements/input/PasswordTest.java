package br.com.html.body.elements.input;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.html.body.elements.GenerateIds;
import br.com.html.body.elements.input.Password;

public class PasswordTest {

	Password password;
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testBuildWithoutArguments() {
		String id = GenerateIds.nextID();
		password = new Password(id);
		String expected = "<input id=\"" + id + "\" type=\"password\">";
		assertEquals(expected, password.build());
	}
	
	@Test
	public void testBuildWithValue() {
		String id = GenerateIds.nextID();
		password = new Password(id,"Test");
		String expected = "<input id=\"" + id + "\" type=\"password\" "
				+ "value=\"Test\">";
		System.out.println(password.build());
		assertEquals(expected, password.build());
	}
	
	@Test
	public void testBuildWithValueAndText() {
		String id = GenerateIds.nextID();
		password = new Password(id,"Test","Doing test");
		String expected = "<input id=\"" + id + "\" type=\"password\" "
				+ "value=\"Test\"> Doing test";
		System.out.println(password.build());
		assertEquals(expected, password.build());
	}

}
