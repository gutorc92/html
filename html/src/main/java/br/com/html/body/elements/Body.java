package br.com.html.body.elements;

public class Body extends BodyElement {

	private static final String HTML_TAG = "body";
	
	public Body(String id) {
		super(id);
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
		return true;
	}

}
