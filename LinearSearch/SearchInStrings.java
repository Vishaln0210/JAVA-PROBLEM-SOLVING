public class SearchInStrings {
    public static void main(String[] args) {
        String str = "vishal";
        char charfind = 'o';
        boolean ans = searchchar(str, charfind);
        System.out.println(ans);

    }
    static boolean searchchar(String name, char letter) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            char eachletter = name.charAt(i);
            if (eachletter == letter) {
                return true;
            }
        }
        return false;
    }
}
