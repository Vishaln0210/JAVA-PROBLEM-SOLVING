public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, -8, 7, 4, 0 };
        int ans = min(arr);
        System.out.println(ans);
    }

    static int min(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}
