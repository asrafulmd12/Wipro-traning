package assignment_day3;

public class Problem1 {

	public static void main(String[] args) {
		int[] arr = {9,6,1,8,2,7,5,3,4};
//		for(int i = 0;i<arr.length -1;i++) {
//			for(int j = 0;j<arr.length -1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int store = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = store;
//					
//				}
//			}
//		}
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					int store = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = store;
				}
			}
		}	
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
