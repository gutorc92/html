package br.com.html.page;

import junit.framework.TestCase;

public class PageTest extends TestCase {

	public void testBuild() {
		Page page = new Page();
		assertEquals("<html>nullnull</html>", page.build());
	}

}
