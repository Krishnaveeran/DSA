package arrayafter;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j] < ar[minIndex]) {
					minIndex = j;
				}
			}

			int temp = ar[i];
			ar[i] = ar[minIndex];
			ar[minIndex] = temp;
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 2, 8, 1, 5, 3 }; // 1,8,2,5,3 //1,2,8,5,3 //1,2,3,5,8

		selectionSort(ar);

	}

}
