package br.com.html.body.elements;

public class Td extends BodyElement {
	
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



	public String build() {
		html = "<td " + getId();
		html += buildConspan();
		html		+= ">";
		html += buildInsideElements();
		html += "</td>";
		return html;
	}

}
