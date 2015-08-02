package br.com.html.head;



public class Head extends HeadElement {

	
	public String build() {
		html = "<head>";
		html += buildInsideElements();
		html += "</head>";
		return html;
	}
	

}
