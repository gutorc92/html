package br.com.html.head;

import br.com.html.Element;
import br.com.html.HtmlElement;

public abstract class HeadElement extends Element {

	@Override
	public void addElement(HtmlElement element) {
		// TODO Auto-generated method stub
		Package pack = element.getClass().getPackage();
		System.out.println(pack.getName());
		if(pack.getName().equals("br.com.html.head.elements")){
			super.addElement(element);
		}
	}
	
	@Override
	protected boolean hasInsideText() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected String insideText() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected String addAtributes() {
		// TODO Auto-generated method stub
		return "";
	}
	
	
}
