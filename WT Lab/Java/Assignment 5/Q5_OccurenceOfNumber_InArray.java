// 5. Find the no. of occurrence of each element in an user entered list of nos.

import java.util.Scanner;

public class Q5_OccurenceOfNumber_InArray {  
    public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of list: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter " + size + " integers: ");
		for (int i=0; i<size; i++) 
			arr[i] = sc.nextInt();

        int [] freq = new int [size];  
        int checked = -1;  
        for(int i = 0; i < size; i++){  
            int count = 1;  
            for(int j = i+1; j < size; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    freq[j] = checked;  
                }  
            }  
            if(freq[i] != checked)  
                freq[i] = count;  
        }  
  
        System.out.println("Element | Frequency");  
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != checked)  
                System.out.println("    " + arr[i] + "    |    " + freq[i]);  
        }   
    }}  