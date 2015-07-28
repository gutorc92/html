package br.com.html.elements;


public class Link extends Element {
	
	private String href;
	

	public String build() {
		html = "<a " + getId();
		if(href != null){
			html += " href=\"" + href + "\"";
		}
		html += buildInsideElements();
		html += "></a>";
		return html;
	}

	public void setHref(String href){
		this.href = href;
	}
	
}
