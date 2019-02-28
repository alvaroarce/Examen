package com.cenfotec.logic;

public class Analytics {

	public static String masLarga(String words) {
		
		String[] list;
		list = words.split(",");

		String word = null;
		
		if(list[0].length() > list[1].length()) {
			word = list[0];
		}else {
			word= list[1];
		}
		return word;
	}
	
	public static String masCorta(String palabras) {
		String [] list;
		list = palabras.split(",");
		
		String word = null;
		
		if(list[0].length() > list[1].length()) {
			word = list[1];
		}else {
			word = list[0];
		}
		return word;
	}
	
	public static String[] masLargaOrdenada(String [] palabra) {
		String 
	}
}
