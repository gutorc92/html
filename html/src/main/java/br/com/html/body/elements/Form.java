package br.com.html.body.elements;

public class Form extends BodyElement {
	
	private static final String HTML_TAG = "form";
	
	public static final String POST = "post";
	public static final String GET = "get";
	
	private String action;
	private String method;
	
	public Form(String id, String action, String method){
		super(id);
		setAction(action);
		setMethod(method);
	}
	
	@Override
	protected String addAtributes() {
		// TODO Auto-generated method stub
		String atributesClass = super.addAtributes();
		atributesClass += addAtribute("action", action);
		atributesClass += addAtribute("method", method);
		return atributesClass;
	}


	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
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
