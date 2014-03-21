package org.playground.playing;

public class RotateImageInPlace {
	
	private int[][] image;

	public RotateImageInPlace(int[][] input){
		image = input;
	}

	public int[][] rotate(){
		
		int n = image.length;
		int [][] result = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				int temp = image[i][j];
				result[i][j] = image[j][n-1-i];
				result[j][n-1-i] = image[n-1-i][n-1-j];
				result[n-1-i][n-1-j] = image[n-1-j][i];
				result[n-1-j][i] = temp;
			}
		}
		return result;

	}
}
