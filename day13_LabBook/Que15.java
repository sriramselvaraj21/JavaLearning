package day13_LabBook;

import java.util.Arrays;

public class Que15 {
	public static void main(String[] args) {
		int array[] = new int[5];

		for (int i = 5; i > 0; i--) {
			array[5 - i] = i;
		}

		Arrays.fill(array, 1, 4, 8);

		for (int i = 0; i < 5; i++)
			System.out.println(array[i]);
	}
}
