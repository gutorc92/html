package br.com.html.head.elements;

import br.com.html.head.HeadElement;

public class Title extends HeadElement {
	
	private static final String HTML_TAG = "title";
	
	public Title(String title){
		setText(title);
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

	@Override
	protected boolean hasInsideText() {
		// TODO Auto-generated method stub
		return true;
	}

	
	
}
