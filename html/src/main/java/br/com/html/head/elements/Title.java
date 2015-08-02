package br.com.html.head.elements;

import br.com.html.head.HeadElement;

public class Title extends HeadElement {
	
	private String title;
	
	public Title(String title){
		this.title = title;
	}

	public String build() {
		// TODO Auto-generated method stub
		html = "<title>" + title + "</title>";
				
		
		return html;
	}
	
}
