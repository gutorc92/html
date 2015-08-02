package br.com.html.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrTest {
	
	Tr tr;
	String idTr;

	@Before
	public void setUp(){
		idTr = GenerateIds.nextID();
		tr = new Tr(idTr);
	}
	
	@Test
	public void testAddElementDifferenteOfTd() {
		Link link = new Link(GenerateIds.nextID());
		link.setHref("somelink");
		tr.addElement(link);
		String expected = "<tr id=\"" + idTr + "\"></tr>";
		assertTrue(expected.equals(tr.build()));
	}
	
	@Test
	public void testAddElement() {
		String idTd = GenerateIds.nextID();
		Td td = new Td(idTd);
		tr.addElement(td);
		String expected = "<tr id=\"" + idTr + "\"><td id=\"" + idTd + "\""
				+ "></td></tr>";
		assertTrue(expected.equals(tr.build()));
	}

	@Test
	public void testBuild() {
		String expected = "<tr id=\"" + idTr + "\"></tr>";
		assertTrue(expected.equals(tr.build()));
	}

}
