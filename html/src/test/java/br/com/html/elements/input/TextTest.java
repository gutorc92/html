package br.com.html.elements.input;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.html.elements.GenerateIds;

public class TextTest {

	Text text;
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testBuildWithoutArguments() {
		String id = GenerateIds.nextID();
		text = new Text();
		text.setId(id);
		String expected = "<input id=\"" + id + "\" type=\"text\">";
		assertEquals(expected, text.build());
	}
	
	@Test
	public void testBuildWithValue() {
		String id = GenerateIds.nextID();
		text = new Text("Test");
		text.setId(id);
		String expected = "<input id=\"" + id + "\" type=\"text\" "
				+ "value=\"Test\">";
		System.out.println(text.build());
		assertEquals(expected, text.build());
	}
	
	@Test
	public void testBuildWithValueAndText() {
		String id = GenerateIds.nextID();
		text = new Text("Test","Doing test");
		text.setId(id);
		String expected = "<input id=\"" + id + "\" type=\"text\" "
				+ "value=\"Test\"> Doing test";
		System.out.println(text.build());
		assertEquals(expected, text.build());
	}

}
