public class Solution {
    public static void nStarTriangle(int n) {
       
        for(int i=0; i<=n; i++){
         int spaces = n-i;
        for(int j=1; j<=spaces; j++){
            System.out.print(" ");
        }
        for(int m=1; m <= 2*i-1; m++){
            System.out.print("*");
        }
        for(int k=1; k<=spaces; k++){
            System.out.print(" ");
        }
        System.out.println();
    }
    }
}
