package assignment_day3;

public class Problem2 {

	public static void main(String[] args) {
		int[] arr = {1,2,1,3,2,4,5};
		int l = arr.length;
		for(int i = 0;i<l;i++) {
			for(int j = i+1;j<l;j++) {
				if(arr[i]==arr[j]) {
					for(int k = j;k<l-1;k++) {
						arr[k] = arr[k+1];
					}
					l--;
					j--;
				}
			}
		}
		for(int i =0;i<l;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
