package br.com.html.forms;

import br.com.html.GenerateIds;
import br.com.html.HtmlElement;
import br.com.html.body.elements.Body;
import br.com.html.body.elements.Form;
import br.com.html.body.elements.Paragraph;
import br.com.html.body.elements.Table;
import br.com.html.body.elements.Td;
import br.com.html.body.elements.Tr;
import br.com.html.body.elements.input.Email;
import br.com.html.body.elements.input.Password;
import br.com.html.body.elements.input.Submit;
import br.com.html.body.elements.input.Text;
import br.com.html.head.Head;
import br.com.html.head.elements.Title;
import br.com.html.page.Page;

public class SampleForm implements HtmlElement {
	
	private Table table;
	private String idForm;
	private Page page;
	private String title;
	private Form form;
	
	public SampleForm(String idForm,String action){
		this.idForm = idForm;
		table = new Table(generateSubIds());
		page = new Page();
		form = new Form(generateSubIds(), action, Form.POST);
	}
	
	
	public void addLineInpuText(String label,String value){
		Tr tr = new Tr(generateSubIds());
		tr.addElement(createTdWithParagraph(label));
		tr.addElement(createTdWithInputText(value));
		table.addElement(tr);
	}
	
	public void addLineInpuPassword(String label,String value){
		Tr tr = new Tr(generateSubIds());
		tr.addElement(createTdWithParagraph(label));
		tr.addElement(createTdWithInputPassword(value));
		table.addElement(tr);
	}
	
	public void addLineInputEmail(String label,String value){
		Tr tr = new Tr(generateSubIds());
		tr.addElement(createTdWithParagraph(label));
		tr.addElement(createTdWithInputEmail(value));
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
	
	private void createTitleInTable(){
		Tr tr = new Tr(generateSubIds());
		tr.addElement(createTdWithParagraph(title));
		table.addElement(0, tr);
	}
	
	private void createButton(){
		Tr tr = new Tr(generateSubIds());
		Td td = new Td(generateSubIds());
		Td td2 = new Td(generateSubIds());
		Submit send = new Submit(generateSubIds(), "Send");
		td.addElement(send);
		td.setColspan(2);
//		Submit clean = new Submit(generateSubIds(), "Clean");
//		td2.addElement(clean);
		tr.addElement(td);
//		tr.addElement(td2);
		table.addElement(tr);
	}
	
	private Body createBody(){
		createTitleInTable();
		createButton();
		Body body = new Body(generateSubIds());
		form.addElement(table);
		body.addElement(form);
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
	
	protected Td createTdWithParagraph(String label){
		Td td = new Td(generateSubIds());
		Paragraph p = new Paragraph(generateSubIds(),label);
		td.addElement(p);
		return td;
	}
	
	protected Td createTdWithInputPassword(String value){
		Td td = new Td(generateSubIds());
		Password password = new Password(generateSubIds(),value);
		td.addElement(password);
		return td;
	}
	
	protected Td createTdWithInputText(String value){
		Td td = new Td(generateSubIds());
		Text text = new Text(generateSubIds(),value);
		td.addElement(text);
		return td;
	}
	
	protected Td createTdWithInputEmail(String value){
		Td td = new Td(generateSubIds());
		Email email = new Email(generateSubIds(),value);
		td.addElement(email);
		return td;
	}
	

}
