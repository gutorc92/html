package br.com.html.forms;

import br.com.html.HtmlElement;
import br.com.html.elements.GenerateIds;
import br.com.html.elements.Paragraph;
import br.com.html.elements.Table;
import br.com.html.elements.Td;
import br.com.html.elements.Tr;
import br.com.html.elements.input.Text;

public class SampleForm implements HtmlElement {
	
	private Table table;
	private String idForm;
	
	public SampleForm(String idForm){
		this.idForm = idForm;
		table = new Table(generateSubIds());
	}
	
	public void addLineInpuText(String label){
		Tr tr = new Tr(generateSubIds());
		Td td = new Td(generateSubIds());
		Paragraph p = new Paragraph(generateSubIds(),label);
		td.addElement(p);
		tr.addElement(td);
		Td td2 = new Td(generateSubIds());
		Text text = new Text(generateSubIds());
		td2.addElement(text);
		tr.addElement(td);
		table.addElement(tr);
	}

	public String build() {
		// TODO Auto-generated method stub
		return table.build();
	}
	
	private String generateSubIds(){
		return this.idForm + "_" + GenerateIds.nextID();
	}
	

}
