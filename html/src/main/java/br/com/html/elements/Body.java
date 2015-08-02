package br.com.html.elements;

public class Body extends Element {

	public Body(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public String build() {
		html = "<body " + getId();
		html += buildInsideElements();
		html += "></body>";
		return html;
	}

}
