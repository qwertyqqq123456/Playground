package org.playground.playing;

public class Node {
	
	private Integer data;
	private Node next;

	public Node(Integer input){
		data = input;
		next = null;
	}

	public Node(){
		this(0);
	}

	public void setData(Integer data){
		this.data = data;
	}
	public void setNext(Node node){
		this.next = node;
	}
	public Integer getData(){
		return this.data;
	}
	public Node getNext(){
		return this.next;
	}
	
	public Node append(Node nNode){
		return this.next = nNode;
	}
	
}
