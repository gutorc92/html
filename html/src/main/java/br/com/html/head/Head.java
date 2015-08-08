package br.com.html.head;



public class Head extends HeadElement {

	
	private static final String HTML_TAG = "head";

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

	@Override
	protected boolean hasInsideText() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
