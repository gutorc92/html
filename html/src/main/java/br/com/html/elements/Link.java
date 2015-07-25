package br.com.html.elements;

import java.util.List;

import br.com.html.HtmlElement;

public class Link extends Element {
	
	private String href;
	private List<HtmlElement> elements;

	public String build() {
		html = "<a " + getId();
		if(href != null){
			html += " href=" + href;
		}
		html += buildInsideElements();
		html += "></a>";
		return html;
	}

	private String buildInsideElements() {
		String htmlInside = new String();
		if(elements != null){
			for(HtmlElement element : elements){
				htmlInside += element.build();
			}
		}
		return htmlInside;
	}
	
	public void setHref(String href){
		this.href = href;
	}
	
	public void addElement(HtmlElement element){
		elements.add(element);
	}

}
