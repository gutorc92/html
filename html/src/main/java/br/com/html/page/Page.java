package br.com.html.page;

import br.com.html.elements.Body;
import br.com.html.elements.GenerateIds;

public class Page {
	
	private String header;
	private Body body;
	
	public String build(){
		check();
		String html = "<html>"
				+ header 
				+ body.build() 
				+ "</html>";
		return html;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public void setHeader(String header) {
		this.header = header;
	}
	
	private void check(){
		if(body == null){
			body = new Body(GenerateIds.nextID());
		}
	}
	
	

}
