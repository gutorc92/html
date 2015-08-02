package br.com.html.body.elements;

public class Td extends Element {

	public Td(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public String build() {
		html = "<td " + getId() + ">";
		html += buildInsideElements();
		html += "</td>";
		return html;
	}

}
