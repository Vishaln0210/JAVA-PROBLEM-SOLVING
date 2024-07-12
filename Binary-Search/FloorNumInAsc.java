public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 4;
        int ans = floor(arr, target);
        System.out.println("Answer: " + ans); 
    }


    static int floor(int[] arr, int target) {


        if (target > arr[arr.length-1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            System.out.println("Start: " + start + ", End: " + end + ", Mid: " + mid);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
