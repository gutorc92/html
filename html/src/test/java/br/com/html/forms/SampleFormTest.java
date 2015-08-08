package br.com.html.forms;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class SampleFormTest {

	SampleForm sampleForm;
	
	@Ignore
	@Test
	public void testBuild() {
		sampleForm = new SampleForm("1","login.php");
		String expected = "<html><head ></head>"
				+ "<body id=\"1_9\"><form id=\"1_1\" action=\"login.php\" method=\"post\">"
						+ "<table id=\"1_0\"><tr id=\"1_2\">"
								+ "<td id=\"1_3\"><p id=\"1_4\">"
										+ "</p></td>"
										+ "</tr>"
										+ "<tr id=\"1_5\"><td id=\"1_6\" colspan=\"2\">"
												+ "<input id=\"1_8\" type=\"submit\" value=\"Send\">"
														+ "</td>"
														+ "</tr>"
														+ "</table></form></body></html>";
		System.out.println(sampleForm.build());
		assertEquals(expected, sampleForm.build());
		
	}
	
	@Ignore
	@Test
	public void testBuildComplete() {
		sampleForm = new SampleForm("Test","login.php");
		sampleForm.setTitle("Testing");
		sampleForm.addLineInpuText("Type","");
		sampleForm.addLineInpuPassword("Your Password","");
		sampleForm.addLineInputEmail("Email", "");
		String expected = "";
		System.out.println(sampleForm.build());
		assertEquals(expected, sampleForm.build());
		
	}

}
