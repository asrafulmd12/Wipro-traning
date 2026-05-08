package array_pack;

public class Array1 {

	public static void main(String[] args) {
		int[][] a = {{1},{1,2},{1,2,3},{1,2,3,4}};
		for(int i = 0;i < a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
