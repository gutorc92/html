package br.com.html.page;

public class Page {
	
	private String header;
	private String body;
	
	public String build(){
		String html = "<html>"
				+ header 
				+ body 
				+ "</html>";
		return html;
	}

}
