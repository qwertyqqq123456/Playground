package org.playground.playing;

public class ReverseCString {
	
	private char[] cstring;

	public ReverseCString(String inputString){
		cstring = inputString.toCharArray();		
	}
    
    public String reverse(){    	
    	char[] result = new char[cstring.length];
    	if(cstring.length > 0){
	    	for(int i = cstring.length-1; i>=0; i--){
	            result[cstring.length-1-i] = cstring[i];
		    }
	    	return ("result is: " + new String(result));
    	}else
    		return "Please input a string.";
	        
    }
       
}
