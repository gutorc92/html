package br.com.html.elements;


public class Link extends Element {
	
	public Link(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}



	private String href;
	private String target;

	public String build() {
		html = "<a " + getId(); 
		html += addAtribute("href", href);
		html += addAtribute("target", target);
		html += ">";
		html += buildInsideElements();
		html += "</a>";
		return html;
	}
	
	

	public void setHref(String href){
		this.href = href;
	}
	
	
	
}
