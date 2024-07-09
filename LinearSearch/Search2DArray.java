import java.util.*;
class Main{
    public static void main(String[] args){
        int arr[][] = {{1, 2, 3}, {5, 7, 8, 9}, {2, 4, 2, 98}};
        int target = 98;
        int[] ans = search2d(arr, target);
        System.out.println(Arrays.toString(ans));
        
}
static int[] search2d(int[][] arr, int target){
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            if(arr[i][j] == target){
                return new int[]{i, j};
            }
        }
        
    }
    return new int[]{-1, -1};
}
    
}
