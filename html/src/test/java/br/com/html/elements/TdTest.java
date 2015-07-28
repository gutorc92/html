package br.com.html.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TdTest {
	
	Td td;
	
	@Before
	public void setUp(){
		td = new Td();
	}

	@Test
	public void testBuildWithoutElements() {
		String id = GenerateIds.nextID();
		td.setId(id);
		String expected = "<td id=\"" + id + "\"></td>";
		assertTrue(expected.equals(td.build()));
	}
	
	@Test
	public void testBuildWithElements() {
		String id = GenerateIds.nextID();
		td.setId(id);
		Link link = new Link();
		link.setHref("somelink");
		td.addElement(link);
		String expected = "<td id=\"" + id + "\">"
				+ "<a id=\"null\" href=\"somelink\"></a></td>";
		assertTrue(expected.equals(td.build()));
	}

}
