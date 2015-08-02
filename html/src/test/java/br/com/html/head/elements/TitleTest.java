package br.com.html.head.elements;

import static org.junit.Assert.*;

import org.junit.Test;

public class TitleTest {

	@Test
	public void testBuild() {
		Title title = new Title("Test");
		String expected = "<title>Test</title>";
		assertEquals(expected,title.build());
	}

}
