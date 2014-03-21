package org.playground.playing;

public class RotateImage {
	
	private int[][] image;

	public RotateImage(int[][] input){
		image = input;
	}

	public int[][] rotate(){
		
		if( image != null ){
			int n = image.length;
			int[][] result = new int[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					result[n-1-j][i] = image[i][j];
				}
			}
			return result;
		} else {
			return null;
		}	
	}
	
}
