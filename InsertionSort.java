package arrayafter;

import java.util.Arrays;

public class InsertionSort {
	public static void Insertionsort(int[] ar) {

		for (int i = 1; i < ar.length; i++) {
			for (int j = i; j > 0; j--) {
				if (ar[j] < ar[j - 1]) {
					int temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				} else
					break;
			}
		}

		System.out.println(Arrays.toString(ar));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 2, 8, 1, 0, -1, 5, 6, 3 }; // 1,8,2,5,3 //1,2,8,5,3 //1,2,3,5,8

		Insertionsort(ar);

	}
}
