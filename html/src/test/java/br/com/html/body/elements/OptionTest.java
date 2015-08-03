package br.com.html.body.elements;

import static org.junit.Assert.*;

import org.junit.Test;

public class OptionTest {

	Option option;
	
	@Test
	public void testConstructorWithoutElements() {
		option = new Option();
		String expected = "<option value=\"\"></option>";
		assertEquals(expected, option.build());
	}
	
	@Test
	public void testConstructorWithElements() {
		option = new Option(GenerateIds.nextID(),"1","Test");
		String expected = "<option value=\"1\">Test</option>";
		assertEquals(expected, option.build());
	}
	
	@Test
	public void testGets(){
		option = new Option(GenerateIds.nextID(),"1","Test");
		String expected = "1";
		assertEquals(expected, option.getValue()); 
		expected = "Test";
		assertEquals(expected, option.getText());
	}

}
