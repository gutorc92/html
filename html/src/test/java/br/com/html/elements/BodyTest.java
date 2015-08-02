package br.com.html.elements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.html.body.elements.Body;

public class BodyTest {
	
	private Body body;
	

	@Test
	public void testBuildWihtoutArguments() {
		String id = GenerateIds.nextID();
		body = new Body(id);
		body.setId(id);
		String expected = "<body id=\"" + id + "\"></body>";
		assertTrue(expected.equals(body.build()));
	}

}
