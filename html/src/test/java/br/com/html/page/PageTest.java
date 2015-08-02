package br.com.html.page;

import br.com.html.body.elements.Body;
import br.com.html.body.elements.GenerateIds;
import junit.framework.TestCase;

public class PageTest extends TestCase {

	public void testBuild() {
		Page page = new Page();
		String idBody = GenerateIds.nextID();
		Body body = new Body(idBody);
		page.setBody(body);
		String expected = "<html>null<body id=\""+ idBody + "\"></body></html>";
		assertTrue(expected.equals(page.build()));
	}

}
