package br.com.html.body.elements;


import br.com.html.HtmlElement;

public class Tr extends BodyElement{
	
	private static final String HTML_TAG = "tr";
	private int columns;

	public Tr(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public Tr(String id, int columns){
		super(id);
		this.columns = columns;
	}

	@Override
	public void addElement(HtmlElement element) {
		// TODO Auto-generated method stub
		if(element instanceof Td){
			if(columns != 0 && elements.size() < columns){
				super.addElement(element);
			}else if(columns == 0){
				super.addElement(element);
			}else{
				System.out.println("Number of elements is out of max number");
			}
		}else{
			System.out.println("Tr jus can add Td elements");
		}
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
