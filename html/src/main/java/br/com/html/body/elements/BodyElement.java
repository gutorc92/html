package br.com.html.body.elements;

import java.util.ArrayList;
import java.util.List;

import br.com.html.HtmlElement;

public abstract class BodyElement implements HtmlElement {
	
	protected String id;
	protected String html;
	protected List<HtmlElement> elements;
	
	public BodyElement(String id){
		elements = new ArrayList<HtmlElement>();
		this.id = id;
	}
	
	public BodyElement(){
		
	}
	
	protected String getId(){
		return "id=\"" + id + "\"";
	}
	
	public void setId(String id){
		this.id = id;
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
		if(elements == null){
			elements = new ArrayList<HtmlElement>();
		}
		elements.add(element);
	}
	
	protected String addAtribute(String attribute,Object value){
		String html = "";
		if(value != null){
			html = " " + attribute + "=\"" + value.toString() + "\"";
		}
		return html;
	}

	public void setElements(List<HtmlElement> elements) {
		this.elements = elements;
	}
	
	

}
