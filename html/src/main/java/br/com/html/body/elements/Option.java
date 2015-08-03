package br.com.html.body.elements;

public class Option extends BodyElement {
	
	private String value;
	private String text;
	
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Option(){
		super();
		text = "";
		value = "";
	}
	
	public Option(String id, String value, String text) {
		super(id);
		setValue(value);
		setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


	public String build() {
		html = "<option";
		html += addAtribute("value", value);
		html += ">" + text;
		html += "</option>";
		return html;
	}
	
	

}
