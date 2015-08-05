package br.com.html.body.elements.input;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.html.body.elements.GenerateIds;
import br.com.html.body.elements.input.Text;

public class TextTest {

	Text text;
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testBuildWithoutArguments() {
		String id = GenerateIds.nextID();
		text = new Text(id);
		String expected = "<input id=\"" + id + "\" type=\"text\">";
		assertEquals(expected, text.build());
	}
	
	@Test
	public void testBuildWithValue() {
		String id = GenerateIds.nextID();
		text = new Text(id,"Test");
		text.setId(id);
		String expected = "<input id=\"" + id + "\" type=\"text\" "
				+ "value=\"Test\">";
		System.out.println(text.build());
		assertEquals(expected, text.build());
	}
	
	@Test
	public void testBuildWithValueAndText() {
		String id = GenerateIds.nextID();
		text = new Text(id,"Test","Doing test");
		String expected = "<input id=\"" + id + "\" type=\"text\" "
				+ "value=\"Test\">Doing test";
		System.out.println(text.build());
		assertEquals(expected, text.build());
	}

}
