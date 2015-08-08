package br.com.html.body.elements.input;

import br.com.html.body.elements.BodyElement;

public abstract class Input extends BodyElement {
	
	public static final String TEXT = "text";
	public static final String PASSWORD = "password";
	public static final String SUBMIT = "submit";
	public static final String EMAIL = "email";
	private static final String HTML_TAG = "input";
	
	protected String type;
	protected String value;
	
	protected Input(String type,String id, String value, String text ){
		super(id);
		this.value = value;
		this.type = type;
		this.insideText = text;
		
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
	
	
	
	@Override
	protected String addAtributes() {
		// TODO Auto-generated method stub
		String htmlAtt = super.addAtributes();
		htmlAtt += addType();
		htmlAtt += addValue();
		return htmlAtt;
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



	@Override
	protected boolean hasCloseTag() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	protected String tag() {
		// TODO Auto-generated method stub
		return HTML_TAG;
	}



	@Override
	protected boolean hasToBuildInsideElements() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
