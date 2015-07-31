package br.com.html.elements;

public class Paragraph extends Element {

	private String text;
	
	public Paragraph(String text){
		setText(text);
	}
	
	public Paragraph(String id, String text){
		setId(id);
		setText(text);
	}
	
	public Paragraph(){
		
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
