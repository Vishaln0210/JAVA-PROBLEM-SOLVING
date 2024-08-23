/******************************************************************************

//Welcome to GDB Online.
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
	    int ans = findlargest(arr, n);
	    System.out.print(ans);
	}
	public static int findlargest(int[] arr, int n){
	    int largest = arr[0];
	    for(int i = 0; i < n; i++){
	        if(arr[i] > largest){
	            largest = arr[i];
	        }
	    }
	    return largest;
	}
}
