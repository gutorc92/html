package br.com.html.elements;

import java.util.ArrayList;

import br.com.html.HtmlElement;

public class Table extends Element {

	private int columns, rows;
	
	public Table(){
		
	}
	
	public Table(int columns, int rows){
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

}
