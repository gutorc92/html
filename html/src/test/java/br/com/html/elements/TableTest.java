package br.com.html.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TableTest {

	Table table;
	String idTable;
	
	@Before
	public void setUp(){
		idTable = GenerateIds.nextID();
		table = new Table(idTable,2,2);
	}
	@Test
	public void testBuild() {
		String expected = "<table id=\"" + idTable + "\"></table>";
		System.out.println(table.build());
		assertEquals(expected, table.build());
	}
	
	@Test
	public void testBuildWithTrElements() {
		String idTr = GenerateIds.nextID();
		Tr tr = new Tr(idTr);
		table.addElement(tr);
		String expected = "<table id=\"" + idTable + "\">"
				+ "<tr id=\""+ idTr + "\"></tr></table>";
		System.out.println(table.build());
		assertEquals(expected, table.build());
	}

}
