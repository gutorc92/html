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
import br.com.html.head.Head;
import br.com.html.head.elements.Title;
import br.com.html.page.Page;

public class SampleForm implements HtmlElement {
	
	private Table table;
	private String idForm;
	private Page page;
	private String title;
	
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
		tr.addElement(td2);
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
		tr.addElement(td2);
		table.addElement(tr);
	}

	public String build() {
		// TODO Auto-generated method stub
		page.setBody(createBody());
		page.setHead(createHead());
		return page.build();
	}
	
	private String generateSubIds(){
		return this.idForm + "_" + GenerateIds.nextID();
	}
	
	private Body createBody(){
		Body body = new Body(generateSubIds());
		body.addElement(table);
		return body;
	}
	
	private Head createHead(){
		Head head = new Head();
		if(title != null){
			head.addElement(new Title(title));
		}
		return head;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
