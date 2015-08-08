package br.com.html.body.elements;

public class Option extends BodyElement {
	
	private String value;
	
	private static final String HTML_TAG = "option";
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	public Option(String id){
		super(id);
	}
	
	public Option(String id, String value, String text) {
		super(id);
		setValue(value);
		setText(text);
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
	protected String addAtributes() {
		// TODO Auto-generated method stub
		String atributesClass = super.addAtributes();
		atributesClass += addAtribute("value", value);
		return atributesClass;
	}
	
	

}
