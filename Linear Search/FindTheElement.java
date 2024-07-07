class FindTheElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        boolean ans = find(arr);
        System.out.println(ans);
    }

    static boolean find(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                return true;
            }
        }
        return false;
    }
}


//enhanced for loop 
/*for (element : arr) {
    if (element == 4) {
        return true;
    }
}*/