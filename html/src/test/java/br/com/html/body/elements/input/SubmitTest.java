package br.com.html.body.elements.input;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.html.body.elements.GenerateIds;

public class SubmitTest {

	Submit submit;
	
	@Test
	public void testBuildWithoutArguments() {
		String id = GenerateIds.nextID();
		submit = new Submit(id);
		String expected = "<input id=\"" + id + "\" type=\"submit\">";
		assertEquals(expected, submit.build());
	}
	
	@Test
	public void testBuildWithValue() {
		String id = GenerateIds.nextID();
		submit = new Submit(id,"Test");
		submit.setId(id);
		String expected = "<input id=\"" + id + "\" type=\"submit\" "
				+ "value=\"Test\">";
		System.out.println(submit.build());
		assertEquals(expected, submit.build());
	}

}
