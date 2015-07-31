package br.com.html.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TableTest {

	Table table;
	
	@Before
	public void setUp(){
		table = new Table();
	}
	@Test
	public void testBuild() {
		String id = GenerateIds.nextID();
		table.setId(id);
		String expected = "<table id=\"" + id + "\"></table>";
		System.out.println(table.build());
		assertEquals(expected, table.build());
	}
	
	@Test
	public void testBuildWithTrElements() {
		String id = GenerateIds.nextID();
		String idTr = GenerateIds.nextID();
		Tr tr = new Tr();
		tr.setId(idTr);
		table.setId(id);
		table.addElement(tr);
		String expected = "<table id=\"" + id + "\">"
				+ "<tr id=\""+ idTr + "\"></tr></table>";
		System.out.println(table.build());
		assertEquals(expected, table.build());
	}

}
