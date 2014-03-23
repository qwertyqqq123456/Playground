package org.playground.playing;

import java.util.HashSet;

public class PurgeMatrix {
	
	private int[][] matrix;

	public PurgeMatrix(int[][] input){
		matrix = input;
	}

	public int[][] getMatrix(){
		return this.matrix;
	}
	
	public void purge(){
		
		HashSet<Integer> emptyCol = new HashSet<Integer>();
		
		for(int i = 0; i < matrix.length; i++){
			boolean isEmptyRow = false;
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] == 0){
					isEmptyRow = true;
					emptyCol.add(new Integer(j));
				}
			}
			if(isEmptyRow){
				for(int m = 0; m < matrix[i].length; m++){
					matrix[i][m] = 0;
				}
			}

		}
		for(int j = 0; j < matrix[0].length; j++){
			if(emptyCol.contains(new Integer(j))){
				for(int i = 0; i < matrix.length; i++){
					matrix[i][j] = 0;		
				}
			}
		}

	}
}
