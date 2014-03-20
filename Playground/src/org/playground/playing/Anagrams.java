package org.playground.playing;

import java.util.HashMap;

public class Anagrams {
	
	private String input1;
	private String input2;
	
	public Anagrams(String in1, String in2){
		input1 = in1;
		input2 = in2;
	}
	
	public String checkingAnagrams(){
		
		HashMap<Character, Integer> charBoard = new HashMap<Character, Integer> ();
		char[] cstring1 = input1.toCharArray();
		char[] cstring2 = input2.toCharArray();
		for(int i=0; i < cstring1.length; i++){
			if(charBoard.containsKey(cstring1[i])){
				charBoard.put(cstring1[i], new Integer(charBoard.get(cstring1[i]).intValue()+1));
			}else{
				charBoard.put(cstring1[i], 1);
			}
		}
		for(int i = 0; i < cstring2.length; i++){
			if(!charBoard.containsKey(cstring2[i])){
				return "Not Anagram.";
			}else{
				if(charBoard.get(cstring2[i]) > 0){
					charBoard.put(cstring2[i], new Integer(charBoard.get(cstring2[i]).intValue()-1));
				}else{
					return "Not Anagram.";
				}	
			}
		}

		for(int i = 0; i < cstring1.length; i++){
			if(charBoard.get(cstring1[i]) > 0){
				return "Not Anagram.";
			}
		}

		return "Is Anagram.";	
	}
            
	

}
