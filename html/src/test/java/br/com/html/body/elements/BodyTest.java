package br.com.html.body.elements;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.html.GenerateIds;
import br.com.html.body.elements.Body;

public class BodyTest {
	
	private Body body;
	

	@Test
	public void testBuildWihtoutArguments() {
		String id = GenerateIds.nextID();
		body = new Body(id);
		body.setId(id);
		String expected = "<body id=\"" + id + "\"></body>";
		assertTrue(expected.equals(body.build()));
	}
	
	@Test
	public void testBuildWihtElements() {
		String id = GenerateIds.nextID();
		String pId = GenerateIds.nextID();
		Paragraph p = new Paragraph(pId, "Testing");
		body = new Body(id);
		body.addElement(p);
		String expected = "<body id=\"" + id + "\">"
				+ "<p id=\"" + pId + "\">Testing</p>"
				+ "</body>";
		assertEquals(expected,body.build());
	}

}
