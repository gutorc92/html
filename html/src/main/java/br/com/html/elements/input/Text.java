package br.com.html.elements.input;

public class Text extends Input {

	public Text(){
		super(Input.TEXT);
	}
	
	public Text(String value){
		super(Input.TEXT, value);
	}
	
	public Text(String value,String text ){
		super(Input.TEXT,value,text);
	}
}
