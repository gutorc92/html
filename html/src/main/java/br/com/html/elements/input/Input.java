package br.com.html.elements.input;

import br.com.html.elements.Element;

public abstract class Input extends Element {
	
	public static final String TEXT = "text";
	protected String type;
	protected String text;
	protected String value;
	
	protected Input(String type, String value, String text ){
		this.value = value;
		this.type = type;
		this.text = text;
		
	}
	
	protected Input(String type, String value ){
		this.value = value;
		this.type = type;
		
	}
	
	protected Input(String type){
		this.type = type;
	}
	
	
	public String build() {
		html = "<input " + getId();
		html += addType();
		html += addValue();
		html += ">";
		html += addText();
		return html;
	}
	
	private String addText(){
		String html = "";
		if(text != null){
			html = " " + text;
		}
		return html;
	}
	
	private String addValue(){
		String html = "";
		if(value != null){
			html = " value=\"" + value + "\"";
		}
		return html;
	}
	
	private String addType(){
		String html = "";
		if(this.type != null){
			html = " type=\"" + this.type +"\"";
		}
		return html;
	}

}
