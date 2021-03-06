package br.com.html.body.elements;

import br.com.html.HtmlElement;

public class Select extends BodyElement {
	
	private static final String HTML_TAG = "select";
	
	public Select(String id){
		super(id);
	}

	public String build() {
		html = "<select " + getId();
		html += ">";
		html += buildInsideElements();
		html += "</select>";
		return html;
	}
	
	@Override
	public void addElement(HtmlElement element) {
		// TODO Auto-generated method stub
		if(element instanceof Option){
				super.addElement(element);
		}else{
			System.out.println("Select just can add Option elements");
		}
	}

	@Override
	protected boolean hasCloseTag() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected String tag() {
		// TODO Auto-generated method stub
		return HTML_TAG;
	}

	@Override
	protected boolean hasToBuildInsideElements() {
		// TODO Auto-generated method stub
		return true;
	}

}
