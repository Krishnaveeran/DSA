package arrayafter;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = { 7, 2, 3, 0, 4, 5, 12 };
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));

	}

	private static void bubbleSort(int[] ar) {
		// TODO Auto-generated method stub

		for (int i = 1; i < ar.length; i++) {
			boolean swap = false;
			for (int j = 0; j < ar.length - i; j++) {
				if (ar[j] > ar[j + 1]) {
					swap = true;
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
			if (!swap)
				break; // This will help us to reduce time complexity from O(n2) to O(n)
		}
	}

}
