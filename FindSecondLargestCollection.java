package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestCollection {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> output = new ArrayList<Integer>();
		for (Integer Final : data) {
			output.add(Final);
		}
		Collections.sort(output);
		System.out.println(output);
		int size = output.size() - 2;
		System.out.println(size);
		int printElement = output.indexOf(size);
		Integer FinalElement = output.get(size);
		System.out.println("The index of " +size+" is: " + printElement);
		System.out.println("The 2nd element from the last is: " + FinalElement);
	}

}
