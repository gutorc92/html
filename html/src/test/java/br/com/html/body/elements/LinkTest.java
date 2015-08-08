package br.com.html.body.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.html.body.elements.Link;
import br.com.html.body.elements.Paragraph;

public class LinkTest {
	
	Link link;
	String idLink;
	
	@Before
	public void newLink(){
		idLink = GenerateIds.nextID();
		link = new Link(idLink);
	}

	@Test
	public void testBuildWihtoutArguments() {
		String expected = "<a id=\"" + idLink + "\"></a>";
		System.out.println(link.build());
		assertEquals(expected,link.build());
	}

	@Test
	public void testSetHref() {
		link.setHref("testSetHref");
		String expected = "<a id=\"" + idLink + "\" href=\"testSetHref\" ></a>";
		assertEquals(expected,link.build());
	}
	
	@Test
	public void testWithElements() {
		String idP = GenerateIds.nextID();
		Paragraph p = new Paragraph(idP,"Testing");
		link.setHref("testSetHref");
		link.addElement(p);
		System.out.println(link.build());
		String expected = "<a id=\"" + idLink + "\" href=\"testSetHref\" >"
				+ "<p id=\"" + idP + "\">Testing</p>"
				+ "</a>";
		assertEquals(expected,link.build());
	}
	
	@Test
	public void testTarget() {
		String idP = GenerateIds.nextID();
		Paragraph p = new Paragraph(idP,"Testing");
		link.setHref("testSetHref");
		link.addElement(p);
		link.setTarget(Link.TARGET_SELF);
		String expected = "<a id=\"" + idLink + "\" href=\"testSetHref\" "
				+ " target=\"_self\" >"
				+ "<p id=\"" + idP + "\">Testing</p>"
				+ "</a>";
		assertEquals(expected,link.build());
	}
	
	@Test
	public void testClassAtribute() {
		link.setHref("testSetHref");
		link.setClassOfElement("classtest");
		String expected = "<a  class=\"classtest\" id=\"" + idLink + "\" "
				+ "href=\"testSetHref\" >"
				+ "</a>";
		System.out.println(expected);
		System.out.println(link.build());
		assertEquals(expected,link.build());
	}
	
	@Test
	public void testStyleAtribute() {
		link.setHref("testSetHref");
		link.setSytle("test");
		String expected = "<a  style=\"test\" id=\"" + idLink + "\" "
				+ "href=\"testSetHref\" >"
				+ "</a>";
		System.out.println(expected);
		System.out.println(link.build());
		assertEquals(expected,link.build());
	}
	
	

}
