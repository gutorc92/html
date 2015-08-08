package br.com.html.body.elements;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.html.GenerateIds;

public class OptionTest {

	Option option;
	
	@Test
	public void testConstructorWithoutElements() {
		String id = GenerateIds.nextID();
		option = new Option(id);
		String expected = "<option id=\""+ id + "\"></option>";
		assertEquals(expected, option.build());
	}
	
	@Test
	public void testConstructorWithElements() {
		String id = GenerateIds.nextID();
		option = new Option(id,"1","Test");
		String expected = "<option id=\""+ id + "\" value=\"1\" >Test</option>";
		assertEquals(expected, option.build());
	}
	
	@Test
	public void testGets(){
		option = new Option(GenerateIds.nextID(),"1","Test");
		String expected = "1";
		assertEquals(expected, option.getValue()); 
		expected = "Test";
	}

}
