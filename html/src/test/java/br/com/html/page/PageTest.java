package br.com.html.page;

import junit.framework.TestCase;

public class PageTest extends TestCase {

	public void testBuild() {
		Page page = new Page();
		String expected = "<html>null<body id=\"null\"></body></html>";
		assertTrue(expected.equals(page.build()));
	}

}
