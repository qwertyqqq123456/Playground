package org.playground.playing;

import java.util.ArrayList;

public class ReplaceSpace {
	
	private String input;

	public ReplaceSpace(String in){
		input = in;
	}

	public String replaceSpace(){
		
		char[] inputcstring = input.toCharArray();
		ArrayList<Character> inputList = new ArrayList<Character> ();
		
		for(int i = 0; i < inputcstring.length; i++){
			if(inputcstring[i] == ' '){
				inputList.add(new Character('%'));
				inputList.add(new Character('2'));
				inputList.add(new Character('0'));
			}else{
				inputList.add(new Character(inputcstring[i]));
			}
		}
		
		char[] result = new char[inputList.size()];
		for(int i = 0; i < inputList.size(); i++){
			result[i] = inputList.get(i).charValue();
		}		


		return (new String(result));


	}
}
