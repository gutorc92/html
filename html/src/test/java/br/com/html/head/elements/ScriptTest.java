package br.com.html.head.elements;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScriptTest {

	@Test
	public void testBuild() {
		Script script = new Script("Test");
		String expected = "<script >Test</script>";
		assertEquals(expected,script.build());
	}

}
