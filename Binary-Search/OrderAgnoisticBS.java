public class Main{
    public static void main(String[] args){
        int[] arr = {59, 49, 39, 29, 12, 1, -1, -2, -3 ,-4};
        int target = -3;
        int ans = orderagnoisticBS(arr, target);
        System.out.print(ans);
    }
    static int orderagnoisticBS(int arr[], int target){
        int start = 0; 
        int end = arr.length - 1;
        boolean isAsc = true;
        if(arr[start] > arr[end]){
            isAsc = false;
        }
        
        while(start<=end){
            int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(isAsc){
            if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(!isAsc){
            if(arr[mid] < target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        
            
        }
        
      }
      return -1;
    }
  }
