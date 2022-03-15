package week3.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int lengthOfArray = arr.length;
		System.out.println(lengthOfArray);
		int count;
		
		for (int i = 0; i < arr.length-1; i++) {
			count = 0;
			for (int j = i; j < arr.length-1; j++) {
				
				if (arr[i] == arr[j+1]) {
					count++;
					System.out.println("Have Duplicates : " + arr[i]);
				}	
			}
		}
	}
}