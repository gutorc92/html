package br.com.html.body.elements;


public class Link extends BodyElement {
	
	private static final String HTML_TAG = "a";
	
	public static final String TARGET_BLANK = "_blank";
	public static final String TARGET_SELF = "_self"; 	
	public static final String TARGET_PARENT = "_parent"; 	
	public static final String TARGET_TOP = "_top"; 	
	
	private String href;
	private String target;
	
	public Link(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public void setHref(String href){
		this.href = href;
	}
	
	

	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	protected String addAtributes() {
		// TODO Auto-generated method stub
		String atributesClass = super.addAtributes();
		atributesClass += addAtribute("href", href);
		atributesClass += addAtribute("target", target);
		return atributesClass;
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
