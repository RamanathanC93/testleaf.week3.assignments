package week3.assignments;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count =0;
		
		String[] splittedText = text.split(" ");
		
		List<String> list = new ArrayList <String>();
		for(int i=0; i <splittedText.length - 1; i++) {
			list.add(splittedText[i]);
		}
		System.out.println("List: "+list);
		
		for (int i=0; i<list.size()-1; i++){
			for (int j = 0; j < list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					count++;
				}
				
				
			}		
	    }
		if(count>1) {
			for (int i = 0; i < list.size()-1; i++) {
				for (int j = i+1; j < list.size(); j++) {
					if(list.get(i).equals(list.get(j)))
					{					
						list.remove(i);
											
					}
				}			
			}	
		}
		
		System.out.println("List without duplicate words: "+list);
	}

}
