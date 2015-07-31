package br.com.html.elements;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParagraphTest {

	private Paragraph p;
	
	@Test
	public void testBuildWithoutElements() {
		p = new Paragraph();
		String id = GenerateIds.nextID();
		p.setId(id);
		String expected = "<p id=\"" + id + "\"></p>";
		assertEquals(expected,p.build());
	}

	@Test
	public void testSetText() {
		p = new Paragraph("Testing");
		String id = GenerateIds.nextID();
		p.setId(id);
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
