package br.com.html.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkTest {
	
	Link link;
	
	@Before
	public void newLink(){
		link = new Link();
	}

	@Test
	public void testBuildWihtoutArguments() {
		String id = GenerateIds.nextID();
		link.setId(id);
		String expected = "<a id=\"" + id + "\"></a>";
		assertTrue(expected.equals(link.build()));
	}

	@Test
	public void testSetHref() {
		String id = GenerateIds.nextID();
		link.setId(id);
		link.setHref("testSetHref");
		String expected = "<a id=\"" + id + "\" href=\"testSetHref\"></a>";
		assertEquals(expected,link.build());
	}
	
	@Test
	public void testWithElements() {
		String id = GenerateIds.nextID();
		String idP = GenerateIds.nextID();
		Paragraph p = new Paragraph(idP,"Testing");
		link.setId(id);
		link.setHref("testSetHref");
		link.addElement(p);
		System.out.println(link.build());
		String expected = "<a id=\"" + id + "\" href=\"testSetHref\">"
				+ "<p id=\"" + idP + "\">Testing</p>"
				+ "</a>";
		assertEquals(expected,link.build());
	}
	
	

}
