package br.com.html;

import java.util.ArrayList;
import java.util.List;

public  abstract class Element implements HtmlElement {
	protected String html;
	protected List<HtmlElement> elements;
	protected String classOfElement;
	protected String style;
	protected boolean insideElements;
	protected boolean hasCloseTag;
	protected String tag;
	protected String insideText;
	
	public Element(){
		elements = new ArrayList<HtmlElement>();
	}
	
	protected String buildInsideElements() {
		String htmlInside = new String();
		if(elements != null){
			for(HtmlElement element : elements){
				htmlInside += element.build();
			}
		}
		return htmlInside;
	}
	
	public void addElement(HtmlElement element){
		elements.add(element);
	}
	
	protected String addAtribute(String attribute,Object value){
		String html = "";
		if(value != null){
			html = " " + attribute + "=\"" + value.toString() + "\" ";
		}
		return html;
	}

	public void setElements(List<HtmlElement> elements) {
		this.elements = elements;
	}

	public String getClassOfElement() {
		return classOfElement;
	}

	public void setClassOfElement(String classOfElement) {
		this.classOfElement = classOfElement;
	}
	
	public void setSytle(String style){
		this.style = style;
	}
	
	private String globalAtributes(){
		String globalAtributes = "";
		if(style != null){
			globalAtributes += addAtribute("style", style);
		}
		if(classOfElement != null){
			globalAtributes += addAtribute("class", classOfElement);
		}
		
		return globalAtributes;
	}
	
	public void setText(String text){
		this.insideText = text;
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
	
	private String closeTag(){
		return "</" + tag() + ">";
	}
	
	
	protected abstract String addAtributes();
	protected abstract boolean hasCloseTag();
	protected abstract String tag();
	protected abstract boolean hasToBuildInsideElements();
	
	public String build(){
		html = "<" + tag() + " ";
		html += globalAtributes();
		html += addAtributes();
		html += ">";
		if(hasToBuildInsideElements()){
			html += buildInsideElements();
		}
		if(hasInsideText()){
			html += insideText();
		}
		if(hasCloseTag()){
			html += closeTag();
		}
		return html;
	}
	
}
