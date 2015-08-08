package br.com.html.body.elements;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.html.GenerateIds;

public class FormTest {
	
	@Test
	public void testBuild() {
		String id = GenerateIds.nextID();
		Form form = new Form(id,"login.php",Form.POST);
		String expected = "<form id=\"" + id + "\" action=\"login.php\" "
				+ " method=\"post\" >"
				+ "</form>";
		assertEquals(expected,form.build());
	}

	@Test
	public void testBuildWithElements() {
		String id = GenerateIds.nextID();
		String pId = GenerateIds.nextID();
		Paragraph p = new Paragraph(pId, "Testing");
		Form form = new Form(id,"login.php",Form.GET);
		form.addElement(p);
		String expected = "<form id=\"" + id + "\" action=\"login.php\" "
				+ " method=\"get\" >"
				+ "<p id=\"" + pId + "\">Testing</p>"
				+ "</form>";
		assertEquals(expected,form.build());
	}
	
	@Test
	public void testGets(){
		String id = GenerateIds.nextID();
		Form form = new Form(id,"login.php",Form.GET);
		assertEquals("login.php", form.getAction());
		assertEquals("get",form.getMethod());
	}

}
