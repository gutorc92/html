package br.com.html.elements;

public  class GenerateIds {
	
	private static int num = 0;
	
	
	public static String nextID(){
		String id = String.valueOf(num);
		num++;
		return id;
	}

}
