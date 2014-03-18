package org.playground.playing;

import java.util.HashMap;

public class UniqueChar {
	
	private String input ; 
	private HashMap<Character, Boolean> charLib = new HashMap<Character, Boolean>();
	
	public UniqueChar(String in){	
		input = in; // input the string in test.
		for(int i = 0; i<256; i++){
			charLib.put((char) i, false);
		}		
	}
	
	public String check(){
		for(int i=0; i<input.length(); i++){
			Character currentChar = new Character(input.charAt(i));
			if(charLib.containsKey(currentChar) && !Character.isWhitespace(currentChar)){
				if(charLib.get(currentChar)){
					return "Found duplicated char.";
				}else charLib.put(currentChar, true);
			}
		}
		return "This string has all unique chars.";		
	}

}
