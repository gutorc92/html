package br.com.html.elements.input;

public class Password extends Input {
	
	public Password(String id){
		super(Input.PASSWORD,id);
	}
	
	public Password(String id,String value){
		super(Input.PASSWORD,id, value);
	}
	
	public Password(String id,String value,String text ){
		super(Input.PASSWORD,id,value,text);
	}
}
