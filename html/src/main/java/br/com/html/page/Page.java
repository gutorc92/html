package br.com.html.page;

import br.com.html.HtmlElement;
import br.com.html.body.elements.Body;
import br.com.html.head.Head;

public class Page implements HtmlElement {
	
	private static final String bodyIdDefault = "body_id_default";
	
	private Head head;
	private Body body;
	
	public Page(){
		head = new Head();
		body = new Body(bodyIdDefault);
	}
	
	public String build(){
		String html = "<html>"
				+ head.build() 
				+ body.build() 
				+ "</html>";
		return html;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	
	
	public void setHead(Head head) {
		this.head = head;
	}

	
	
	

}
