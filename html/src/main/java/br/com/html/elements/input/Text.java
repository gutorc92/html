package br.com.html.elements.input;

public class Text extends Input {

	public Text(String id){
		super(Input.TEXT,id);
	}
	
	public Text(String id,String value){
		super(Input.TEXT, id, value);
	}
	
	public Text(String id,String value,String text ){
		super(Input.TEXT,id,value,text);
	}
}
