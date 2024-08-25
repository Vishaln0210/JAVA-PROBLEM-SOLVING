import java.util.*;
class Main{
    public static void main(String[] args){
        int arr[] = {123, 34, 5, 6, 5, 5};
        int[] ans = left(arr);
        System.out.print(Arrays.toString(ans));
        
    }
    public static int[] left(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
            if(i == arr.length - 1){
                arr[arr.length - 1] = temp;
                break;
            }
        }
        return arr;
        
    }
}
