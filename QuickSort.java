package arrayafter;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 4, 0, -5, 7, 2, 9, 8, 2 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub

		if (low >= high)
			return;

		int s = low;
		int e = high;

		int mid = (s + e) / 2;
		int pivot = arr[mid];

		while (s <= e) {

			while (arr[s] < pivot)
				s++;
			while (arr[e] > pivot)
				e--;

			if (s <= e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}

		quickSort(arr, low, e);
		quickSort(arr, s, high);

	}
}
