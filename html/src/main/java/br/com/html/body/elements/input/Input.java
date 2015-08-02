package br.com.html.body.elements.input;

import br.com.html.body.elements.Element;

public abstract class Input extends Element {
	
	public static final String TEXT = "text";
	public static final String PASSWORD = "password";
	protected String type;
	protected String text;
	protected String value;
	
	protected Input(String type,String id, String value, String text ){
		super(id);
		this.value = value;
		this.type = type;
		this.text = text;
		
	}
	
	
	
	protected Input(String type,String id, String value ){
		super(id);
		this.value = value;
		this.type = type;
		
	}
	
	protected Input(String type,String id){
		super(id);
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
