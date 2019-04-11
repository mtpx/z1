package zadanie1.zadanie;

import java.util.ArrayList;

public class App {
ArrayList<Integer> inputIntegers = new ArrayList<>();
	
	public ArrayList<Integer> arrayFiltering (ArrayList<Integer> inputIntegers){
		ArrayList<Integer> filteredList = new ArrayList<>();
		for (int i=0; i<inputIntegers.size();i++) {
			if (inputIntegers.get(i)%2==0) {
				filteredList.add(inputIntegers.get(i));
			}
			
		}
		return filteredList;
	}
}
