import java.util.*;
class Main{
    public static void main(String[] args){
        int arr[] = {99, -1, 78, 98};
        int ans = findsecondlargest(arr);
        System.out.print(ans);
    }
    public static int findsecondlargest(int[] arr){
        int secondlargest = Integer.MIN_VALUE;
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
               secondlargest = largest;
               largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] < largest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}
