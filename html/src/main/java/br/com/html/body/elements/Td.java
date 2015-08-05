package br.com.html.body.elements;

public class Td extends BodyElement {
	
	private static final String HTML_TAG = "td";
	private int colspan;

	public Td(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	

	public void setColspan(int colspan) {
		this.colspan = colspan;
	}
	
	private String buildConspan(){
		String atribute = "";
		if(colspan > 0){
			atribute += addAtribute("colspan", this.colspan);
			
		}
		return atribute;
	}

	
	@Override
	protected String addAtributes() {
		// TODO Auto-generated method stub
		String htmlAtributes = super.addAtributes();
		htmlAtributes += buildConspan();
		return htmlAtributes;
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
