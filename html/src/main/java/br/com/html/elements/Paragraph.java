package br.com.html.elements;

public class Paragraph extends Element {

	private String text;
	
	
	
	public Paragraph(String id, String text){
		super(id);
		setText(text);
	}
	
	public Paragraph(String id){
		super(id);
	}
	
	public String build() {
		String html = "<p " + getId() + ">";
		if(text != null){
			html += text;
		}
		html += buildInsideElements();
		html += "</p>";
		return html;
	}
	
	public void setText(String text){
		this.text = text;
	}

}
