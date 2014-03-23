package org.playground.playing;

public class MainExecution {

	public static void main(String[] args){
		
		//UniqueChar checking = new UniqueChar("1234 56wmerty uiopasd fghkx");
		//System.out.println(checking.check());
		
		//ReverseCString checking = new ReverseCString("qwertyuiop1234567890");
		//System.out.println(checking.reverse());
		
		//RemoveDuplicate checking = new RemoveDuplicate("Hello World~!");
		//System.out.println(checking.remove());
		
		//Anagrams checking = new Anagrams("apple", "el ppa");
		//System.out.println(checking.checkingAnagrams());
		
		//ReplaceSpace checking = new ReplaceSpace("Hello World Hey ~!");
		//System.out.println(checking.replaceSpace());
		
		/** RotatImage and RotateImageInPlace testing
		int[][] imageArray = new int[][] {
				{11, 12, 13, 14, 15, 16, 17},
				{21, 22, 23, 24, 25, 26, 27},
				{31, 32, 33, 34, 35, 36, 37},
				{41, 42, 43, 44, 45, 46, 47},
				{51, 52, 53, 54, 55, 56, 57},
				{61, 62, 63, 64, 65, 66, 67},
				{71, 72, 73, 74, 75, 76, 77}
		};
		
		//RotateImage checking = new RotateImage(imageArray);
		RotateImageInPlace checking = new RotateImageInPlace(imageArray);
		int[][] result = checking.rotate();
		
		
		
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 7; j++){
				System.out.print(result[i][j]);
				if(j == 6){
					System.out.print("\n");
				}else{
					System.out.print(", ");
					
				}
			}
		}*/
		
		/** PurgeMatrix testing
		int[][] imageArray = new int[][] {
				{11, 00, 13, 14, 15, 16, 17},
				{21, 22, 23, 00, 25, 26, 27},
				{31, 32, 33, 34, 35, 36, 37},
				{41, 42, 43, 00, 45, 00, 47},
				{51, 52, 53, 54, 55, 56, 57},
				{61, 62, 63, 64, 65, 66, 67},
				{71, 72, 73, 74, 75, 76, 77}
		};
		
		PurgeMatrix checking = new PurgeMatrix(imageArray);
		checking.purge();
		int[][] result = checking.getMatrix();
		
		for(int i = 0; i < result.length; i++){
			for(int j = 0; j < result[i].length; j++){
				System.out.print(result[i][j]);
				if(j == result[i].length - 1){
					System.out.print("\n");
				}else{
					System.out.print(", \t");		
				}
			}
		}*/
		
		/** RemoveDuplicatesLink Testing
		Node head = new Node(1);
		head.append(new Node(2)).append(new Node(4)).append(new Node(5)).append(new Node(7)).append(new Node(2)).append(new Node(5));
		
		RemoveDuplicatesLink checking = new RemoveDuplicatesLink(head);
		
		Node n = checking.removeDuplicates();
		while(n != null){
			System.out.print(n.getData());
			if(n.getNext() != null){
				System.out.print(" -> ");
			}else{
				System.out.print("\n");
			}		
			n = n.getNext();
		}*/
		
		
		/** LastNthNode
		Node head = new Node(1);
		head.append(new Node(2)).append(new Node(4)).append(new Node(5)).append(new Node(7)).append(new Node(2)).append(new Node(5));
		
		//LastNthNodeMethod1 checking = new LastNthNodeMethod1(head);	
		//System.out.println("The value is: " + checking.getLastNthNode(5).intValue());
		
		//System.out.println("The value is: " + LastNthNodeMethod2.getLastNthNode(head, 5));
		
		LastNthNodeMethod3 checking = new LastNthNodeMethod3(head);
		System.out.println("The value is: " + checking.getLastNthNode(4).intValue());
		*/
			
			
	}

}
