package br.com.html.forms;

import br.com.html.HtmlElement;
import br.com.html.body.elements.Body;
import br.com.html.body.elements.GenerateIds;
import br.com.html.body.elements.Paragraph;
import br.com.html.body.elements.Table;
import br.com.html.body.elements.Td;
import br.com.html.body.elements.Tr;
import br.com.html.body.elements.input.Password;
import br.com.html.body.elements.input.Text;
import br.com.html.page.Page;

public class SampleForm implements HtmlElement {
	
	private Table table;
	private String idForm;
	private Page page;
	
	public SampleForm(String idForm){
		this.idForm = idForm;
		table = new Table(generateSubIds());
		page = new Page();
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
	
	public void addLineInpuPassword(String label){
		Tr tr = new Tr(generateSubIds());
		Td td = new Td(generateSubIds());
		Paragraph p = new Paragraph(generateSubIds(),label);
		td.addElement(p);
		tr.addElement(td);
		Td td2 = new Td(generateSubIds());
		Password password = new Password(generateSubIds());
		td2.addElement(password);
		tr.addElement(td);
		table.addElement(tr);
	}

	public String build() {
		// TODO Auto-generated method stub
		Body body = new Body(generateSubIds());
		body.addElement(table);
		page.setBody(body);
		return page.build();
	}
	
	private String generateSubIds(){
		return this.idForm + "_" + GenerateIds.nextID();
	}
	

}
