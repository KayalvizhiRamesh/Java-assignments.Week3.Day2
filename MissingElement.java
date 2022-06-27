package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public static void main(String arg[]) {
		List<Integer> list = new ArrayList<Integer>(); 
		Collections.addAll(list,1,2,3,4,7,6,8);
		Collections.sort(list);
		System.out.println("List of numbers are" +list);
				
		for(int i=0; i<list.size();i++) {
			Integer integer = list.get(i);
			if(i!=integer) {
				System.out.println("Mising number is: " +integer);
				break;
			}
		
		}
	}

}
