package br.com.html.body.elements;

import java.util.ArrayList;

import br.com.html.HtmlElement;

public class Table extends BodyElement {

	private static final String HTML_TAG = "table";
	
	private int columns, rows;
	
	public Table(String id){
		super(id);
	}
	
	public Table(String id,int columns, int rows){
		super(id);
		setColumns(columns);
		setRows(rows);
	}
	
	public void addElement(int row, HtmlElement element){
		if(elements == null){
			elements = new ArrayList<HtmlElement>();
		}
		if(checkTr(element)){
			elements.add(row, element);
		}
	}
	
	private boolean checkTr(HtmlElement element){
		if(element instanceof Tr){
			return true;
		}
		return false;
	}
	
	@Override
	public void addElement(HtmlElement element) {
		// TODO Auto-generated method stub
		if(checkTr(element)){
			super.addElement(element);
		}
	}

	public String build() {
		html = "<table " + getId() + ">";
		html += buildInsideElements();
		html += "</table>";
		return html;
	}
	
	public void setRows(int rows){
		if(rows >= 0 ){
			this.rows = rows;
		}
	}
	
	public void setColumns(int columns){
		if(columns >= 1){
			this.columns = columns;
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
