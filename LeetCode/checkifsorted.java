import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 7, 9, 20, 1};
        boolean ans = checkifsorted(arr);
        System.out.print(ans);
    }

    public static boolean checkifsorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                ascending = false;
            }
            if (arr[i] > arr[i - 1]) {
                descending = false;
            }
        }

        return ascending || descending;
    }
}
