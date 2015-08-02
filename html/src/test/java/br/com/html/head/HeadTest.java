package br.com.html.head;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.html.body.elements.GenerateIds;
import br.com.html.body.elements.Td;

public class HeadTest {

	@Test
	public void testBuild() {
		Head head = new Head();
		String expected = "<head></head>";
		assertEquals(expected, head.build());
	}
	
	@Test
	public void testAddBodyElement() {
		Head head = new Head();
		Td td = new Td(GenerateIds.nextID());
		head.addElement(td);
		String expected = "<head></head>";
		assertEquals(expected, head.build());
	}

}
