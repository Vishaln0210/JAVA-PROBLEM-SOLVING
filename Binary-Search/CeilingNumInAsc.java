public class Main {

    public static void main(String[] args) {
        int[] arr = {59, 39, 29, 19};
        int target = 30;
        int ans = ceiling(arr, target);
        System.out.println("Answer: " + ans);
    }
    static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length-1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("Start: " + start + ", End: " + end + ", Mid: " + mid);

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
