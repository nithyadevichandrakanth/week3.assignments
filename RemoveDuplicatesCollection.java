package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollection {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		Set<String> newText = new LinkedHashSet<String>();
		for (String eachWord : split) {
			if (eachWord!= " ") {
				newText.add(eachWord);
				

			}
		}
		System.out.println(newText);
		for (String finalOutput : newText) {
			System.out.print(" "+finalOutput+" ");

		}
			
		
		

	}

}
