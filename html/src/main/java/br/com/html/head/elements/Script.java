package br.com.html.head.elements;

import br.com.html.head.HeadElement;

public class Script extends HeadElement {

	private final String HTML_TAG = "script";
	
	
	public Script(String script) {
		setText(script);
		// TODO Auto-generated constructor stub
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
		return false;
	}

}
