package br.com.html.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrTest {
	
	Tr tr;

	@Before
	public void setUp(){
		tr = new Tr();
	}
	
	@Test
	public void testAddElementDifferenteOfTd() {
		String id = GenerateIds.nextID();
		tr.setId(id);
		Link link = new Link();
		link.setHref("somelink");
		tr.addElement(link);
		String expected = "<tr id=\"" + id + "\"></tr>";
		assertTrue(expected.equals(tr.build()));
	}
	
	@Test
	public void testAddElement() {
		String id = GenerateIds.nextID();
		String idTd = GenerateIds.nextID();
		tr.setId(id);
		Td td = new Td();
		td.setId(idTd);
		tr.addElement(td);
		String expected = "<tr id=\"" + id + "\"><td id=\"" + idTd + "\""
				+ "></td></tr>";
		assertTrue(expected.equals(tr.build()));
	}

	@Test
	public void testBuild() {
		String id = GenerateIds.nextID();
		tr.setId(id);
		String expected = "<tr id=\"" + id + "\"></tr>";
		assertTrue(expected.equals(tr.build()));
	}

}
