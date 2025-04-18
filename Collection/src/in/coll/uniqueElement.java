package in.coll;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class uniqueElement {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		  String[] array = {"apple", "banana", "apple", "orange", "banana"};

	        // Convert array to List, then to Set to remove duplicates
	        Set<String> set = new HashSet<>(Arrays.asList(array));

	        // Print the Set
	        System.out.println("Set elements (unique): " + set);
      
	        Integer arr[] = {1,1,2,3,4,5,6,7,8,9,1,2};

	        // Convert array to list, then to set
	        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));

	        // Print the set
	        System.out.println("Unique elements: " + set1);
	        
	}

}
