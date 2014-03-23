package org.playground.playing;

public class LastNthNodeMethod2 {

	public static Integer getLastNthNode(Node node, int n){	
		if(node == null) return null;
		
		Node tempNode = node;
		for(int i = 0; i < n; i++){
			tempNode = tempNode.getNext();
		}
		
		if(tempNode != null){
			return getLastNthNode(node.getNext(), n);
		} else {
			return node.getData();
		}
	}
	
}
