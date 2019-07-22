package util;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author <strong>Ivan Lyango</strong>
 * @version 1.0
 */

public abstract class Sorter implements Showable{
	
	/**
	 * <p>
	 * A method that fills selected array with
	 * randomly generated Integer numbers. Main method
	 * generate4s absolutely random numbers without any
	 * confines.
	 * </p>
	 * 
	 * @param arr - an array to work with
	 */
	
	public static void randomFill(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] = ThreadLocalRandom.current().nextInt();;
		}
		
	}
	
	/**
	 * <p>
	 * First overloaded method generates numbers in
	 * range from 0 to end parameter.
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
	 * Second overloaded method generates numbers in
	 * range from start parameter to end parameter.
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
	
	private static void doQuickSort(int[] arr, int begin, int end) {
		
	}
	
	public static void quickSort(int[] arr) {
		doQuickSort(arr, 0, arr.length - 1);
	}
	
	/**
	 * <p>
	 * Private class method that returns array sort status.
	 * </p>
	 * 
	 * @see Sorter#getInfo()
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
	 * @see Sorter#getInfo()
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
	 * @see Sorter#getInfo()
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
	 * @see Sorter#getInfo()
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
	
	public static int compare(int one, int two) {
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
	
	public static int compare(int one, int two, int oneReturn, int twoReturn) {
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
	 * @see Sorter#isSorted()
	 * @see Sorter#getNumberOfElements()
	 * @see Sorter#max()
	 * @see Sorter#min()
	 * 
	 * @param arr - an array to work with
	 */
	
	public static void showInfo(int[] arr) {
		System.out.println("Array : " + Arrays.toString(arr));
		System.out.println("Status : " + Sorter.isSorted(arr));
		System.out.println("Number of elements : " + Sorter.getNumberOfElements(arr));
		System.out.println("Biggest element : " + Sorter.max(arr));
		System.out.println("Smallest element : " + Sorter.min(arr));
	 }
}