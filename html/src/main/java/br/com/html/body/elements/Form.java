package br.com.html.body.elements;

public class Form extends BodyElement {
	
	public static final String POST = "post";
	public static final String GET = "get";
	
	private String action;
	private String method;
	
	public Form(String id, String action, String method){
		super(id);
		setAction(action);
		setMethod(method);
	}

	public String build() {
		html = "<form " + getId();
		html += addAtribute("action", action);
		html += addAtribute("method", method);
		html += ">";
		html += buildInsideElements();
		html += "</form>";
		
		return html;
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
	
	

}
