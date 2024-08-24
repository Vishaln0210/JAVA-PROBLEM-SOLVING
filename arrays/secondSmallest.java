import java.util.*;
class Main{
    public static void main(String[] args){
        int arr[] = {23, 45, 12, 65, 76, 87, 98};
        int ans = secondsmallest(arr);
        System.out.print(ans);
    }
    public static int secondsmallest(int[] arr){
        int smallest = arr[0];
        int secondsmallest = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < smallest){
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondsmallest && arr[i] > smallest){
                secondsmallest = arr[i];
                
            }
        }
        return secondsmallest;
    }
}
