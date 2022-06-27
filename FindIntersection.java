package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list,3,2,11,4,6,7);
		Collections.addAll(list1,1,2,8,4,9,7);
		System.out.println("List of numbers in first list are" +list);
		System.out.println("List of numbers in second list are" +list1);
				
		for(int i = 0; i<list.size(); i++) {
			
			for(int j =0; j<list1.size(); j++) {
				if(list.get(i) == list1.get(j)) {
					System.out.println("Common values in both the list are: " + list.get(i));
					//list.remove(j);
				}
			}
		}
		
	}	 
}
