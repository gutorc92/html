package br.com.html.head.elements;

import br.com.html.head.HeadElement;

public class Script extends HeadElement {

	private final String HTML_TAG = "script";
	private String src;
	
	public Script(String script, String src){
		setText(script);
		setSrc(src);
	}
	
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
	
	private void setSrc(String src) {
		if(src == null){
			throw new NullPointerException("Src cannot be a null object");
		}
		this.src = src;
	}

	@Override
	protected String addAtributes() {
		// TODO Auto-generated method stub
		String html = super.addAtributes();
		html += addAtribute("src", this.src);
		return html;
	}
	
	public String getSrc(){
		return this.src;
	}
	
	

}
