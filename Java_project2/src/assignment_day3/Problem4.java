package assignment_day3;

public class Problem4 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,2,1};
		boolean ispalindrome = true;
		for(int i = 0; i < arr.length/2;i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				ispalindrome = false;
				break;
			}
		}
		if(ispalindrome) {
			System.out.println("Palindrome array");
		}
		else {
			System.out.println("Not a palindrome array");
		}

	}

}
