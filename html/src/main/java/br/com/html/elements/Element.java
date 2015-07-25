package br.com.html.elements;

import br.com.html.HtmlElement;

public abstract class Element implements HtmlElement {
	
	protected String id;
	protected String html;
	
	protected String getId(){
		return "id=\"" + id + "\"";
	}
	
	public void setId(String id){
		this.id = id;
	}

}
