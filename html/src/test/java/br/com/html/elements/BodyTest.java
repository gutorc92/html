package br.com.html.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BodyTest {
	
	private Body body;
	
	@Before
	public void setUp(){
		body = new Body();
	}

	@Test
	public void testBuildWihtoutArguments() {
		String id = GenerateIds.nextID();
		body.setId(id);
		String expected = "<body id=\"" + id + "\"></body>";
		assertTrue(expected.equals(body.build()));
	}

}
