package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		/*
		 * List<Integer> newValue = new ArrayList<Integer>(); 
		 * for (Integer finalValue : arr) {		 * 
		 * newValue.add(finalValue); 
		 * Collections.sort(newValue);
		 * System.out.println(newValue);
		 */
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];

		}
		System.out.println(sum1);
		int sum2=0;
		for(int i=1;i<=8;i++) {
			sum2=sum2+i;
		}
		System.out.println(sum2);
		System.out.println(sum2-sum1);
	}

}
