package br.com.html.body.elements.input;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.html.GenerateIds;

public class EmailTest {

	Email email;
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testBuildWithoutArguments() {
		String id = GenerateIds.nextID();
		email = new Email(id);
		String expected = "<input id=\"" + id + "\" type=\"email\">";
		assertEquals(expected, email.build());
	}
	
	@Test
	public void testBuildWithValue() {
		String id = GenerateIds.nextID();
		email = new Email(id,"Test");
		String expected = "<input id=\"" + id + "\" type=\"email\" "
				+ "value=\"Test\">";
		System.out.println(email.build());
		assertEquals(expected, email.build());
	}
	
	@Test
	public void testBuildWithValueAndText() {
		String id = GenerateIds.nextID();
		email = new Email(id,"Test","Doing test");
		String expected = "<input id=\"" + id + "\" type=\"email\" "
				+ "value=\"Test\">Doing test";
		System.out.println(email.build());
		assertEquals(expected, email.build());
	}

}
