import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    int ans = findsecondlargest(arr, n);
	    System.out.print(ans);
	}
	public static int findsecondlargest(int[] arr, int n){
	    int largest = arr[0];
	    for(int i = 0; i < n; i++){
	        if(arr[i] > largest){
	            largest = arr[i];
	        }
	    }
	    int secondlargest = Integer.MIN_VALUE; 
	    for(int i=0; i<n; i++){
	        if(arr[i] != largest && arr[i] > secondlargest){
	            secondlargest = arr[i];
	        }
	    }
	       
	    
	    return secondlargest;
	}
}
