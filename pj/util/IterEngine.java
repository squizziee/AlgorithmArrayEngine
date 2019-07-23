package util;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author <strong>Ivan Lyango</strong>
 * @version 1.0
 */

public abstract class IterEngine implements Showable {
	
	/**
	 * <p>
	 * A method that fills selected array with
	 * certain amount of randomly generated Integer numbers. 
	 * It generates absolutely random numbers 
	 * without any confines.
	 * </p>
	 * 
	 * @param arr - an array to work with
	 */
	
	public static void randomFill(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] = ThreadLocalRandom.current().nextInt();
		}
	}
	
	/**
	 * <p>
	 * A method that fills selected list with
	 * certain amount of randomly generated Integer numbers. 
	 * It generates absolutely random numbers 
	 * without any confines.
	 * </p>
	 * 
	 * @param list - a list to work with
	 * @param size - an amount of numbers that will be generated
	 */
	
	public static void randomFill(List<Integer> list, int size) {
		for (int i = 0; i < size; i++) {
			list.add(ThreadLocalRandom.current().nextInt());
		}
	}
	
	/**
	 * <p>
	 * A method that fills selected list with
	 * certain amount of randomly generated Integer numbers. 
	 * It generates random numbers from 0 (non-inclusive)
	 * to the end parameter (inclusive). 
	 * </p>
	 * 
	 * @param arr - an array to work with
	 * @param end - biggest possible number to generate
	 */
	
	public static void randomFill(int[] arr, int end) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] = ThreadLocalRandom.current().nextInt(0, end + 1);
		}
	}
	
	/**
	 * <p>
	 * A method that fills selected list with
	 * certain amount of randomly generated Integer numbers. 
	 * It generates random numbers from 0 (non-inclusive)
	 * to the end parameter (inclusive). 
	 * </p>
	 * 
	 * @param list - a list to work with
	 * @param size - an amount of numbers that will be generated
	 * @param end - biggest possible number to generate
	 */
	
	public static void randomFill(List<Integer> list, int size, int end) {
		for (int i = 0; i < size; i++) {
			list.add(ThreadLocalRandom.current().nextInt(0, end + 1));
		}
	}
	
	/**
	 * <p>
	 * A method that fills selected array with
	 * certain amount of randomly generated Integer numbers. 
	 * It generates random numbers from start parameter (non-inclusive)
	 * to the end parameter (inclusive). 
	 * </p>
	 * 
	 * @param arr - an array to work with
	 * @param start - smallest possible number to generate
	 * @param end - biggest possible number to generate
	 */
	
	public static void randomFill(int[] arr, int start, int end) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(start, end + 1);
		}
	}
	
	/**
	 * <p>
	 * A method that fills selected list with
	 * certain amount of randomly generated Integer numbers. 
	 * It generates random numbers from start parameter (non-inclusive)
	 * to the end parameter (inclusive). 
	 * </p>
	 * 
	 * @param list - a list to work with
	 * @param size - an amount of numbers that will be generated
	 * @param start - smallest possible number to generate
	 * @param end - biggest possible number to generate
	 */
	
	public static void randomFill(List<Integer> list, int size, int start, int end) {
		for (int i = 0; i < size; i++) {
			list.add(ThreadLocalRandom.current().nextInt(start, end + 1));
		}
	}
	
	/**
	 * <p>
	 * Classical bubble sort algorithm, slow and
	 * inefficient, as always.
	 * </p>
	 * 
	 * @param arr - an array to work with
	 */
	
	public static void bubbleSort(int[] arr) {
		int temp;
		boolean isSorted = false;
		while (!isSorted) { 	
		    isSorted = true;
		    for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr [i+1]) {
			    isSorted = false;
			    temp = arr[i+1];
			    arr[i+1] = arr[i];
			    arr[i] = temp;
			}
		    }  
		}
	}
	
	/**
	 * <p>
	 * Divides an array into smaller parts in
	 * the left and right from pivot and swaps 
	 * numbers if they are not on their places
	 * </p>
	 * 
	 * @see IterEngine#quickSort()
	 * 
	 * @param arr - an array to work with
	 * @param begin - start point of array
	 * @param end - end point of array
	 * @return - 
	 */
	
	private static int partition(int[] arr, int begin, int end) {
		
		int b = begin, e = end;
		int temp;
		int pivot = arr[(begin + end) / 2];
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
	
	private static void doQuickSort(int[] arr, int begin, int end) {
		int index = partition(arr, begin, end);
		if (begin < index - 1) doQuickSort(arr, begin, index - 1);
		if (begin < end) doQuickSort(arr, index, end);
	}
	
	public static void quickSort(int[] arr) {
		doQuickSort(arr, 0, arr.length - 1);
	}
	
	/**
	 * <p>
	 * Private class method that returns array sort status.
	 * </p>
	 * 
	 * @see IterEngine#getInfo()
	 * 
	 * @param arr - an array to work with
	 * @return - String "Sorted" if array is already sorted, otherwise "Not sorted"
	 */
	
	private static String isSorted(int[] arr) {
		int[] sortedArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sortedArr);	 
		return Arrays.equals(arr, sortedArr) ? "Sorted" : "Not sorted";
    }
	
	/**
	 * <p>
	 * Private class method that returns a length of array
	 * </p>
	 * 
	 * @see IterEngine#getInfo()
	 * 
	 * @param arr - an array to work with
	 * @return - length of array (or amount of elements in array)
	 */
	
	private static int getNumberOfElements(int[] arr) {
		return arr.length;
	}
	
	/**
	 * <p>
	 * Private class method that returns maximal value in array
	 * </p>
	 * 
	 * @see IterEngine#getInfo()
	 * 
	 * @param arr - an array to work with
	 * @return - maximal value in array
	 */
	
	private static int max(int[] arr) {
		List<Integer> listOfIntegers = new ArrayList<>();
		for (Integer num : arr) {
			listOfIntegers.add(num);
		}
		 
		return Collections.max(listOfIntegers);
	}
	 
	/**
	 * <p>
	 * Private class method that returns minimal value in array
	 * </p>
	 * 
	 * @see IterEngine#getInfo()
	 * 
	 * @param arr - an array to work with
	 * @return - minimal value in array
	 */
	
	private static int min(int[] arr) {
		List<Integer> listOfIntegers = new ArrayList<>();
		for (Integer num : arr) {
			listOfIntegers.add(num);
		}
		 
		return Collections.min(listOfIntegers);
	}

	/**
	 * <p>
	 * Compares two Integers and returns the biggest
	 * one.
	 * </p>
	 * @param one - first Integer to compare
	 * @param two - second Integer to compare
	 * @return - biggest value of arguments
	 */
	
	public static Object compare(int one, int two) {
		return one > two ? one : one == two ? 0 : two;
	}
	
	/**
	 * <p>
	 * Compares two Integers and returns the 
	 * certain result selected in arguments according
	 * to result of comparison.
	 * </p>
	 * @param one - first Integer to compare
	 * @param two - second Integer to compare
	 * @param oneReturn - r
	 * @param twoReturn
	 * @return - if the first Integer is the biggest oneReturn,
	 * if second one is bigger twoReturn, otherwise 0;
	 */
	
	public static Object compare(int one, int two, Object oneReturn, Object twoReturn) {
		return one > two ? oneReturn : one == two ? 0 : twoReturn;
	}
	
	/**
	 * <p>
	 * Works as System.out.print(Object object), made
	 * to save time during writing code
	 * </p>
	 * @param obj - something that will be printed ( all in Java is an Object )
	 */
	
	public static void show(Object obj) {
		System.out.print(obj);
	}
	
	/**
	 * <p>
	 * Works as System.out.println(Object object), made
	 * to save time during writing code
	 * </p>
	 * @param obj - something that will be printed ( all in Java is an Object )
	 */
	
	public static void showln(Object obj) {
		System.out.println(obj);
	}
	
	/**
	 * <p>
	 * Works as System.out.println(), made
	 * to save time during writing code
	 * </p>
	 */
	
	public static void showln() {
		System.out.println();
	}
	
	public static void showArray(int... arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * <p>
	 * Gathers information about array from private class methods.
	 * </p>
	 * 
	 * @see IterEngine#isSorted()
	 * @see IterEngine#getNumberOfElements()
	 * @see IterEngine#max()
	 * @see IterEngine#min()
	 * 
	 * @param arr - an array to work with
	 */
	
	public static void showInfo(int[] arr) {
		System.out.println("Array : " + Arrays.toString(arr));
		System.out.println("Status : " + IterEngine.isSorted(arr));
		System.out.println("Number of elements : " + IterEngine.getNumberOfElements(arr));
		System.out.println("Biggest element : " + IterEngine.max(arr));
		System.out.println("Smallest element : " + IterEngine.min(arr));
	 }
}
