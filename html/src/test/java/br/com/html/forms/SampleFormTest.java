package br.com.html.forms;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleFormTest {

	SampleForm sampleForm;
	
	@Test
	public void testBuild() {
		sampleForm = new SampleForm("1","login.php");
		String expected = "";
		System.out.println(sampleForm.build());
		assertEquals(expected, sampleForm.build());
		
	}
	
	@Test
	public void testBuildComplete() {
		sampleForm = new SampleForm("Test","login.php");
		sampleForm.setTitle("Testing");
		sampleForm.addLineInpuText("Type","");
		sampleForm.addLineInpuPassword("Your Password","");
		String expected = "";
		System.out.println(sampleForm.build());
		assertEquals(expected, sampleForm.build());
		
	}

}
