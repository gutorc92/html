package br.com.html.page;

import br.com.html.body.elements.Body;
import br.com.html.body.elements.GenerateIds;
import br.com.html.head.Head;

public class Page {
	
	private Head head;
	private Body body;
	
	public String build(){
		check();
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

	private void check(){
		if(body == null){
			body = new Body(GenerateIds.nextID());
		}
	}
	
	

}
