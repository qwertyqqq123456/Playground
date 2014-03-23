package org.playground.playing;

public class LastNthNodeMethod1 {
	
	private Node head;

	public LastNthNodeMethod1(Node head){
		this.head = head;
	}
	public LastNthNodeMethod1(){
		this(null);
	}

	public Integer getLastNthNode(int n){	
		
		if(this.head == null) return null;		
		
		int totalNum = 0;
		Node nNode = head;
		while(nNode != null){
			totalNum ++;
			nNode = nNode.getNext();
		}
		int count = totalNum - n;
		nNode = head;
		while(count > 0){
			nNode = nNode.getNext();
			count--;
		}
		
		return (nNode.getData());
	}
}
