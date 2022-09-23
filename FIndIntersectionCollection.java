package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FIndIntersectionCollection {

	public static void main(String[] args) {
		int[] num1 = { 3, 2, 11, 4, 6, 7 };
		int[] num2 = { 1, 2, 8, 4, 9, 7 };

		Set<Integer> newNum1 = new LinkedHashSet<Integer>();
		Set<Integer> newNum2 = new LinkedHashSet<Integer>();

		for (Integer Final1 : num1) {
			newNum1.add(Final1);
			//System.out.println(Final1);
		}

		for (Integer Final2 : num2) {
			newNum2.add(Final2);
			//System.out.println(Final2);

		}
		newNum1.retainAll(newNum2);
		System.out.println(newNum1);

	}
}
