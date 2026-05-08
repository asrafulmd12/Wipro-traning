package assignment_day3;

public class Problem5 {

	public static void main(String[] args) {
		int[][] arr = {
				{30,40,50},
				{60,70,80},
				{10,20,90}
		};
		int n = arr.length;
		for(int i =0;i<n;i++) {
			for(int j = i;j<n;j++) {
				int store = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = store;
			}
		}
		for(int i =0;i<n;i++) {
			int start = 0;
			int end = n-1;
			while(start<end) {
				int store = arr[i][start];
				arr[i][start]= arr[i][end];
				arr[i][end]= store;
				start++;
				end--;
			}
		}
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
