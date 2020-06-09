package HackerrankPractice;

import java.util.Scanner;

public class ArrayReverse {

	public static int[] arrayRevrse(int[] arr,int start,int end) {
		int temp;
		 while (start < end) 
	        { 
	            temp = arr[start];  
	            arr[start] = arr[end]; 
	            arr[end] = temp; 
	            start++; 
	            end--; 
	        }
		
		return arr;
		
	}
	
	static void printArray(int arr[],  
            int size) 
{ 
for (int i = 0; i < size; i++) 
System.out.print(arr[i] + " "); 

System.out.println(); 
}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int start = 0; 
		int end = n-1;
		int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
			arr[i] = s.nextInt();
		}
        
        arrayRevrse(arr, start, end);
        printArray(arr,n);
		
	}

}

// Array Reverse
// new update