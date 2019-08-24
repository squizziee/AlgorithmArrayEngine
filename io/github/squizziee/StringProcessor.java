package io.github.squizziee;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StringProcessor {

	public static String reverse(String str) {
		List<String> list = new LinkedList<>(Arrays.asList(str.split("")));
		StringBuilder result = new StringBuilder();
		ListIterator<String> it = list.listIterator(list.size());
		while (it.hasPrevious())
			result.append(it.previous());
		return result.toString();
	}
	
	public static boolean isPalindrome(String str, boolean caseSensitive) {
		String processString;
		if (caseSensitive)
			processString = str;
		else
			processString = str.toLowerCase();
		if (processString.length() == 0)
			return false;
		else if (processString.length() == 1)
			return true;
		else {
			if (processString.substring(0, 1).equals(processString.substring(processString.length() - 1))) {
				if (processString.length() == 2)
					return true;
				return isPalindrome(processString.substring(1, processString.length() - 1), caseSensitive);
			} else {
				return false;
			}
		}
	
}
