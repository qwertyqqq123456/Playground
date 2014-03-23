package org.playground.playing;

import java.util.HashSet;

public class RemoveDuplicatesLink {

	private Node head;

	public RemoveDuplicatesLink(Node head){
		this.head = head;
	}
	public RemoveDuplicatesLink(){
		this(null);
	}

	public Node removeDuplicates(){
		
		if(this.head == null) return null;		
		HashSet<Integer> dataSet = new HashSet<Integer>();
		dataSet.add(head.getData());

		Node n = head;
		while(n.getNext() != null){
			if(dataSet.contains(n.getNext().getData())){
				n.setNext(n.getNext().getNext());
			} else{
				dataSet.add(n.getNext().getData());
				n = n.getNext();
			}	
		}
		
		return this.head;
	}
	
}
