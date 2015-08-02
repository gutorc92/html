package br.com.html.page;

import br.com.html.body.elements.Body;
import br.com.html.body.elements.GenerateIds;
import br.com.html.head.Head;
import junit.framework.TestCase;

public class PageTest extends TestCase {

	public void testBuild() {
		Page page = new Page();
		String idBody = GenerateIds.nextID();
		Body body = new Body(idBody);
		Head head = new Head();
		page.setBody(body);
		page.setHead(head);
		String expected = "<html><head></head><body id=\""+ idBody + "\"></body></html>";
		System.out.println(page.build());
		assertEquals(expected,page.build());
	}

}
