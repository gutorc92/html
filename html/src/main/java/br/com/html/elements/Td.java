package br.com.html.elements;

public class Td extends Element {

	public String build() {
		html = "<td " + getId() + ">";
		html += buildInsideElements();
		html += "</td>";
		return html;
	}

}
