package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurancesCollection {

	public static void main(String[] args) {
		int[] input = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };

		Map<Integer, Integer> output = new TreeMap<Integer, Integer>();

		for (int intValue : input) {

			if (output.containsKey(intValue)) {
				output.put(intValue, output.get(intValue) + 1);

			} else {
				output.put(intValue, 1);
			}

		}
		System.out.println(output);
	}

}
