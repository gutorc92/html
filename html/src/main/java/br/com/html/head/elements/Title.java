package br.com.html.head.elements;

import br.com.html.head.HeadElement;

public class Title extends HeadElement {
	
	private String title;
	
	public Title(String title){
		this.title = title;
	}

	public String build() {
		// TODO Auto-generated method stub
		html = "<title>" + title + "</title>";
				
		
		return html;
	}

	@Override
	protected boolean hasCloseTag() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String tag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean hasToBuildInsideElements() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean hasInsideText() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String insideText() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
