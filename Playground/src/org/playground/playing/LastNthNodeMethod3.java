package org.playground.playing;

public class LastNthNodeMethod3 {

	private Node head;

	public LastNthNodeMethod3(Node head){
		this.head = head;
	}
	public LastNthNodeMethod3(){
		this(null);
	}

	public Integer getLastNthNode(int n){	
		if(this.head == null) return null;

		Node pr1 = this.head;
		Node pr2 = this.head;
		for(int i = 0; i < n-1; i++){
			pr2 = pr2.getNext();
		}
		while(pr1 != null && pr2 != null){
			if(pr2.getNext() == null){
				return pr1.getData();
			} else {
				pr1 = pr1.getNext();
				pr2 = pr2.getNext();
			}
		}
		return null;
	}
}
