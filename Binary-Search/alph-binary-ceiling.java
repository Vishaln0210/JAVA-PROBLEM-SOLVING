public class Main {

    public static void main(String[] args) {
        char[] letters = {'d', 'c', 'b', 'a'};
        char target = 'c';
        char result = nextGreatestLetter(letters, target);
        System.out.println("Next greatest letter: " + result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("Start: " + start + ", End: " + end + ", Mid: " + mid + ", letters[Mid]: " + letters[mid]);

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Final Start: " + start + ", Letters Length: " + letters.length);
        return letters[start % letters.length];
    }
}
