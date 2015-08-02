package br.com.html.elements.input;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.html.elements.GenerateIds;

public class PasswordTest {

	Password password;
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testBuildWithoutArguments() {
		String id = GenerateIds.nextID();
		password = new Password();
		password.setId(id);
		String expected = "<input id=\"" + id + "\" type=\"password\">";
		assertEquals(expected, password.build());
	}
	
	@Test
	public void testBuildWithValue() {
		String id = GenerateIds.nextID();
		password = new Password("Test");
		password.setId(id);
		String expected = "<input id=\"" + id + "\" type=\"password\" "
				+ "value=\"Test\">";
		System.out.println(password.build());
		assertEquals(expected, password.build());
	}
	
	@Test
	public void testBuildWithValueAndText() {
		String id = GenerateIds.nextID();
		password = new Password("Test","Doing test");
		password.setId(id);
		String expected = "<input id=\"" + id + "\" type=\"password\" "
				+ "value=\"Test\"> Doing test";
		System.out.println(password.build());
		assertEquals(expected, password.build());
	}

}
