package org.playground.playing;

public class RemoveDuplicate {

	private String inputString;
	
	public RemoveDuplicate(String ins){
		inputString = ins;
	}
	
	public String remove(){
      
        char[] inputcstring = inputString.toCharArray();
        int tail = 1;
        for(int i = 1; i < inputcstring.length; i++){
                int j = 0;
        		for(j = 0; j < tail; j++){
                        if(inputcstring[i] == inputcstring[j]) break;
                }
                if(j == tail){
                        inputcstring[tail] = inputcstring[i];
                        tail++;
                }
        }
        inputcstring[tail] = 0;
        return new String(inputcstring);
		
	}
}
