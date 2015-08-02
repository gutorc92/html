package br.com.html.elements;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.html.body.elements.Paragraph;

public class ParagraphTest {

	private Paragraph p;
	
	@Test
	public void testBuildWithoutElements() {
		String id = GenerateIds.nextID();
		p = new Paragraph(id);
		String expected = "<p id=\"" + id + "\"></p>";
		assertEquals(expected,p.build());
	}

	@Test
	public void testSetText() {
		String id = GenerateIds.nextID();
		p = new Paragraph(id,"Testing");
		String expected = "<p id=\"" + id + "\">Testing</p>";
		assertEquals(expected,p.build());
	}
	
	@Test
	public void testConstructor() {
		String id = GenerateIds.nextID();
		p = new Paragraph(id,"Testing");
		String expected = "<p id=\"" + id + "\">Testing</p>";
		assertEquals(expected,p.build());
	}

}
