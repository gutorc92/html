package br.com.html.elements.input;

public class Password extends Input {
	
	public Password(){
		super(Input.PASSWORD);
	}
	
	public Password(String value){
		super(Input.PASSWORD, value);
	}
	
	public Password(String value,String text ){
		super(Input.PASSWORD,value,text);
	}
}
