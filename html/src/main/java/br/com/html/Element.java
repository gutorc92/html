package br.com.html;

import java.util.ArrayList;
import java.util.List;

public  abstract class Element implements HtmlElement {
	protected String html;
	protected List<HtmlElement> elements;
	
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
