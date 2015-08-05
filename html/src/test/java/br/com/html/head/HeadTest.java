package br.com.html.head;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.html.body.elements.GenerateIds;
import br.com.html.body.elements.Td;
import br.com.html.head.elements.Title;

public class HeadTest {

	@Test
	public void testBuild() {
		Head head = new Head();
		String expected = "<head ></head>";
		assertEquals(expected, head.build());
	}
	
	@Test
	public void testAddBodyElement() {
		Head head = new Head();
		Td td = new Td(GenerateIds.nextID());
		head.addElement(td);
		String expected = "<head ></head>";
		assertEquals(expected, head.build());
	}
	
	@Test
	public void testAddHeadElement() {
		Head head = new Head();
		Title title = new Title("Test");
		head.addElement(title);
		String expected = "<head ><title>Test</title></head>";
		assertEquals(expected, head.build());
	}

}
