package in.praveenit.ex;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 10, 30, 20, 40, 30 };

		Arrays.sort(arr); // ascending

		int n = arr.length;
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n; i++) {
			if (i == 0 || arr[i] != arr[i - 1]) {
				temp[j++] = arr[i];
			}
		}

		for (int i = 0; i < j; i++) {
			// Print in descending order
			// for (int i = j - 1; i >= 0; i--) {
			System.out.print(temp[i] + " ");
		}
	}
}
