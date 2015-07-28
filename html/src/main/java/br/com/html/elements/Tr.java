package br.com.html.elements;


import br.com.html.HtmlElement;

public class Tr extends Element{

	public String build() {
		html = "<tr " + getId() + ">";
		html += buildInsideElements();
		html += "</tr>";
		return html;
	}

	@Override
	public void addElement(HtmlElement element) {
		// TODO Auto-generated method stub
		if(element instanceof Td){
			super.addElement(element);
		}else{
			System.out.println("Tr jus can add Td elements");
		}
	}
	
	

}
