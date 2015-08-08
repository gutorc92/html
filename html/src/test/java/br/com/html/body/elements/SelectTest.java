package br.com.html.body.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SelectTest {
	
	Select select;
	String idSelect;
	
	@Before
	public void setUp(){
		idSelect = GenerateIds.nextID();
		select = new Select(idSelect);
	}

	@Test
	public void testAddElement() {
		String optionId = GenerateIds.nextID();
		Option option = new Option(optionId,"1","Test");
		select.addElement(option);
		String expected = "<select id=\"" + idSelect + "\">"
				+ "<option id=\""+ optionId + "\" value=\"1\" >Test</option>"
				+ "</select>";
		assertEquals(expected,select.build());
		
	}
	
	@Test
	public void testAddElementWithParagraph() {
		String id = GenerateIds.nextID();
		Paragraph p = new Paragraph(id);
		select.addElement(p);
		String expected = "<select id=\"" + idSelect + "\"></select>";
		assertEquals(expected,select.build());
		
	}

	

	@Test
	public void testBuild() {
		String expected = "<select id=\"" + idSelect + "\"></select>";
		assertEquals(expected,select.build());
	}

}
