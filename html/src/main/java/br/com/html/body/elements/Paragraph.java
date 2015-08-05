package br.com.html.body.elements;

public class Paragraph extends BodyElement {

	private static final String HTML_TAG = "p";
	
	public Paragraph(String id, String text){
		super(id);
		setText(text);
	}
	
	public Paragraph(String id){
		super(id);
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
