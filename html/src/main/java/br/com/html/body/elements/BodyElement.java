package br.com.html.body.elements;


import br.com.html.Element;
import br.com.html.HtmlElement;

public abstract class BodyElement extends Element implements HtmlElement {
	
	protected String id;
	protected String insideText;
	
	
	public BodyElement(String id){
		super();
		this.id = id;
	}
	
	public BodyElement(){
		super();
	}
	
	protected String getId(){
		return "id=\"" + id + "\"";
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setText(String text){
		this.insideText = text;
	}
	
	protected String addAtributes(){
		return getId();
	}
	
	protected boolean hasInsideText(){
		if(insideText != null){
			return true;
		}
		return false;
	}
	protected String insideText(){
		return insideText;
	}
	
	
	
	

}
