package io.github.squizziee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ivan Lyango
 * @version 0.4
 */

public abstract class Iter {
	 
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		randomFill(list, 10, 0, 100);
		System.out.println(list);
		reverse(list);
		System.out.println(list);
	}
	
	public static void randomFill(int... arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt();
		}	
	}
	
	public static void randomFill(int[] arr, int start, int bound) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(start, bound + 1);
		}
	}
	
	public static void randomFill(List<Integer> list, int amount) {
		for (int i = 0; i <= amount; i++) {
			list.add(ThreadLocalRandom.current().nextInt());
		}
	}
	
	public static void randomFill(List<Integer> list, int size, int start, int bound) {
		for (int i = 0; i < size; i++) {
			list.add(ThreadLocalRandom.current().nextInt(start, bound + 1));
		}
	}
	
	public static void bubbleSort(int[] arr) {
		int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr [i + 1]) {
                    isSorted = false;
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
	}
	
	private static int partition(int[] arr, int begin, int bound) {
		int b = begin, e = bound;
		int temp;
		int pivot = arr[(begin + bound) / 2];
		while (b <= e) {
			while (arr[b] < pivot) b++;
			while (arr[e] > pivot) e--;
			if (b <= e) {
				temp = arr[b];
				arr[b] = arr[e];
				arr[e] = temp;
				b++;
				e--;
			}
		}
		return b;
	}
	
	private static void doQuickSort(int[] arr, int begin, int bound) {
		int index = partition(arr, begin, bound);
		if (begin < index - 1) doQuickSort(arr, begin, index - 1);
		if (begin < bound) doQuickSort(arr, index, bound);
	}
	
	public static void quickSort(int[] arr) {
		doQuickSort(arr, 0, arr.length - 1);
	}
	
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) minIndex = j;
				if (arr[i] > arr[minIndex]) {
					int temp = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}
			}
		}
	}
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	
	public static boolean isSorted(int[] arr) {
		int[] sortedArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sortedArr);	 
		return Arrays.equals(arr, sortedArr);
    }
	
	public static Object compare(int one, int two) {
		if (one > two) 
			return one;
		else if (one < two) 
			return two;
		else 
			return 0;
	}
	
	public static Object compare(int one, int two, Object oneReturn, Object twoReturn) {
		if (one > two) 
			return oneReturn;
		else if (one < two) 
			return twoReturn;
		else 
			return 0;
	}
	
	public static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}
	
	public static void reverse(List<Integer> list) {
		for (int i = 0; i < list.size() / 2; i++) {
			int temp = list.get(i);
			list.set(i, list.get(list.size() - i - 1));
			list.set(list.size() - i - 1, temp);
		}
	}
	
}