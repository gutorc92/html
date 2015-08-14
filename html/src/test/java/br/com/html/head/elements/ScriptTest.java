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
	
	@Test
	public void testBuildWithSrc() {
		Script script = new Script("Test","Test of src");
		String expected = "<script  src=\"Test of src\" >Test</script>";
		System.out.println(script.build());
		System.out.println(expected);
		assertEquals(expected,script.build());
	}

}
