package assignment_day3;

public class Problem3 {

	public static void main(String[] args) {
		int[][] arr = {{20,50,45},{19,27,90}};
		for(int i = 0; i<arr.length;i++) {
			int largest = arr[i][0];
			for(int j = 1; j<arr[i].length;j++) {
				if(arr[i][j] > largest) {
					largest = arr[i][j];
				}
			}
			System.out.println("Largest element in row "+(i+1)+" is: "+largest);
		}
		
	}

}
