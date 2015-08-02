package br.com.html.body.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.html.body.elements.Link;
import br.com.html.body.elements.Td;

public class TdTest {
	
	Td td;
	String idTd;
	
	@Before
	public void setUp(){
		idTd = GenerateIds.nextID();
		td = new Td(idTd);
	}

	@Test
	public void testBuildWithoutElements() {
		String expected = "<td id=\"" + idTd + "\"></td>";
		assertEquals(expected,td.build());
	}
	
	@Test
	public void testBuildColspan() {
		td.setColspan(2);
		String expected = "<td id=\"" + idTd + "\""
				+ " colspan=\"2\"></td>";
		assertEquals(expected,td.build());
	}
	
	@Test
	public void testBuildWithElements() {
		String idLink = GenerateIds.nextID();
		Link link = new Link(idLink);
		link.setHref("somelink");
		td.addElement(link);
		String expected = "<td id=\"" + idTd + "\">"
				+ "<a id=\"" + idLink + "\" href=\"somelink\"></a></td>";
		assertEquals(expected,td.build());
	} 

}
