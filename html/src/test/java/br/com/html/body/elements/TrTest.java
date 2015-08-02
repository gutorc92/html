package br.com.html.body.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.html.body.elements.Link;
import br.com.html.body.elements.Td;
import br.com.html.body.elements.Tr;

public class TrTest {
	
	Tr tr;
	String idTr;

	@Before
	public void setUp(){
		idTr = GenerateIds.nextID();
		tr = new Tr(idTr);
	}
	
	@Test
	public void testConstructorColumns(){
		tr = new Tr(idTr, 2);
		String expected = "<tr id=\"" + idTr + "\"></tr>";
		assertTrue(expected.equals(tr.build()));
		
	}
	
	@Test
	public void testConstructorColumnsAddLessThanMax(){
		tr = new Tr(idTr, 3);
		String idTd = GenerateIds.nextID();
		Td td = new Td(idTd);
		String idTd2 = GenerateIds.nextID();
		Td td2 = new Td(idTd2);
		tr.addElement(td);
		tr.addElement(td2);
		String expected = "<tr id=\"" + idTr + "\">"
				+ "<td id=\"" + idTd + "\"></td>"
				+ "<td id=\"" + idTd2 + "\"></td>"
						+ "</tr>";
		assertTrue(expected.equals(tr.build()));
		
	}
	
	@Test
	public void testConstructorColumnsAddMoreThanMax(){
		tr = new Tr(idTr, 2);
		String idTd = GenerateIds.nextID();
		Td td = new Td(idTd);
		String idTd2 = GenerateIds.nextID();
		Td td2 = new Td(idTd2);
		String idTd3 = GenerateIds.nextID();
		Td td3 = new Td(idTd3);
		tr.addElement(td);
		tr.addElement(td2);
		tr.addElement(td3);
		String expected = "<tr id=\"" + idTr + "\">"
				+ "<td id=\"" + idTd + "\"></td>"
				+ "<td id=\"" + idTd2 + "\"></td>"
						+ "</tr>";
		assertEquals(expected,tr.build());
		
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
