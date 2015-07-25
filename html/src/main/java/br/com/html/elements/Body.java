package br.com.html.elements;

public class Body extends Element {

	public String build() {
		html = "<body " + getId();
		html += buildInsideElements();
		html += "></body>";
		return html;
	}

}
